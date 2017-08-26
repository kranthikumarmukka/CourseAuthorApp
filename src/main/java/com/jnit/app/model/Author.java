package com.jnit.app.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity
public class Author implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long authorId;
	private String authorName;
	private String authorCity;
	public Long getAuthorId() {
		return authorId;
	}
	public void setAuthorId(Long authorId) {
		this.authorId = authorId;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getAuthorCity() {
		return authorCity;
	}
	public void setAuthorCity(String authorCity) {
		this.authorCity = authorCity;
	}
	
	@ManyToMany(fetch = FetchType.LAZY,cascade =
        {
                CascadeType.DETACH,
                CascadeType.MERGE,
                CascadeType.REFRESH,
                CascadeType.PERSIST
        }, targetEntity=Course.class)
	@JoinTable(name = "Course_Author", joinColumns = {
			@JoinColumn(name = "authorId", nullable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "courseId", nullable = false) 
	})	
	private List<Course> courses = new ArrayList<>();
	

}

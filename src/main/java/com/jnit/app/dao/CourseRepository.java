package com.jnit.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jnit.app.model.Course;


public interface CourseRepository extends JpaRepository<Course, Long>{

}

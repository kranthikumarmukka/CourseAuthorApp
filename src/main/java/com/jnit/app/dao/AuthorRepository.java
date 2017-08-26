package com.jnit.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jnit.app.model.Author;


public interface AuthorRepository extends JpaRepository<Author, Long>{

}


package com.jnit.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jnit.app.dao.AuthorRepository;
import com.jnit.app.model.Author;


@Service
public class AuthorService {
	
	@Autowired
	private AuthorRepository authorRepository;
	
	public Author createAuthor(Author author) throws Exception{
		return authorRepository.save(author);
	}

	public Author updateAuthor(Author author) throws Exception{
		return authorRepository.save(author);
	}

	public void deleteAuthor(Long authorId) throws Exception{
		authorRepository.delete(authorId);
	}

	public List<Author> getAllAuthors() throws Exception{
		return authorRepository.findAll();
	}
	
	public Author getAuthorById(Long authorId)throws Exception{
		return authorRepository.findOne(authorId);
	}

}

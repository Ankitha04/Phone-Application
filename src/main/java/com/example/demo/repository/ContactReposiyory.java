package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Contact;

public interface ContactReposiyory extends CrudRepository<Contact, Integer>{
	Contact findById(int id);
	List<Contact> findAll();
	void deleteById(int id);
	
}

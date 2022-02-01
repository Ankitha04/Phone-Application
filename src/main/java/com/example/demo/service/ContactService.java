package com.example.demo.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Contact;
import com.example.demo.repository.ContactReposiyory;

public class ContactService {
	
	@Autowired
	private ContactReposiyory contactRepository;
	

	public void addContact(@Valid Contact contact) {
		contactRepository.save(contact);
	}

}

package com.developer.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.developer.model.Contact;

@RestController
@RequestMapping("/api")
public class AddressBookResource {
	
	ConcurrentMap<String,Contact> contacts=new ConcurrentHashMap<>();
	
	
	//get one contacts
	@GetMapping("/{id}")
	public Contact getContact(@PathVariable String id){
		return (Contact) contacts.get(id);
		
	}
	
	//get All contacts
	@GetMapping("/")
	public List<Contact> getAllContacts(){
		return new ArrayList<Contact>(contacts.values());
		
	}
	
	//create new
	@PostMapping("/")
	public Contact addContact(@RequestBody Contact contact){
		contacts.put(contact.getId(), contact);
		return (Contact)contact;
		
	}
	

}

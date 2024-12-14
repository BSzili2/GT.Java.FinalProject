package com.DigitalNation.GT.service;

import com.DigitalNation.GT.model.Contact;
import com.DigitalNation.GT.repository.ContactRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
	@Autowired 
    private  ContactRepository contactRepository;

   
    public void saveContact(Contact contact) { 
    	contactRepository.save(contact); 
    	}
}

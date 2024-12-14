package com.DigitalNation.GT.controller; 

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Controller; 
import org.springframework.ui.Model; 
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ModelAttribute; 
import com.DigitalNation.GT.model.Contact; 
import com.DigitalNation.GT.service.ContactService; 


@Controller 
public class ContactController { 

	@Autowired 
	private ContactService contactService; 

	@GetMapping("/contact") 
	public String showContactForm(Model model) { 
	model.addAttribute("contactForm", new Contact()); 
	return "contact"; 
} 

	@PostMapping("/contact/send")
    public String handleFormSubmission(
        @RequestParam String name,
        @RequestParam String email,
        @RequestParam String message
    ) {
        
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Message: " + message);

        return "redirect:/contact"; 
    }
}
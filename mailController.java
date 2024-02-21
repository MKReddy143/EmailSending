package com.java.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.Model.mailStructure;
import com.java.Service.mailService;

@RestController
@RequestMapping("/mail")
public class mailController {
	@Autowired
	private mailService mailservice;

	public ResponseEntity<String> SendMail(@PathVariable String mail, @RequestBody mailStructure ms) {

		mailservice.SendMail(mail, ms);
		return new ResponseEntity<String>("Mail Sent SucceessFully!!", HttpStatus.OK);

	}

}

package com.java.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import com.java.Model.mailStructure;

public class mailService {
	@Autowired
	private JavaMailSender jms;

	@Value("$(spring.mail.username)")
	private String fromMail;

	public void SendMail(String mail, mailStructure ms) {
		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
		simpleMailMessage.setSubject(ms.getSub());
		simpleMailMessage.setText(ms.getMsg());
		simpleMailMessage.setFrom(fromMail);
		simpleMailMessage.setTo(mail);
		jms.send(simpleMailMessage);
	}

}

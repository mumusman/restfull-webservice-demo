package com.example.restwebservices.restfullwebservicedemo;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InterNationalizationController {

	@Autowired
	private MessageSource messagesource;
	
	@GetMapping(path ="/internationalization")
	public String internationalization(@RequestHeader(name="Accept-Language", required=false) Locale locale)
	{
		return messagesource.getMessage("good.morning.message",null, locale); // insted of accepting Locale in parameter you can you user
																			// "LocalContextHolder.getlocale()" eg. messagesource.getMessage("good.morning.message",null, ocalContextHolder.getlocale());
																			//then you have to change SessionLocaleResolver to with AcceptHaderLocaleResolver in bean configuration
	}
}
 
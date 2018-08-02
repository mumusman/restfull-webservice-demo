package com.example.restwebservices.restfullwebservicedemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.*;

import com.example.restwebservices.restfullwebservicedemo.user.User;

@RestController
public class HelloWordController {

	
	
	@GetMapping(path="/hello")
	public String helloWord()
	{
		return "Hellow Word";
	}
	
	@GetMapping(path="/hello2")
	public User helloWordbean()
	{
		return new User("usman");
	}
	
	@GetMapping(path="/hello/{name}")
	public User helloWordbeanpathvariable(@PathVariable String name)
	{
		return new User(name);
	}
}

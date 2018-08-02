package com.example.restwebservices.restfullwebservicedemo;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.restwebservices.restfullwebservicedemo.user.User;
import com.example.restwebservices.restfullwebservicedemo.user.UserDaoService;

@RestController
public class UserController {

	@Autowired
	private UserDaoService userservice;
	
	@GetMapping(path ="/users")
	public List<User> getallUsers()
	{
		return userservice.findall();
	}
	
	@GetMapping(path ="/users/user/{id}")
	public Resource<User> retriveuser(@PathVariable Integer id)
	{
		User user= userservice.findone(id);
		if(user==null)
		{
			throw new UserNotFoundException("ID : "+id);
		}
		
		//all user , server_path + ""
		
		Resource<User> resource =new Resource<User>(user);
		
		ControllerLinkBuilder linkto = linkTo(methodOn(this.getClass()).getallUsers());
		
		resource.add(linkto.withRel("all-user"));
		
		
		//HATEOAS
		
		
		return resource;
	}
	
	@PostMapping(path ="/users/user")
	public ResponseEntity<Object> adduser(@Valid @RequestBody User user)
	{
	    User adeduser=userservice.adduser(user);
	    
	    URI location = ServletUriComponentsBuilder
	    .fromCurrentRequest()
	    .path("/{id}")
	    .buildAndExpand(adeduser.getId()).toUri();
	    
	    
	    
	    return ResponseEntity.created(location).build();
	    
	}
	
	@DeleteMapping(path="/users/user/{id}")
	public void deleteuser(@PathVariable Integer id)
	{
		User user= userservice.deleteById(id);
		if(user==null)
		{
			throw new UserNotFoundException("ID : "+id);
		}
	}
}

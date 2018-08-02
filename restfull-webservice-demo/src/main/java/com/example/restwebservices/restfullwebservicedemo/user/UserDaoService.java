package com.example.restwebservices.restfullwebservicedemo.user;

import java.util.*;

import org.springframework.stereotype.Component;

@Component 
public class UserDaoService {

	private static List<User> users = new ArrayList<User>();
	static {
		users.add(new User(1,"usman",25,new Date()));
		users.add(new User(2,"geta",34,new Date()));
		users.add(new User(3,"tarun",25,new Date()));
		
	}
	
	public List<User> findall()
	{
		return users;
	}
	public User adduser(User user)
	{
		users.add(user);
		return user;
	}
	
	public User findone(int id)
	{
		for(User user:users)
		{
			if(user.getId()==id)
			{
				return user;
			}
		}
		return null;
	}
	public User deleteById(int id)
	{
		Iterator<User> iterator = users.iterator();
		
		while(iterator.hasNext())
		{
			User user = iterator.next();
			if(user.getId()==id)
			{
				iterator.remove();
				return user;
			}
		}
		return null;
	}
	
}

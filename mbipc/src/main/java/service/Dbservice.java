package service;

import java.util.ArrayList;
import java.util.List;

import entity.User;

public class Dbservice {
	
	static List<User> UserList = new ArrayList<User>();
	
	public Dbservice() {
		System.out.println("DbService instance created.");
		UserList.add(new User("wan","123456","wan@gmail.com"));
	
	}
	
	public void addUser(User user) {
		UserList.add(user);
	}
	
	public List<User> getUser(){
		return UserList;
	}

}

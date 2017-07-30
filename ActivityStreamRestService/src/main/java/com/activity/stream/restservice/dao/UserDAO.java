package com.activity.stream.restservice.dao;

import java.util.List;

import com.activity.stream.restservice.model.User;

public interface UserDAO {
	
	public boolean registerUser(User user);
	public List<User> getUsers();
	public boolean update(User user);
	public void delete(int id);
    public User findById(int id);

}

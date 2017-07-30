package com.activity.stream.restservice.daoimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.activity.stream.restservice.dao.UserDAO;
import com.activity.stream.restservice.model.User;

@Repository(value = "userdao")
@Component
@Service
public class UserDAOImpl implements UserDAO {

	static List<User> users = new ArrayList<>();
	private static final AtomicInteger counter = new AtomicInteger();

	
	public boolean registerUser(User user) {
		user.setUid(counter.incrementAndGet());
		users.add(user);
		if (!users.isEmpty()) {
			return true;
		}
		return false;
	}

	
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return users;
	}

	
	public boolean update(User user) {
		// TODO Auto-generated method stub
		int index = users.indexOf(user);
		users.set(index, user);
		return true;
	}

	
	public void delete(int id) {
		// TODO Auto-generated method stub
		User user = findById(id);
		users.remove(user);
	}

	
	public User findById(int id) {
		// TODO Auto-generated method stub
		for (User user : users) {
			if (user.getUid() == id) {
				return user;
			}
		}
		return null;
	}

}

package com.apex.user.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apex.user.dao.UserDAO;
import com.apex.user.vo.User;
@Service
public class UserBoimpl implements UserBO {
	@Autowired
	UserDAO userDAO;
	
	public void addUser(User user) {
		System.out.println("UserBoimpl :addUser--start");
		//daologic
		userDAO.addUser(user);
		System.out.println("UserBoimpl :addUser-- daoligic");
		
		System.out.println("UserBoimpl :addUser--exit");

	}

	public User getUser(User user) {
	
		return new User();
	}

	public void updateUser(User user) {
		

	}

	public void deleteUser(User user) {
		

	}

}

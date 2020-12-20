package com.apex.user.dao;

import javax.sql.DataSource;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.apex.user.util.Hibernateutil;
import com.apex.user.vo.User;

@Repository
public class UserDAOimpl implements UserDAO {
//	private DataSource dataSource;
	/*
	 * @Autowired private JdbcTemplate jdbcTemplate;
	 */

	@Override
	public void addUser(User user) {
		
		Session session = Hibernateutil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		session.save(user);
		transaction.commit();
		/*
		 * System.out.println("UserDAOimpl :addUser--start"); // dblogic
		 * System.out.println("UserDAOimpl :addUser-- dblogic"); Object[] oa = new
		 * Object[3]; oa[0] = user.getFirstName(); oa[1] = user.getLastName(); oa[2] =
		 * user.getMiddleName();
		 * 
		 * this.jdbcTemplate.update("INSERT INTO usr(firstname, lastname, middlename)" +
		 * " VALUES  (?,?,?)", oa); System.out.println("UserDAOimpl :addUser--exit");
		 */
	}

	@Override
	public User getUser(User user) {

		return null;
	}

	@Override
	public void updateUser(User user) {

	}

	@Override
	public void deleteUser(User user) {

	}

}

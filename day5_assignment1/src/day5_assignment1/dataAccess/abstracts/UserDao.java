package day5_assignment1.dataAccess.abstracts;

import java.util.ArrayList;

import day5_assignment1.entities.concretes.User;

public interface UserDao {

	void add(User user);
	void delete(User user);
	ArrayList<User> getAll();
}

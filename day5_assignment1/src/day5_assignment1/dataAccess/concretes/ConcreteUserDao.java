package day5_assignment1.dataAccess.concretes;

import java.util.ArrayList;

import day5_assignment1.dataAccess.abstracts.UserDao;
import day5_assignment1.entities.concretes.User;

public class ConcreteUserDao implements UserDao {

	private ArrayList<User> userList = new ArrayList<User>();

	@Override
	public void add(User user) {

		userList.add(user);
		System.out.println("Kullanici eklendi: " + user.toString());

	}

	@Override
	public void delete(User user) {
		userList.remove(user);
		System.out.println("Kullanici veritabanindan silindi");

	}

	@Override
	public ArrayList<User> getAll() {
		return userList;
	}

}

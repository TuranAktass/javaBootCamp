package day5_assignment1.business.abstracts;

import day5_assignment1.entities.concretes.User;

public interface UserService {

	void register(User user);
	void login(String e_mail, String password);
	void validateUser(User user);
}

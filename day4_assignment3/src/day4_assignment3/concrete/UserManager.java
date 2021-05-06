package day4_assignment3.concrete;

import day4_assignment3.abstracts.UserService;
import day4_assignment3.abstracts.UserValidationService;
import day4_assignment3.entities.User;

public class UserManager implements UserService {

	private UserValidationService userValidationService;

	public UserManager(UserValidationService userValidationService) {
		this.userValidationService = userValidationService;
	}

	@Override
	public void add(User user) {
		if (!userValidationService.checkIfRealPerson(user)) {
			System.out.println("invalid user: " + user.getFirstName());
		} else {
			System.out.println("user added : " + user.getFirstName());
		}
	}

	@Override
	public void delete(User user) {
		System.out.println("user deleted: " + user.getFirstName());
	}

	@Override
	public void update(User user) {
		
		if (!userValidationService.checkIfRealPerson(user)) {
			System.out.println("user update failed (invalid user): " + user.getFirstName());
		} else {
			System.out.println("user updated to: " + user.getFirstName());
		}

	}

}

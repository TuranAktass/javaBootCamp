package day5_assignment1;

import day5_assignment1.business.abstracts.UserService;
import day5_assignment1.business.concretes.UserManager;
import day5_assignment1.dataAccess.concretes.ConcreteUserDao;
import day5_assignment1.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user1 = new User("turan","aktas","asdasd@gmail.com","123451");
		User user2 = new User("turan","aktas","asdasd@gmail.com","123451");
		User user3 = new User("turan","aktas","asdasdasdasdgmail","123451");
		
		UserService uManager = new UserManager(new ConcreteUserDao());
		
		uManager.register(user1);
		uManager.validateUser(user1);
		
		uManager.register(user2);
		
		uManager.register(user3);
		
		uManager.login("asdasd@gmail.com", "123451");
		

	}

}

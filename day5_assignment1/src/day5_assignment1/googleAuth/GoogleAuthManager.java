package day5_assignment1.googleAuth;

import day5_assignment1.business.abstracts.UserService;
import day5_assignment1.entities.concretes.User;

public class GoogleAuthManager implements UserService{
	
	@Override
	public void register(User user) {
		System.out.println("Google hesabi ile uye olundu: " + user.getE_mail());
	}

	@Override
	public void login(String e_mail, String password) {
		System.out.println("Google hesabi ile giris yapildi!");
		
	}

	@Override
	public void validateUser(User user) {
		System.out.println("Hesap dogrulamasi basarili!");
		
	}
	
	
}

package day4_assignment3.concrete;

import day4_assignment3.abstracts.SaleService;
import day4_assignment3.entities.Campaign;
import day4_assignment3.entities.Game;
import day4_assignment3.entities.User;

public class SaleManager implements SaleService{

	@Override
	public void sale(Game game, User user) {
		System.out.println("Thank you for your purchase: (" + game.getName() + " -> " + user.getFirstName() +")");
		System.out.println("Cost: " + game.getPrice());
		
	}

	@Override
	public void campaignSale(Game game, User user, Campaign campaign) {
			double price = (game.getPrice() - (game.getPrice() *  campaign.getDiscountRate()));
			System.out.println("Thank you for your purchase: (" + game.getName() + " -> " + user.getFirstName());
			System.out.println("Cost: " + price);
	}
	
	

}

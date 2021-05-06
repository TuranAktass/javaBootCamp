package day4_assignment3;

import java.time.LocalDate;

import day4_assignment3.adapters.MernisServiceAdapter;
import day4_assignment3.concrete.*;
import day4_assignment3.entities.*;

public class Main {

	public static void main(String args[]) {
		
		Game forzaHorizon = new Game(100,"Forza Horizon","Microsoft" , 92.0);
		Game game1 = new Game(100,"Game1","Publisher1" , 200.0);
		User user1 = new User(0,"Turan","Aktaþ","17557281646", LocalDate.of(1999,6,30));
		Campaign summerSale = new Campaign(1000,"Summer Sale" , 0.75);
		
		GameManager gManager = new GameManager();
		UserManager uManager = new UserManager(new MernisServiceAdapter());
		SaleManager sManager = new SaleManager();
		CampaignManager cManager = new CampaignManager();
		
		//operations
		cManager.add(summerSale);
		
		uManager.add(user1);
		
		gManager.add(forzaHorizon);
		gManager.add(game1);
		
		//sales
		sManager.campaignSale(game1, user1, summerSale);
		sManager.sale(game1, user1);
		
		//update operations
		cManager.update(summerSale);
		uManager.update(user1);
		gManager.update(game1);
		
		//delete
		cManager.delete(summerSale);
		uManager.delete(user1);
		gManager.delete(game1);
		
		
		
		
		
	}
}

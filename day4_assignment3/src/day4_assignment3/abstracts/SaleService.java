package day4_assignment3.abstracts;

import day4_assignment3.entities.Campaign;
import day4_assignment3.entities.Game;
import day4_assignment3.entities.User;

public interface SaleService {

	void sale(Game game, User user);

	void campaignSale(Game game, User user, Campaign campaign);
}

package day4_assignment3.concrete;

import day4_assignment3.abstracts.CampaignService;
import day4_assignment3.entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("New campaign added: " + campaign.getName());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Campaign deleted: " + campaign.getName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Campaign updated: " + campaign.getName());
		
	}

}

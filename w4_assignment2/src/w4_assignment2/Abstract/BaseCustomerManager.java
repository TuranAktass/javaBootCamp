package w4_assignment2.Abstract;

import w4_assignment2.Entities.Customer;

public class BaseCustomerManager implements CustomerService {

	public void save(Customer customer) {
		System.out.println("Saved to database");
	}

}

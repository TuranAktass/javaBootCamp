package w4_assignment2.Concrete;
import w4_assignment2.Abstract.*;
import w4_assignment2.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	@Override	
	public void save(Customer customer) {
		if (this.customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
			
		}else {
			System.out.println("not a valid person");
		}
	}

}

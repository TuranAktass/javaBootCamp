package w4_assignment2.Concrete;
import w4_assignment2.Abstract.*;
import w4_assignment2.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
		
	}



	
}

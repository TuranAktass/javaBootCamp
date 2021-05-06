package w4_assignment2;

import w4_assignment2.Entities.*;
import w4_assignment2.Adapters.*;
import w4_assignment2.Concrete.*;

import java.time.LocalDate;

import w4_assignment2.Abstract.*;

public class Main {
public static void main(String[] args) {
		LocalDate dateOfBirth = LocalDate.of(1999, 6, 30);
		
		Customer customerStarbucks = new Customer(
				0,
				"Turan",
				"Aktaþ",
				dateOfBirth,
				"17557281646"
				);

		
		BaseCustomerManager baseCustomerManager1 = new StarbucksCustomerManager(new MernisWebServiceAdapter());
		baseCustomerManager1.save(customerStarbucks);
		
		
		Customer customerNero = new Customer(0,"customer", "nero", dateOfBirth, "1685764312");

		
		BaseCustomerManager baseCustomerManager2 = new NeroCustomerManager();
		baseCustomerManager2.save(customerNero);
		
		
		
	}
}

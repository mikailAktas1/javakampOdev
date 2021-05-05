package javakampOdev.Abstract;

import javakampOdev.Entities.Customer;

public class BaseCustomerManager  implements CustomerService {

	@Override
	public void Save(Customer customer) {
		
		System.out.println("save to db : " + customer.getFirstName());
	}

}

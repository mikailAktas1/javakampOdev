package javakampOdev.Concrete;

import javakampOdev.Abstract.CustomerCheckService;
import javakampOdev.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {


	public boolean CheckIfRealPerson(Customer customer) {
		return true;
	}

}

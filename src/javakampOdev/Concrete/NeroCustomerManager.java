package javakampOdev.Concrete;

import javakampOdev.Abstract.BaseCustomerManager;
import javakampOdev.Abstract.CustomerCheckService;
import javakampOdev.Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {

	private CustomerCheckManager CustomerCheckManager;

	public NeroCustomerManager(CustomerCheckManager customerCheckManager) {
		this.CustomerCheckManager = customerCheckManager;
	}
	
 
}

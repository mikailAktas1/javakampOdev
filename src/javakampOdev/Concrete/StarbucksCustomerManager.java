package javakampOdev.Concrete;

import javakampOdev.Abstract.BaseCustomerManager;
import javakampOdev.Abstract.CustomerCheckService;
import javakampOdev.Entities.Customer;



public class StarbucksCustomerManager extends BaseCustomerManager {
	
	
	private CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	@Override
	public void Save(Customer customer) {
		if (customerCheckService.CheckIfRealPerson(customer)) {
			super.Save(customer);
		} else {
			throw new ArithmeticException("Not a valid person.");
		}
	}
	
	
	
	}
	

	

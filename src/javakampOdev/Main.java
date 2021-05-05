package javakampOdev;

import java.time.LocalDate;

import javakampOdev.Abstract.BaseCustomerManager;
import javakampOdev.Adapters.MernisServiceAdapter;
import javakampOdev.Concrete.CustomerCheckManager;
import javakampOdev.Concrete.NeroCustomerManager;
import javakampOdev.Concrete.StarbucksCustomerManager;
import javakampOdev.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManagerStarbucks = new StarbucksCustomerManager(new MernisServiceAdapter()); 
		BaseCustomerManager customerManagerNero = new NeroCustomerManager(new CustomerCheckManager());
		
		Customer customerStarbucks = new Customer();
		customerStarbucks.setId(1);;
		customerStarbucks.setFirstName("Mikail");
		customerStarbucks.setLastName("Aktas");
		customerStarbucks.setNationalyId("31211144726");
		customerStarbucks.setDateOfBirth(LocalDate.of(1987, 5, 11));
		customerManagerStarbucks.Save(customerStarbucks);
		
		System.out.println("-----------------------------------------------------------------");
		
		Customer customerNero = new Customer();
		customerNero.setId(2);
		customerNero.setFirstName("Seda");
		customerNero.setLastName("Aktaþ");
		customerNero.setNationalyId("5225510048");
		customerNero.setDateOfBirth(LocalDate.of(1985,8,16));
		customerManagerNero.Save(customerNero);
	}

	
	
	
	

}

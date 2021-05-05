package javakampOdev.Adapters;

import java.rmi.RemoteException;

import javakampOdev.Abstract.CustomerCheckService;
import javakampOdev.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

private boolean result;
	
	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		KPSPublicSoap client = new KPSPublicSoapProxy();
		this.result = false;
		try {
			this.result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalyId()), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getDateOfBirth().getYear());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return this.result;
	}
}

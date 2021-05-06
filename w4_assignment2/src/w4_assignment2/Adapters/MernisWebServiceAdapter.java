package w4_assignment2.Adapters;
import java.rmi.RemoteException;
import w4_assignment2.Entities.Customer;
import w4_assignment2.Abstract.CustomerCheckService;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisWebServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoap soapClient = new KPSPublicSoapProxy();
		boolean result = false;
		  try {
			  result = soapClient.TCKimlikNoDogrula((Long.parseLong(customer.getNationalityId())),
					  customer.getFirstName(), 
					  customer.getLastName(), 
					  customer.getDateOfBirth());
		  } catch (NumberFormatException e) {
			   e.printStackTrace();
		  } catch (RemoteException e) {
		       e.printStackTrace();
		  }
		 return result;
	}
	
}
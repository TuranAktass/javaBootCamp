package day4_assignment3.adapters;

import java.rmi.RemoteException;

import day4_assignment3.abstracts.UserValidationService;
import day4_assignment3.entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements UserValidationService{

	@Override
	public boolean checkIfRealPerson(User user) {
		KPSPublicSoap soapClient = new KPSPublicSoapProxy();
		boolean result = false;
		  try {
			  result = soapClient.TCKimlikNoDogrula(
					  Long.parseLong(user.getNationalityId()), 
					  user.getFirstName().toUpperCase(), 
					  user.getLastName().toUpperCase(), 
					  user.getDateOfBirth().getYear()
				);
		  } 
		  catch (NumberFormatException e) {
			   e.printStackTrace();
		  } 
		  catch (RemoteException e) {
		       e.printStackTrace();
		  }
		 return result;
	}

	
}

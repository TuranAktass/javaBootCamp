package com.kodlama.io.hrms.core.concretes;

import java.rmi.RemoteException;

import org.springframework.stereotype.Component;

import com.kodlama.io.hrms.core.abstracts.MernisCheckService;
import com.kodlama.io.hrms.entities.concretes.Candidate;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

@Component
public class MernisServiceAdapter //implements MernisCheckService
//couldnt initialize axis.client() WARN!
{

	//@Override
	public boolean checkIfRealPerson(Candidate candidate) {
		KPSPublicSoap soapClient = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			result = soapClient.TCKimlikNoDogrula(Long.parseLong(candidate.getNationalId()),
					candidate.getFirstName().toUpperCase(), candidate.getLastName().toUpperCase(), candidate.getDateOfBirth().getYear());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return result;
	}
}

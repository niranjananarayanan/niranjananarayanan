package in.ac.aec.shb.serviceFactory;

import in.ac.aec.shb.service.ISeminarHallBookingService;
import in.ac.aec.shb.service.SeminarHallBookingServiceImpl;

public class SeminarHallBookingServiceFactory 
{
	private SeminarHallBookingServiceFactory() 
	{

	}

	private static ISeminarHallBookingService seminarHallBookingService = null;

	public static ISeminarHallBookingService getSeminarHallBookingService() 
	{	
		if (seminarHallBookingService == null) 
				seminarHallBookingService = new SeminarHallBookingServiceImpl();
		
		return seminarHallBookingService;
	}
}

package in.ac.aec.shb.daoFactory;

import in.ac.aec.shb.dao.ISeminarHallBookingDao;
import in.ac.aec.shb.dao.SeminarHallBookingDaoImpl;

public class SeminarHallBookingDaoFactory 
{
	private SeminarHallBookingDaoFactory() 
	{
		
	}

	private static ISeminarHallBookingDao seminarHallBookingDao = null;

	public static ISeminarHallBookingDao getSeminarHallBookingDao() 
	{
		if (seminarHallBookingDao == null) 
			seminarHallBookingDao = new SeminarHallBookingDaoImpl();
		
		return seminarHallBookingDao;
	}

}

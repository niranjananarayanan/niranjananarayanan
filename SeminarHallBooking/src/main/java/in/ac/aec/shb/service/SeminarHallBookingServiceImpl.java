package in.ac.aec.shb.service;

import in.ac.aec.shb.dao.ISeminarHallBookingDao;
import in.ac.aec.shb.daoFactory.SeminarHallBookingDaoFactory;
import in.ac.aec.shb.dto.Booking;
import in.ac.aec.shb.dto.Status;
import in.ac.aec.shb.dto.Users;

public class SeminarHallBookingServiceImpl implements ISeminarHallBookingService
{
	private ISeminarHallBookingDao seminarHallBookingDao=null;
	
	@Override
	public String registerUser(Users user) 
	{
		seminarHallBookingDao= SeminarHallBookingDaoFactory.getSeminarHallBookingDao();
		System.out.println("From Controller Servelet");
		
		if(seminarHallBookingDao!=null)
			return seminarHallBookingDao.registerUser(user);
		else
			return "Failed";
	}

	@Override
	public boolean verifyLogin(String mail, String password, String userType) 
	{
		seminarHallBookingDao= SeminarHallBookingDaoFactory.getSeminarHallBookingDao();
		System.out.println("From Controller Servelet");
		
		if(seminarHallBookingDao!=null)
			return seminarHallBookingDao.verifyLogin(mail, password, userType);
		else
			return false;
	}

	@Override
	public String hallBooking(Booking booking) 
	{
		seminarHallBookingDao= SeminarHallBookingDaoFactory.getSeminarHallBookingDao();
		System.out.println("From Controller Servelet");
		
		if(seminarHallBookingDao!=null)
			return seminarHallBookingDao.hallBooking(booking);
		else
			return "Failed";
	}

	@Override
	public String cancelBooking(Integer bookingId) 
	{
		seminarHallBookingDao= SeminarHallBookingDaoFactory.getSeminarHallBookingDao();
		System.out.println("From Controller Servelet");
		
		if(seminarHallBookingDao!=null)
			return seminarHallBookingDao.cancelBooking(bookingId);
		else
			return "Failed";
	}

	@Override
	public Booking viewBooking(Integer bookingId) 
	{
		seminarHallBookingDao= SeminarHallBookingDaoFactory.getSeminarHallBookingDao();
		System.out.println("From Controller Servelet");
		
		if(seminarHallBookingDao!=null)
			return seminarHallBookingDao.viewBooking(bookingId);
		else
			return null;
	}
	
	@Override
	public Users viewProfile(Integer id) 
	{
		seminarHallBookingDao= SeminarHallBookingDaoFactory.getSeminarHallBookingDao();
		System.out.println("From Controller Servelet");
		
		if(seminarHallBookingDao!=null)
			return seminarHallBookingDao.viewProfile(id);
		else
			return null;
	}
	
	@Override
	public void addStatus(Status status) 
	{
		seminarHallBookingDao= SeminarHallBookingDaoFactory.getSeminarHallBookingDao();
		System.out.println("From Controller Servelet");
		
		if(seminarHallBookingDao!=null)
			 seminarHallBookingDao.addStatus(status);
	}
		
	@Override
	public Status viewStatus(String mail)
	{
		seminarHallBookingDao= SeminarHallBookingDaoFactory.getSeminarHallBookingDao();
		System.out.println("From Controller Servelet");
		
		if(seminarHallBookingDao!=null)
			return seminarHallBookingDao.viewStatus(mail);
		else
			return null;
	}
	
	@Override
	public Booking viewMyBookings(String mail) 
	{
		seminarHallBookingDao= SeminarHallBookingDaoFactory.getSeminarHallBookingDao();
		System.out.println("From Controller Servelet");
		
		if(seminarHallBookingDao!=null)
			return seminarHallBookingDao.viewMyBookings(mail);
		else
			return null;
	}

	@Override
	public Users viewMyProfile(String mail) 
	{
		seminarHallBookingDao= SeminarHallBookingDaoFactory.getSeminarHallBookingDao();
		System.out.println("From Controller Servelet");
		
		if(seminarHallBookingDao!=null)
			return seminarHallBookingDao.viewMyProfile(mail);
		else
			return null;
	}
}

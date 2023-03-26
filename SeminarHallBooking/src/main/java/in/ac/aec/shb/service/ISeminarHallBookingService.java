package in.ac.aec.shb.service;

import in.ac.aec.shb.dto.Booking;
import in.ac.aec.shb.dto.Status;
import in.ac.aec.shb.dto.Users;

public interface ISeminarHallBookingService 
{
	public String registerUser(Users user);
	
	public boolean verifyLogin(String mail, String password, String userType);
	
	public String hallBooking(Booking booking);
		
	public String cancelBooking(Integer bookingId);
	
	public Booking viewBooking(Integer bookingId);
	
	public void addStatus(Status status);
	
	public Status viewStatus(String mail);

	public Booking viewMyBookings(String mail);

	public Users viewProfile(Integer id);
	
	public Users viewMyProfile(String mail);
}

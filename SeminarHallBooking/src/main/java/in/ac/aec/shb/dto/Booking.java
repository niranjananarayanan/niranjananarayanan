package in.ac.aec.shb.dto;

import java.io.Serializable;
import java.util.Date;

public class Booking implements Serializable{
		
	private static final long serialVersionUID = 1L;
	
	private Integer bookingId;
	private Integer hallId;
	private String username;
	private String userEmail;
	private String department;
	private String bookingSlot;
	private Date bookingDate;
	private String purpose;
	
	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}

	public void setHallId(Integer hallId) {
		this.hallId = hallId;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setBookingSlot(String bookingSlot) {
		this.bookingSlot = bookingSlot;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public Integer getBookingId() {
		return bookingId;
	}

	public Integer getHallId() {
		return hallId;
	}

	public String getUsername() {
		return username;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public String getDepartment() {
		return department;
	}

	public String getBookingSlot() {
		return bookingSlot;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", hallId=" + hallId + ", username=" + username + ", userEmail="
				+ userEmail + ", department=" + department + ", bookingSlot=" + bookingSlot + ", bookingDate=" + bookingDate + ", purpose=" + purpose + "]";
	}
}

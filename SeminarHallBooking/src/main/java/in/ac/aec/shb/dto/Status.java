package in.ac.aec.shb.dto;

import java.io.Serializable;

public class Status implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer bookingId;
	private String userEmail;
	private String status;
	
	@Override
	public String toString() {
		return "Status [bookingId=" + bookingId + ", userEmail=" + userEmail + ", status=" + status + "]";
	}

	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getBookingId() {
		return bookingId;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public String getStatus() {
		return status;
	}
}

package in.ac.aec.shb.dto;

import java.io.Serializable;

public class Admin implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String email;
	private String password;
	
	@Override
	public String toString() {
		return "Admin [email=" + email + ", password=" + password + "]";
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}
}

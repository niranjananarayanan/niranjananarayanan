package in.ac.aec.shb.dto;

import java.io.Serializable;

public class Users implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private String department;
	private String batch;
	private String email;
	private String password;
	
	@Override
	public String toString() {
		return "user [id=" + id + ", name=" + name + ", department=" + department + ", batch=" + batch + ", email="
				+ email + ", password=" + password + "]";
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public String getBatch() {
		return batch;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}
}

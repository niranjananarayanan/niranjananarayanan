package in.ac.aec.shb.dto;

import java.io.Serializable;

public class SeminarHall implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private String department;
	private Integer seatingCapacity;
	
	@Override
	public String toString() {
		return "SeminarHall [id=" + id + ", name=" + name + ", department=" + department + ", seatingCapacity="
				+ seatingCapacity + "]";
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

	public void setSeatingCapacity(Integer seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
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

	public Integer getSeatingCapacity() {
		return seatingCapacity;
	}
}

package com.jpa_demo2.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "parking_table")
public class Parking {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	private String loc;
	
	@JoinColumn(name ="eid_fk")
	@OneToOne
	private Employees employee;
	
	
	
	public Employees getEmployee() {
		return employee;
	}
	public void setEmployee(Employees employee) {
		this.employee = employee;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public Parking() {}
	public Parking(String loc) {
		super();
		this.loc = loc;
	}

	
}

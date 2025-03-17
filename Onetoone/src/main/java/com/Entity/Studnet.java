package com.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Studnet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	private String sname;
	@OneToOne
	private Laptop lap;

	public Studnet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Studnet(int sid, String sname, Laptop lap) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.lap = lap;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Laptop getLap() {
		return lap;
	}

	public void setLap(Laptop lap) {
		this.lap = lap;
	}

	@Override
	public String toString() {
		return "Studnet [sid=" + sid + ", sname=" + sname + ", lap=" + lap + "]";
	}

}

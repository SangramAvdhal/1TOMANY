package com.Entity;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity
public class Student {//many
    @Id
	private int sid;
    private String Sname;
	@ManyToOne
	@JoinColumn(name="str")
	private Teacher tcr;
	public Student(int sid, String sname, Teacher tcr) {
	super();
	this.sid = sid;
	Sname = sname;
	this.tcr = tcr;
}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public Teacher getTcr() {
		return tcr;
	}
	public void setTcr(Teacher tcr) {
		this.tcr = tcr;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", Sname=" + Sname + ", tcr=" + tcr + "]";
	}
	
	
	
}

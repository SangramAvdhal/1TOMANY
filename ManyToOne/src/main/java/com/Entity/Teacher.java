package com.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Teacher {//one
    @Id
	private int TID;
	private String Subject;
	@OneToMany
	
	private List< Student> str;
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Teacher(int tID, String subject, List<Student> str) {
		super();
		TID = tID;
		Subject = subject;
		this.str = str;
	}
	public int getTID() {
		return TID;
	}
	public void setTID(int tID) {
		TID = tID;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public List<Student> getStr() {
		return str;
	}
	public void setStr(List<Student> str) {
		this.str = str;
	}
	@Override
	public String toString() {
		return "Teacher [TID=" + TID + ", Subject=" + Subject + ", str=" + str + "]";
	}
	
	
	
	
	
}

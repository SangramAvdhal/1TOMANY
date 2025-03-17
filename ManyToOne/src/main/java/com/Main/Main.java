package com.Main;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Entity.Student;
import com.Entity.Teacher;

public class Main {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Teacher.class);
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		System.out.println("Mapping done succeefully");

		Teacher t1 = new Teacher();
		t1.setTID(1);
		t1.setSubject("math");
		
		Student s1=new Student();
		s1.setSid(1);
		s1.setSname("sam");
		s1.setTcr(t1);
		
		Student s2=new Student();
		s1.setSid(2);
		s1.setSname("Om");
		s1.setTcr(t1);
		
		ArrayList<Student> list=new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		t1.setStr(list);
		
		ss.persist(s1);
		ss.persist(s2);
		ss.persist(t1);
		
		System.out.println("data is inserted");
		
		

		tr.commit();
		ss.clear();
	}

}

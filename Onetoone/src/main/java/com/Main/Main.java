package com.Main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Entity.Laptop;
import com.Entity.Studnet;

public class Main {
	
	public static void main(String[] args) {
		
		
		Configuration cfg =new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Studnet.class);
		cfg.addAnnotatedClass(Laptop.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		
		Laptop l=new Laptop();
		l.setLid(1201);
		l.setName("Hp");
		
		ss.persist(l);
		
		Studnet s=new Studnet();
		
		s.setSname("sammy");
		s.setLap(l);
		
		ss.persist(s);
		
		System.out.println("Data inserted succefully");
		tr.commit();
		ss.close();
	}

}

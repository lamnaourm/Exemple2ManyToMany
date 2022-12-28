package com.principale;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.exemple.Utils.HibernateUtils;
import com.ismo.model.Employe;
import com.ismo.model.Projet;

public class Test {

	public static void main(String[] args) {
		
		Session session = HibernateUtils.getSessionfactory().getCurrentSession();
		Transaction tr = session .beginTransaction(); 
		
		Employe e1 = new Employe();
		e1.setId(1);
		
		Employe e2 = new Employe();
		e2.setId(2);
		
		Projet p = new Projet(); 
		p.setNom("SDGDF");
		p.setVille("CASA");
		p.getEmployes().add(e1);
		p.getEmployes().add(e2);
		
		
		session.save(p);
		
		tr.commit();
		session.close();

	}

}

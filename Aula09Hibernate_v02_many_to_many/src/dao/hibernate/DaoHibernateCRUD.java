package dao.hibernate;

import java.util.Collection;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DaoHibernateCRUD <T> {
	
	private SessionFactory factory = null;
	
	public DaoHibernateCRUD(SessionFactory factory) {
		this.factory = factory;
	}
	
	
	public void add(T obj) {
		Session session = factory.openSession();
		Transaction tx = null;
		
		try {
			
			tx = session.beginTransaction();
			session.save(obj);
			tx.commit();
			
		} catch(HibernateException e) {
			if(tx!=null) tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		
	}

	public void update(T obj) {
		Session session = factory.openSession();
		Transaction tx = null;
		
		try {
			
			tx = session.beginTransaction();
			session.update(obj);
			tx.commit();
			
		} catch(HibernateException e) {
			if(tx!=null) tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		
	}

	public void delete(T obj) {
		Session session = factory.openSession();
		Transaction tx = null;
		
		try {
			
			tx = session.beginTransaction();
			session.delete(obj);
			tx.commit();
			
		} catch(HibernateException e) {
			if(tx!=null) tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		
	}

	public Collection<T> get(String whereFrom) {
		Session session = factory.openSession();
		Transaction tx = null;
		
		Collection<T> objs = null;
		
		try {
			
			tx = session.beginTransaction();
			objs = session.createQuery(whereFrom).list(); 
			tx.commit();
			
		} catch(HibernateException e) {
			if(tx!=null) tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		
		return objs;
		
	}


}

package models;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PessoaDAO {
	
	private static SessionFactory factory;
	
	public PessoaDAO(){
		factory = new Configuration().configure().buildSessionFactory();
	}
	
	public Pessoa salvar(Pessoa pessoa){
		
		Session session = factory.openSession();
		Transaction transaction = null;
		
		try{
			transaction = session.beginTransaction();
			session.save(pessoa);
			transaction.commit();
			return pessoa;
		}catch (HibernateException e) {
			if(transaction != null) transaction.rollback();
			e.printStackTrace();
		}
		
		return null;
	}
	
	public boolean remove(Pessoa pessoa){
		Session session = factory.openSession();
		Transaction transaction = null;
		
		try{
			transaction = session.beginTransaction();
			session.remove(pessoa);
			transaction.commit();
			return true;
		}catch (HibernateException e) {
			if(transaction != null) transaction.rollback();
			e.printStackTrace();
		}
		
		return false;
	}
	
	public List<Pessoa> listarPessoas(){
		Session session = factory.openSession();
		Transaction transaction = null;
		
		try{
			transaction = session.beginTransaction();
			List<Pessoa> listaDePessoas = session.createQuery("FROM Pessoa").list();
			transaction.commit();
			return listaDePessoas;
		}catch (HibernateException e) {
			if(transaction != null) transaction.rollback();
			e.printStackTrace();
		}
		
		return null;
	}
	
	
}

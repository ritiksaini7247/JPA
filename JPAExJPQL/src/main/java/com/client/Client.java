package com.client;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.model.Worker;

public class Client {

	private EntityManagerFactory emf;
	private EntityManager em;
	EntityTransaction transaction;

	public Client() {
		emf = Persistence.createEntityManagerFactory("worker");
		em = emf.createEntityManager();
		transaction = em.getTransaction();
	}

	public void save() {
		transaction.begin();
		Worker worker = new Worker();
		worker.setWorkerName("Husain");
		worker.setWorkerAge((byte) 27);
		worker.setWorkerSalary(14000f);
		em.persist(worker);
		System.out.println("Saved...");
		transaction.commit();
	}

	public void findAll() {
		String jpql="select w from Worker w";
		
		Query q = em.createQuery(jpql);
		
		transaction.begin();
		
		List<Worker> workers = q.executeUpdate();
		
	}
	
	public static void main(String[] args) {

		new Client().save();

	}

}

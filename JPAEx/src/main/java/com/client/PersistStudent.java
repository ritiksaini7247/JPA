package com.client;

import javax.persistence.*;

import com.model.bike;

public class PersistStudent {

	public static void main(String args[]) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bike");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		bike b1 = new bike();
		b1.setBikeId(2);
		b1.setBikeName("Apache");
		b1.setBikeModel("180");
		em.persist(b1);
		em.getTransaction().commit();
		System.out.println("Save object successfully....");
		emf.close();
		em.close();

	}
}
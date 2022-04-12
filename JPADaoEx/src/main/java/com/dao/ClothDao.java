package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.model.Cloth;

public class ClothDao {

	private EntityManagerFactory emf;
	private EntityManager em;

	public ClothDao() {
		emf = Persistence.createEntityManagerFactory("cloth");
		em = emf.createEntityManager();
	}

	public int saveObj(Cloth cloth) {
		try {
			em.persist(cloth);
			em.getTransaction().begin();
			em.getTransaction().commit();
			emf.close();
			em.close();
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

	public Boolean deleteObj(int id) {
		try {
			Cloth cloth = em.find(Cloth.class, id);
			em.getTransaction().begin();
			em.remove(cloth);
			return true;
		} catch (Exception e) {
			System.out.println("Exception into delete method...Exception is :- " + e);
			return false;
		}
	}
	
	public int updateObj(Cloth cloth) {
		try {
			Cloth clothObj = em.find(Cloth.class, cloth.getClothId());
			em.getTransaction().begin();
			clothObj.setClothType("Trowser");
			clothObj.setClothCost(450f);
			em.getTransaction().commit();
			return 1;
		} catch (Exception e) {
			System.out.println("Exception in update object Exception is :  "+e);
			return 0;
		}
	}
	
	
}

package br.com.entertainmentlibrary.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class DoNothing {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("entlib");
		EntityManager em = entityManagerFactory.createEntityManager();
		em.getTransaction().begin();
		
		
		
		em.getTransaction().commit();
		em.close();
		
	}
}
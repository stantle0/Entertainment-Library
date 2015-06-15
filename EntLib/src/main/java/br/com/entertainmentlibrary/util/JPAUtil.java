package br.com.entertainmentlibrary.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	private static EntityManagerFactory entityManagerFactory =
			Persistence.createEntityManagerFactory("entlib");
	
	public static EntityManager getEntityManager() {
		return entityManagerFactory.createEntityManager();
	}

}

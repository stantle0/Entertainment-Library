package br.com.entertainmentlibrary.dao;

import javax.persistence.EntityManager;

public class GenericHibernateDAO<T> implements GenericDAO<T> {

	private EntityManager entityManager;
	
	public GenericHibernateDAO(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public void save(T object) {
		this.entityManager.persist(object);
	}

	public T getElementById(int id) {
		entityManager.find()
	}

	public void delete(T Object) {
		// TODO Auto-generated method stub
		
	}
	
	public void update(T Object) {
		// TODO Auto-generated method stub
		
	}

}

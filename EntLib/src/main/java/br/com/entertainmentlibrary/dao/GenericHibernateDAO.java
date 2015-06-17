package br.com.entertainmentlibrary.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class GenericHibernateDAO<T> implements GenericDAO<T> {

	private EntityManager entityManager;
	private Class<T> entityClass;
	
	public GenericHibernateDAO(EntityManager entityManager, Class<T> entityClass) {
		this.entityManager = entityManager;
		this.entityClass = entityClass;
	}

	public void save(T object) {
		this.entityManager.persist(object);
	}

	public T getElementById(int id) {
		T object = entityManager.find(entityClass, id);
		return object;
	}

	public void delete(T Object) {
		entityManager.remove(Object);
	}

	public List<T> listAll() {
		TypedQuery<T> query = entityManager.createQuery("Select o from " + entityClass.toString() + " o", entityClass);
		return query.getResultList();
	}
	
}

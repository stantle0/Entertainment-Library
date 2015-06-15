package br.com.entertainmentlibrary.dao;

public interface GenericDAO<T> {

	public void save(T object);
	public T getElementById(int id);
	public void delete(T Object);
	public void update (T Object);
	
}

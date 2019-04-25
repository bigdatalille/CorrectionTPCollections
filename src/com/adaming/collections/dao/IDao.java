package com.adaming.collections.dao;

import java.util.List;

public interface IDao<T> {
/*
	Ici l'ensemble de ces signatures représente le CRUD : 
	Create / Read / Update / Delete
*/
	
	boolean create (T o);
	
	boolean delete (T o);
	
	boolean update (T o);
	
	T findById (int id);
	
	List <T> findAll ();
}

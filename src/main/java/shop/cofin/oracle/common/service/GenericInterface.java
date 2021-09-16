package shop.cofin.oracle.common.service;

import java.util.List;

public interface GenericInterface<T, U> {
	
	void save(T t);
	T findById(U id);
	List<T> findAll();
	void update(T t);
	void delete(U id);
	
}

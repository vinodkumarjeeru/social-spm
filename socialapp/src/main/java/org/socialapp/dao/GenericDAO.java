/**
 * 
 */
package org.socialapp.dao;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import org.hibernate.Query;

/**
 * @author Sudarsan
 *
 */
public interface GenericDAO<T, ID extends Serializable> {
	
	void save(T entity);
	
	void merge(T entity);
	
	void delete(T entity);
	
	List<T> findByMany(Query query);
	
	T findOne(Query query);
	
	@SuppressWarnings("rawtypes")
	List getAll(Class clazz);
	
	@SuppressWarnings("rawtypes")
	T findById(Class clazz, BigDecimal id);

}

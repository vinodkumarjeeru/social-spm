/**
 * 
 */
package org.socialapp.dao.impl;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.socialapp.dao.GenericDAO;
import org.socialapp.utils.HibernateUtils;

/**
 * @author Sudarsan
 * 
 */
public abstract class GenericDAOImpl<T, ID extends Serializable> implements
		GenericDAO<T, ID> {

	protected Session getSession() {
		return HibernateUtils.currentSession();
	}

	public void save(T entity) {
		Session session = this.getSession();
		session.saveOrUpdate(entity);
	}

	public void merge(T entity) {
		Session session = this.getSession();
		session.merge(entity);
	}

	public void delete(T entity) {
		Session session = this.getSession();
		session.delete(entity);
	}

	@SuppressWarnings("unchecked")
	public List<T> findByMany(Query query) {
		List<T> t;
		t = (List<T>) query.list();
		return t;

	}

	@SuppressWarnings("unchecked")
	public T findOne(Query query) {
		T t;
		t = (T) query.uniqueResult();
		return t;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public T findById(Class clazz, BigDecimal id) {
		Session session = this.getSession();
		T t = null;
		t = (T) session.get(clazz, id);
		return t;
	}

	@SuppressWarnings("rawtypes")
	public List getAll(Class clazz) {
		Session session = this.getSession();
		List T = null;
		Query query = session.createQuery("from " + clazz.getName());
		T = query.list();
		return T;
	}

}

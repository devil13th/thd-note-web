package com.thd.note.dao;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository(value="entityDaoImpl")  
public class EntityDaoImpl implements EntityDao {
	
	@PersistenceContext
    private EntityManager entityManager;
	
	@Resource
	private DataSource dataSource;
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public void add(Object obj) {
		System.out.println(sessionFactory);
		entityManager.persist(obj);
	}

	@Override
	public void update(Object obj) {
		entityManager.merge(obj);
	}

	@Override
	public void delete(Object obj) {
		entityManager.remove(obj);
	}

	@Override
	public Object queryById(Class c,Object id) {
		return entityManager.find(c, id);
	}

}

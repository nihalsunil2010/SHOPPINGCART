package com.niit.shoppingcart.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.domain.Category;
@Repository("categoryDAO")
@Transactional
public class CategoryDAOImpl implements CategoryDAO{
    @Autowired
	private SessionFactory sessionFactory;
	public List<Category> list() {
		return sessionFactory.getCurrentSession().createQuery("from Category").list();
	}

	public boolean save(Category category) {
		try {
			sessionFactory.getCurrentSession().save(category);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	public boolean delete(Category category) {
	try {
		sessionFactory.getCurrentSession().delete(category);
		return true;
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return false;
		
	}
	}

	public boolean update(Category category) {
	try {
		sessionFactory.getCurrentSession().update(category);
		return true;
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return false;
	}
	}

	public Category getCategoryById(String id) {
		return (Category) sessionFactory.getCurrentSession().createQuery("from Category where id=  '"+id+"'    ").list().get(0);
	}

}

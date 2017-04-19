package com.niit.shoppingcart.testcase;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.domain.Category;

import junit.framework.Assert;

public class CategoryTestCase {

	private static Category category;
	
	private static CategoryDAO categoryDAO;
	
	@BeforeClass
	public static void init(){
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		context.scan("com.niit");
		context.refresh();
		
		category = (Category) context.getBean("category");
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
	}
	
	/*@Test
	public void categoryCreateTestCase(){
		category.setId("abc0669");
		category.setName("abcd");
		category.setDescription("Hello");
		
		boolean flag = categoryDAO.save(category);
		Assert.assertEquals("categoryCreateTestCase",true,flag);
	}*/
	
	
/*	@Test
	public void categoryUpdate(){
		category.setId("abc0666");
		category.setName("nihal");
		category.setDescription("description");
		
		boolean flag = categoryDAO.update(category);
		Assert.assertEquals("categoryUpdate",true,flag);
	}*/
	@Test
	public void categoryDelete(){
		category = categoryDAO.getCategoryById("002");
		boolean flag=categoryDAO.delete(category);
	
		Assert.assertEquals("categoryDelete",true,flag);
		}
	

}

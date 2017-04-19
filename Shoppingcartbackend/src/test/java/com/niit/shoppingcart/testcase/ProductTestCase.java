package com.niit.shoppingcart.testcase;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.ProductDAO;
import com.niit.shoppingcart.dao.SupplierDAO;
import com.niit.shoppingcart.domain.Product;
import com.niit.shoppingcart.domain.Supplier;

import junit.framework.Assert;

public class ProductTestCase {
	 @Autowired
		private static Product product;
		
	   @Autowired
		private static ProductDAO productDAO;
	   
	   @BeforeClass
	   public static void initialization(){
		   AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
		   context.scan("com.niit");
		   context.refresh();
		   product = (Product) context.getBean("product");
		   productDAO = (ProductDAO) context.getBean("productDAO");
		   
}
	   
	  /* public void createProduct(){
		   product.setId("p001");
		   product.setName("albin");
		   product.setCategory_id("c001");
		   product.setDescription("weed");
		   product.setPrice(236.00);
		   product.setSupplier_id("b001");
		   boolean flag=productDAO.save(product);
		   Assert.assertEquals("createProduct", true,flag);
	   }*/
	   @Test
	   public void createupdate(){
		   product.setId("p001");
		   product.setName("nihal");
		   product.setCategory_id("c002");
		   product.setDescription("weediuy");
		   product.setPrice(2360.00);
		   product.setSupplier_id("b0010");
		   boolean flag=productDAO.update(product);
		   Assert.assertEquals("createupdate", true,flag);
	   }
	   
}

package com.niit.shoppingcart.testcase;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import com.niit.shoppingcart.dao.UserDAO;
import com.niit.shoppingcart.domain.User;

public class UserTestCase {
@Autowired
private static User user;	
@Autowired
private static UserDAO userDAO;

@BeforeClass
public static void init(){
	
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	context.scan("com.niit");
	context.refresh();
	user=(User) context.getBean("user");
	userDAO = (UserDAO) context.getBean("userDAO");
	
}


/*public void usercreatetest()
{
	user.setId("u001");
	user.setName("nihal");
	user.setMail("nihalsunil2010");
	user.setPassword("tiger43");
	user.setRole("admin");
    user.setContact("9846242428");
    userDAO.save(user);
    }

*/
/*
public void updateuser()
{
	user.setId("u001");
	user.setName("nikihil");
	user.setMail("nihalsunil2000");
	user.setPassword("tiger4378");
	user.setRole("adminmkj");
    user.setContact("9846248");
    userDAO.update(user);
}
*/
@Test
public void validateCredentialsTestCase(){
	boolean flag = userDAO.validate("u001", "tiger4378");
	assertEquals("validateCredentialsTestCase",true, flag);
}
	
}
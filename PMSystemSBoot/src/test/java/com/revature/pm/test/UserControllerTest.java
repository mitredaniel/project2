package com.revature.pm.test;

import static org.junit.Assert.assertEquals;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;

import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

import org.jboss.logging.Logger;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.revature.pm.controller.UserController;
import com.revature.pm.entities.User;
import com.revature.pm.service.UserService;

@RunWith(MockitoJUnitRunner.class)
public class UserControllerTest {
	
	private static final Logger log = Logger.getLogger(UserControllerTest.class);

	@Mock
	private UserService userService;
	
	@InjectMocks
	@Autowired
	private UserController userController;
	
	private static User u1, u2;
	private static List<User> userList ;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	
		RestAssured.port = 8080;
		userList = new ArrayList<User>();
		
	}

	@Before
	public void setUp() throws Exception {
		u1 = new User(1,"dan","mitre","dm","pass","tenant","");
		u2 = new User(2,"meli","velez","dm","pass","tenant","");
		
		userList.clear();
		
		userList.add(u1);
		userList.add(u2);
	 
		Mockito.when(userController.getAllUser()).thenReturn(userList);
	}
	
	
	@Test
	public void testControllerCreateUserHTTP() {
		
		log.debug("Inside testControllerCreateUserHTTP");
		
		userController.createUser(u1);
		verify(userService).createUser(u1);
		
	}
	
	@Test
	public void testControllerGetAllUserHTTP() {
		
		log.debug("Inside testControllerGetAllUserHTTP");
		 
		List<User> testUserList = userController.getAllUser();
		assertEquals(userList,testUserList); 
	}
	
	
	@Test
	public void testControllerCreateUser() {
		userController.createUser(u1);
		Mockito.verify(userService).createUser(u1);
		
	}
	
	@Test
	public void testControllerGetAllUser() {
		userController.getAllUser();
		Mockito.verify(userService).getAllUser();
	}
	
	 
	
	
}


















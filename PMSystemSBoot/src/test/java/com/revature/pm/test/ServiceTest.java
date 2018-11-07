package com.revature.pm.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

import com.revature.pm.entities.User;
import com.revature.pm.repository.UserRepository;
import com.revature.pm.service.UserService;

@RunWith(MockitoJUnitRunner.class)
public class ServiceTest {
	
	@Mock
	static private UserRepository userRepo;
	
	@InjectMocks
	@Autowired
	private UserService userService;
	
	static User u1, u2, u3;
	static List<User> userList ;
	
	
	@Rule
	public ExpectedException exceptionRule = ExpectedException.none();
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
			
		
	}

	@Before
	public void setUp() throws Exception {
		
		u1 = new User(1,"dan","mitre","dm","pass","tenant","");
		u2 = new User(2,"meli","velez","dm","pass","tenant","");
		u3 = new User(3,"roger","mitre","dm","pass","tenant","");
		
		userList = new ArrayList<User>();
		
		userList.add(u1);
		userList.add(u2);
		userList.add(u3);
		
		Mockito.when(userRepo.findAll()).thenReturn(userList);	
	}

	
	@Test
	public void testCreateUser() {
		
		userService.createUser(u1);
		userService.createUser(u2);
		userService.createUser(u3);
		
		List<User> resultList = userService.getAllUser();
		
		assertEquals(userList,resultList);
				
	}
	
	/**
	 * Testing for null values while creating a new user.
	 */
	@Test
	public void testCreateUserValidation() {
		
		User[] userArray = new User[5];
		userArray[0]= new User(1,null,"mitre","dm","pass","tenant","");
		userArray[1]= new User(2,"dan",null,"dm","pass","tenant","");
		userArray[2]= new User(3,"dan","mitre",null,"pass","tenant","");
		userArray[3]= new User(4,"dan","mitre","dm",null,"tenant","");
		userArray[4]= new User(5,"dan","mitre","dm","pass",null,"");
		
		for (int i = 0; i<userArray.length;i++) {
			exceptionRule.expect(IllegalArgumentException.class);
			userService.createUser(userArray[i]);
			
		}
		
		
	}
	
}



























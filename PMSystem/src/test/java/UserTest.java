import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.revature.controller.User;
import com.revature.dao.UserDaoImp;
import com.revature.entities.P2User;
import com.revature.service.UserServiceImp;



@RunWith(MockitoJUnitRunner.class)
public class UserTest {
	
	@Mock
	UserDaoImp udao;
	
	@InjectMocks
	UserServiceImp uservice;
	
	private static User u;  //java object user
	
	private static P2User user;  // entity user
	
	private static List<P2User> userList;
	
@BeforeClass
public static void setupBeforeClass() {
	
}

@Before
public void setup() throws Exception{
	this.user = new P2User();
	user.setFname("Loren");
	user.setLname("Henderson");
	user.setLogin("lh");
	user.setPassword("123");
	user.setRole("manager");
	user.setUserid(1);
	
	when(udao.getUserById(1)).thenReturn(this.user);
		
}
	

	@Test
	public void testGetUserById() {
		assertEquals("should be Loren", this.user,this.udao.getUserById(1));
	}

	@Test
	public void testAddUser() {
		uservice.addUser(this.user);
		verify(udao).addUser(user);
	}
	
	
	
}

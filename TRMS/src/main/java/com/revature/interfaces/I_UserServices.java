package com.revature.interfaces;

import com.revature.beans.User;

public interface I_UserServices {
	
	User getUser(String login, String password);

}

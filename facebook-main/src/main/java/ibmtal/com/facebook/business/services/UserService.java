package ibmtal.com.facebook.business.services;

import java.util.ArrayList;


import ibmtal.com.facebook.entity.User;
import ibmtal.com.facebook.entity.dto.UserAdd;
import ibmtal.com.facebook.core.result.*;
public interface UserService {
	ArrayList<User> getAll();
	User addUser(User user);
	Result newUser(User user);
	Result userAdd(UserAdd userAdd);
}

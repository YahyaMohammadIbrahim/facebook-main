package ibmtal.com.facebook.business.services;

import java.util.ArrayList;

import ibmtal.com.facebook.core.result.*;
import ibmtal.com.facebook.entity.User;

public interface UserService {
	ArrayList<User> getAll();
	User addUser(User user);
	Result newUser(User user);
}


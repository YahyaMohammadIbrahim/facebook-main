package ibmtal.com.facebook.business.manager;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import ibmtal.com.facebook.business.services.UserService;
import ibmtal.com.facebook.database.UserDao;
import ibmtal.com.facebook.entity.User;
import ibmtal.com.facebook.core.result.Message;
import ibmtal.com.facebook.core.result.Result;
@Service
public class UserManager implements UserService {
	private UserDao userDao;
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
	@Override
	public ArrayList<User> getAll() {
		
		return new ArrayList<User>(userDao.findAll());
	}
	@Override
	public User addUser(User user) {
		User newUser=new User();
		Boolean error=false;
		if(user.getName().isBlank()==true) {
			error=true;
		}
		if(error==false) {
			newUser=user;
			userDao.save(newUser);
		}
		return newUser;
	}
	@Override
	public Result newUser(User user) {
		Result result=new Result();
		ArrayList<Message> mesaj=new ArrayList<Message>();
		result.setSuccess(true);
		if(user.getUsername().isBlank()) {
			result.setSuccess(false);
			mesaj.add(new Message("username", "Kullanıcı Adı boş geçilemez"));
		}
		if(user.getPassword().isBlank()) {
			result.setSuccess(false);
			mesaj.add(new Message("password", "Şifre girmediniz"));
		result.setErrors(mesaj);
		return result;
	}
		result.setErrors(mesaj);
		return result;
	}
}
	

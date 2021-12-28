package ibmtal.com.facebook.business.manager;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import ibmtal.com.facebook.business.services.UserService;
import ibmtal.com.facebook.database.UserDao;
import ibmtal.com.facebook.entity.User;
import ibmtal.com.facebook.entity.dto.UserAdd;
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
			mesaj.add(new Message("username"
					, "Kullanıcı Adı boş geçilemez"));
		}
		if(user.getPassword().isBlank()) {
			result.setSuccess(false);
			mesaj.add(new Message("password"
					, "Şifre girmediniz"));
		}
		if(user.getPassword().length()<6) {
			result.setSuccess(false);
			mesaj.add(new Message("password"
		, "Şifre  en az 6 karakter olmalı"));
		}
		
		if(!this.userDao.getByUsername(user.getUsername()).isEmpty()) {
			result.setSuccess(false);
			mesaj.add(new Message("username"
		, "sistemde kayıtlı"));
			
		}
		if(this.userDao.getByMail(user.getMail()).isEmpty()==false) {
			result.setSuccess(false);
			mesaj.add(new Message("mail"
					,user.getMail()+" sistemde Kayıtlı"));
		}
		
		
		if(result.isSuccess()) {
			userDao.save(user);
		}
		result.setErrors(mesaj);
		return result;
	}
	@Override
	public Result userAdd(UserAdd userAdd) {
		Result result=new Result();
		ArrayList<Message> mesaj=new ArrayList<Message>();
		result.setSuccess(true);
		
		User user=new User();
		user.setUsername(userAdd.getUsername());
		user.setPassword(userAdd.getPassword());
		user.setMail(userAdd.getMail());
		user.setName(userAdd.getName());
		user.setSurname(userAdd.getSurname());
		this.userDao.save(user);
		result.setErrors(mesaj);
		return result;
	}

	
}

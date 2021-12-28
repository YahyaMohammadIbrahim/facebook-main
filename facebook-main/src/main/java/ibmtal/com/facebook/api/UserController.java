package ibmtal.com.facebook.api;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ibmtal.com.facebook.business.services.UserService;
import ibmtal.com.facebook.core.result.Result;
import ibmtal.com.facebook.entity.User;
import ibmtal.com.facebook.entity.dto.UserAdd;


@RestController
@RequestMapping("/api/users")
public class UserController {
	private UserService userService;
	@Autowired
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@GetMapping("/getall")
	public ArrayList<User> hepsi(){
		return new ArrayList<User>(userService.getAll());
	}
	@PostMapping("/add")
	public User add(@RequestBody User user) {
		return this.userService.addUser(user);
	}
	@PostMapping("/newuser")
	public Result newuser(@RequestBody User user) {
		return this.userService.newUser(user);
	}
	@PostMapping("/addUser")
	public Result addUser(@RequestBody UserAdd userAdd) {
		return this.userService.userAdd(userAdd);
	}
	
}

package ibmtal.com.facebook.database;


import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;


import ibmtal.com.facebook.entity.User;

public interface UserDao extends JpaRepository<User, Integer> {
	ArrayList<User> getByUsername(String username);
	ArrayList<User> getByMail(String mail);
}

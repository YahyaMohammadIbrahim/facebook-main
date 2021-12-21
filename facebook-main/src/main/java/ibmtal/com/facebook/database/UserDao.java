package ibmtal.com.facebook.database;


import org.springframework.data.jpa.repository.JpaRepository;


import ibmtal.com.facebook.entity.User;

public interface UserDao extends JpaRepository<User, Integer> {

}

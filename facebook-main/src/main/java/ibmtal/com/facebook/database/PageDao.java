package ibmtal.com.facebook.database;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import ibmtal.com.facebook.entity.Page;

public interface PageDao extends JpaRepository<Page, Integer>  {
	ArrayList<Page> getByName(String name);
}

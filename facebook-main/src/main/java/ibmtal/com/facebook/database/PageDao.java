package ibmtal.com.facebook.database;

import org.springframework.data.jpa.repository.JpaRepository;

import ibmtal.com.facebook.entity.Page;

public interface PageDao extends JpaRepository<Page, Integer>  {

}

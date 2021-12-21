package ibmtal.com.facebook.database;

import org.springframework.data.jpa.repository.JpaRepository;

import ibmtal.com.facebook.entity.News;

public interface NewsDao  extends JpaRepository<News, Integer>{

}
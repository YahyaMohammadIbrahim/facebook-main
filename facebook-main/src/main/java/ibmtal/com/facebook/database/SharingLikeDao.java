package ibmtal.com.facebook.database;

import org.springframework.data.jpa.repository.JpaRepository;

import ibmtal.com.facebook.entity.SharingLike;

public interface SharingLikeDao extends JpaRepository<SharingLike, Integer>{

}

package ibmtal.com.facebook.database;

import org.springframework.data.jpa.repository.JpaRepository;

import ibmtal.com.facebook.entity.Sharing;

public interface SharingDao extends JpaRepository<Sharing, Integer> {

}

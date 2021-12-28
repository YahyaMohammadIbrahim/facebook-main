package ibmtal.com.facebook.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="sharingLikes")
public class SharingLike {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;
	@ManyToOne()
	@JoinColumn(name="userid")
	private User user;
	@Column(name="shareingid")
	private int shareingid;
	@Column(name="liketime")
	private String liketime;

	public SharingLike() {
		super();
	}

	public SharingLike(int id, User user, int shareingid, String liketime) {
		super();
		this.id = id;
		this.user = user;
		this.shareingid = shareingid;
		this.liketime = liketime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getShareingid() {
		return shareingid;
	}

	public void setShareingid(int shareingid) {
		this.shareingid = shareingid;
	}

	public String getLiketime() {
		return liketime;
	}

	public void setLiketime(String liketime) {
		this.liketime = liketime;
	}
	

}

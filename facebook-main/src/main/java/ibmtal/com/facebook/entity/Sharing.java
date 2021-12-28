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
@Table(name="sharings")
public class Sharing {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@ManyToOne()
	@JoinColumn(name="userid")
	private User user;	
	@Column(name="caption")
	private String caption;
	@Column(name="content")
	private String content;
	@Column(name="photo")
	private String photo;
	@Column(name="location")
	private String location;
	@Column(name="shareTime")
	private String shareTime;
	public Sharing() {
		super();
	}
	public Sharing(int id, User user, String caption, String content, String photo, String location, String shareTime) {
		super();
		this.id = id;
		this.user = user;
		this.caption = caption;
		this.content = content;
		this.photo = photo;
		this.location = location;
		this.shareTime = shareTime;
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
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getShareTime() {
		return shareTime;
	}
	public void setShareTime(String shareTime) {
		this.shareTime = shareTime;
	}

	
}

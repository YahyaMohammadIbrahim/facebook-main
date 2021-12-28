package ibmtal.com.facebook.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="users")
public class User {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;
	@Column(name="username")
	private String username;
	@Column(name="password")
	private String password;
	@Column(name="mail")
	private String mail;
	@Column(name="phone")
	private String phone;
	@Column(name="birthday")
	private String birthDay;
	@Column(name="gender")
	private boolean gender;
	@Column(name="profilphoto")
	private String profilPhoto;
	@Column(name="name")
	private String name;
	@Column(name="surname")
	private String surname;
	public User() {
		super();
	}
	public User(int id, String username, String password, String mail, String phone, String birthDay, boolean gender,
			String profilPhoto, String name, String surname) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.mail = mail;
		this.phone = phone;
		this.birthDay = birthDay;
		this.gender = gender;
		this.profilPhoto = profilPhoto;
		this.name = name;
		this.surname = surname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getProfilPhoto() {
		return profilPhoto;
	}
	public void setProfilPhoto(String profilPhoto) {
		this.profilPhoto = profilPhoto;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	
}

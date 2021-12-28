package ibmtal.com.facebook.entity.dto;

public class UserAdd {
	private String username;
	private String password;
	private String rePassword;
	private String mail;
	private String remail;
	private String name;
	private String surname;
	public UserAdd() {
		super();
	}
	public UserAdd(String username, String password, String rePassword, String mail, String remail, String name,
			String surname) {
		super();
		this.username = username;
		this.password = password;
		this.rePassword = rePassword;
		this.mail = mail;
		this.remail = remail;
		this.name = name;
		this.surname = surname;
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
	public String getRePassword() {
		return rePassword;
	}
	public void setRePassword(String rePassword) {
		this.rePassword = rePassword;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getRemail() {
		return remail;
	}
	public void setRemail(String remail) {
		this.remail = remail;
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

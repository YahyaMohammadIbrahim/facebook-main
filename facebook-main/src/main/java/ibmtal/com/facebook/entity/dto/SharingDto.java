package ibmtal.com.facebook.entity.dto;

public class SharingDto {
	private int userid;
	private String caption;
	private String content;
	private String photo;
	private String location;
	private String shareTime;
	public SharingDto() {
		super();
	}
	public SharingDto(int userid, String caption, String content, String photo, String location, String shareTime) {
		super();
		this.userid = userid;
		this.caption = caption;
		this.content = content;
		this.photo = photo;
		this.location = location;
		this.shareTime = shareTime;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
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

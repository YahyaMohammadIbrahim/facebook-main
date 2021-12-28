package ibmtal.com.facebook.entity.dto;

public class SharingLikeDto {
	private int id;
	private int shareingid;
	private String liketime;
	private int userid;
	public SharingLikeDto() {
		super();
	}
	public SharingLikeDto(int id, int shareingid, String liketime, int userid) {
		super();
		this.id = id;
		this.shareingid = shareingid;
		this.liketime = liketime;
		this.userid = userid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}

}

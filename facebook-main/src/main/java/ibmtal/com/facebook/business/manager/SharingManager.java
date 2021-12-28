package ibmtal.com.facebook.business.manager;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import ibmtal.com.facebook.business.services.SharingService;
import ibmtal.com.facebook.core.result.Message;
import ibmtal.com.facebook.core.result.Result;
import ibmtal.com.facebook.database.SharingDao;
import ibmtal.com.facebook.database.UserDao;
import ibmtal.com.facebook.entity.Sharing;
import ibmtal.com.facebook.entity.User;
import ibmtal.com.facebook.entity.dto.SharingDto;
@Service
public class SharingManager implements SharingService {
	private SharingDao sharingDao;
	private UserDao userDao;
	@Autowired
	public SharingManager(SharingDao sharingDao, UserDao userDao) {
		super();
		this.sharingDao = sharingDao;
		this.userDao = userDao;
	}

	@Override
	public Result addSharing(SharingDto sharingDto) {
		Result result=new Result();
		ArrayList<Message> mesaj=new ArrayList<Message>();
		result.setSuccess(true);

		Sharing sharing=new Sharing();
		sharing.setCaption(sharingDto.getCaption());
		sharing.setContent(sharingDto.getContent());
		sharing.setLocation(sharingDto.getLocation());
		sharing.setPhoto(sharingDto.getPhoto());
		sharing.setShareTime(sharingDto.getShareTime());
		
		User user=new User();
		user=this.userDao.findById(sharingDto.getUserid()).get();
		sharing.setUser(user);
		sharingDao.save(sharing);
		
		result.setErrors(mesaj);
		return result;
	}

	@Override
	public ArrayList<Sharing> getAll() {
		return new ArrayList<Sharing>(this.sharingDao.findAll());
	}
	
}

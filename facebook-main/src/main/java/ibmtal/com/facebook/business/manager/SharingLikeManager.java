package ibmtal.com.facebook.business.manager;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ibmtal.com.facebook.business.services.SharingLikeService;
import ibmtal.com.facebook.core.result.Message;
import ibmtal.com.facebook.core.result.Result;
import ibmtal.com.facebook.database.SharingLikeDao;
import ibmtal.com.facebook.database.UserDao;
import ibmtal.com.facebook.entity.SharingLike;
import ibmtal.com.facebook.entity.User;
import ibmtal.com.facebook.entity.dto.SharingLikeDto;

@Service
public class SharingLikeManager implements SharingLikeService {
	private SharingLikeDao sharingLikeDao;
	private UserDao userDao;
    @Autowired
	public SharingLikeManager(SharingLikeDao sharingLikeDao, UserDao userDao) {
		super();
		this.sharingLikeDao = sharingLikeDao;
		this.userDao = userDao;
	}
@Override
public Result addSharingLike(SharingLikeDto sharingLikeDto) {
	Result result=new Result();
	ArrayList<Message> mesaj=new ArrayList<Message>();
	result.setSuccess(true);
	
	SharingLike sharinglike=new SharingLike();
	sharinglike.setLiketime(sharingLikeDto.getLiketime());
	
	User user=new User();
	user=this.userDao.findById(sharingLikeDto.getUserid()).get();
	sharinglike.setUser(user);
	sharingLikeDao.save(sharinglike);
	
	
	
	result.setErrors(mesaj);
	return result;
	
}

}

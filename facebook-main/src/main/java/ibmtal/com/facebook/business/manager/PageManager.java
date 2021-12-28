package ibmtal.com.facebook.business.manager;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ibmtal.com.facebook.business.services.PageService;
import ibmtal.com.facebook.core.result.Message;
import ibmtal.com.facebook.core.result.Result;
import ibmtal.com.facebook.database.PageDao;
import ibmtal.com.facebook.entity.Page;

@Service
public class PageManager implements PageService{
	private PageDao pageDao;
	@Autowired     
	public PageManager(PageDao pageDao) {
		super();
		this.pageDao = pageDao;
	}
	@Override
	public ArrayList<Page> getAll() {
		// TODO Auto-generated method stub
		return new ArrayList<Page>(pageDao.findAll());
	}
	@Override
	public Result newPage(Page page) {
		Result result=new Result();
		ArrayList<Message> mesaj=new ArrayList<Message>();
		if(this.pageDao.getByName(page.getName()).isEmpty()==false) {
			result.setSuccess(false);
			mesaj.add(new Message("name",page.getName()+" Kayıtlı"));
		}
		if(page.getAboutus().isBlank()) {
			result.setSuccess(false);
			mesaj.add(new Message("aboutus","boş geçilemez"));
		}
		if(result.isSuccess()) {
			this.pageDao.save(page);
		}
		result.setErrors(mesaj);
		return result;
	}


}

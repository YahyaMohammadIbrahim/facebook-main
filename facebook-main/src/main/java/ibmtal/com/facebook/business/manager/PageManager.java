package ibmtal.com.facebook.business.manager;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ibmtal.com.facebook.core.result.Result;
import ibmtal.com.facebook.core.result.Message;
import ibmtal.com.facebook.business.services.PageService;
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
	public Page addPage(Page page) {
		Page newPage=new Page();
		Boolean error=false;
		if(page.getName().isBlank()==true) {
			error=true;
		}
		if(error==false) {
			newPage=page;
			pageDao.save(newPage);
		}
		return newPage;
	}
	@Override
	public Result newPage(Page Page) {
		Result result=new Result();
		ArrayList<Message> mesaj=new ArrayList<Message>();
		result.setSuccess(true);
		if(this.pageDao.getByName(Page.getName()).isEmpty()==false) {
		result.setSuccess(false);
		mesaj.add(new Message("name",Page.getName()+"Kayıtlı"));
	}
		
        if(Page.getAboutus().isBlank()) {
        	result.setSuccess(false);
        	mesaj.add(new Message("aboutus","boş geçilemez"));
        }
        if(result.isSuccess()) {
        	this.pageDao.save(Page);
        }
        result.setErrors(mesaj);
		return result;
}
}

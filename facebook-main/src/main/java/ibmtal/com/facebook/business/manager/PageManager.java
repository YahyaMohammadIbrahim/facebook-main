package ibmtal.com.facebook.business.manager;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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


}

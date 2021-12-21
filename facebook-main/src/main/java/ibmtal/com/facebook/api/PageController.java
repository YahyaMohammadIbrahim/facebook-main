package ibmtal.com.facebook.api;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ibmtal.com.facebook.business.services.PageService;
import ibmtal.com.facebook.entity.Page;

@RestController
@RequestMapping("/api/pages")
public class PageController {
	private PageService pageService;
	@Autowired
	public PageController(PageService pageService) {
		super();
		this.pageService = pageService;
	}
	@GetMapping("/getall")
	public ArrayList<Page> allPages(){
		return new ArrayList<Page>(pageService.getAll());
	}
}

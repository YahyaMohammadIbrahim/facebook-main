package ibmtal.com.facebook.api;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ibmtal.com.facebook.business.services.NewsService;
import ibmtal.com.facebook.entity.News;



@RestController
@RequestMapping("/api/news")

public class NewsController {
private NewsService newsService;
@Autowired
public NewsController(NewsService newsService) {
	super();
	this.newsService = newsService;
}
@GetMapping("/getall")
public ArrayList<News> allNews(){
	return new ArrayList<News>(newsService.getAll());	
}

}
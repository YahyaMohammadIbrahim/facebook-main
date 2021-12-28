package ibmtal.com.facebook.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ibmtal.com.facebook.business.services.SharingLikeService;
import ibmtal.com.facebook.core.result.Result;
import ibmtal.com.facebook.entity.dto.SharingLikeDto;

@RestController
@RequestMapping("/api/sharinglikes")
public class SharingLikeController {
	private SharingLikeService sharingLikeService;
	@Autowired
	public SharingLikeController(SharingLikeService sharingLikeService) {
		super();
		this.sharingLikeService = sharingLikeService;
	}
	@PostMapping("/newSharingLike")
	public Result newLike(@RequestBody SharingLikeDto sharinglikeDto) {
		return sharingLikeService.addSharingLike(sharinglikeDto);
	}
 
}

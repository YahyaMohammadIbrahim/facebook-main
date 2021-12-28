package ibmtal.com.facebook.api;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ibmtal.com.facebook.business.services.SharingService;
import ibmtal.com.facebook.core.result.Result;
import ibmtal.com.facebook.entity.Sharing;
import ibmtal.com.facebook.entity.dto.SharingDto;
@RestController
@RequestMapping("/api/sharings")
public class SharingController {
	private SharingService sharingService;
	@Autowired
	public SharingController(SharingService sharingService) {
		super();
		this.sharingService = sharingService;
	}
	@PostMapping("/newSharing")
	public Result newSharing(@RequestBody SharingDto sharingDto) {
		
		return sharingService.addSharing(sharingDto);
	}
	@GetMapping("/getall")
	public ArrayList<Sharing> getall() {
		return new ArrayList<Sharing>(this.sharingService.getAll());
	}
}

package ibmtal.com.facebook.business.services;

import java.util.ArrayList;

import ibmtal.com.facebook.core.result.Result;
import ibmtal.com.facebook.entity.Sharing;
import ibmtal.com.facebook.entity.dto.SharingDto;

public interface SharingService {
	Result addSharing(SharingDto sharingDto);
	ArrayList<Sharing> getAll();
}

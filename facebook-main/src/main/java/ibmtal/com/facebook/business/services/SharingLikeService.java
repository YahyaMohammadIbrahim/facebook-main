package ibmtal.com.facebook.business.services;

import ibmtal.com.facebook.core.result.Result;
import ibmtal.com.facebook.database.SharingLikeDao;
import ibmtal.com.facebook.entity.dto.SharingLikeDto;

public interface SharingLikeService {
  Result addSharingLike (SharingLikeDto sharingLikeDto);
}

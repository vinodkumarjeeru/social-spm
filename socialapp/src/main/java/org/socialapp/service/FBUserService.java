/**
 * 
 */
package org.socialapp.service;

import org.socialapp.domain.sub.FBUser;

/**
 * @author Sudarsan
 *
 */
public interface FBUserService {

	
	void create(FBUser fbUser);
	
	FBUser findByFbId(String fbId);
}

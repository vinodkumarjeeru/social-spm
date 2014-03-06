package org.socialapp.service;

import java.util.List;

import org.socialapp.domain.sub.XUser;

/**
 * @author vijay
 * 
 */
public interface XUserService {
	
	void createOrUpdate(XUser xUser);

	List<XUser> getAll();

	XUser findBy(String userName);
	
	XUser authenticate(String email, String password);

}

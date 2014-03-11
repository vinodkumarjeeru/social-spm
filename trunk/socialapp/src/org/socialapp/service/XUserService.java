package org.socialapp.service;

import java.util.List;

import org.socialapp.domain.sub.XUser;

/**
 * @author vijay
 * 
 */
public interface XUserService {
	
	void create(XUser xUser);
	
	void update(XUser xUser);

	List<XUser> getAll();

	XUser findBy(String email);
	
	XUser authenticate(String email, String password);
	
	String getPassword(String email, String securityQuestion, String answer);

}

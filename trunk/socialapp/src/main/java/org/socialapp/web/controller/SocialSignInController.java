package org.socialapp.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.socialapp.domain.sub.XUser;
import org.socialapp.service.XUserService;
import org.socialapp.service.impl.XUserServiceImpl;
import org.socialapp.web.utils.RootServlet;

/**
 * Servlet implementation class SocialSignInController
 */
public class SocialSignInController extends RootServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger LOG = Logger
			.getLogger(SocialSignInController.class);

	protected void socialService(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// String name = request.getParameter("email");
		// String password = request.getParameter("password");
		String email = "aaa@gmail.com";
		String password = "aaa";
		LOG.debug(email);
		LOG.debug(password);
		XUserService service = new XUserServiceImpl();
		XUser xUser = service.authenticate(email, password);
		if (xUser == null) {
			LOG.debug("Authenticate Failed.");
			return;
		}
		LOG.debug("Authenticate Success.");

	}
}

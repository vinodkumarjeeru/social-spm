package org.socialapp.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.socialapp.web.utils.RootServlet;

/**
 * Servlet implementation class ForgotPasswordController
 */
public class ForgotPasswordController extends RootServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger LOG = Logger
			.getLogger(ForgotPasswordController.class);

	protected void socialService(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email").trim();
		String securityQuestion = request.getParameter("securityQuestion")
				.trim();
		String answer = request.getParameter("answer").trim();
		LOG.debug(email);
		LOG.debug(securityQuestion);
		LOG.debug(answer);

	}
}

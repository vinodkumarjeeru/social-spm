package org.socialapp.web.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.socialapp.service.XUserService;
import org.socialapp.service.impl.XUserServiceImpl;
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
		boolean error = false;
		String email = request.getParameter("email").trim();
		String securityQuestion = request.getParameter("securityQuestion")
				.trim();
		String answer = request.getParameter("answer").trim();

		if (email == null || email.length() == 0) {
			request.setAttribute("emailError", "Please Enter Email Id");
			error = true;
		}
		if (securityQuestion.equalsIgnoreCase("Security Question")) {
			request.setAttribute("secQuestionError",
					"Please Select Security Question");
			error = true;
		}
		if (answer == null || answer.length() == 0) {
			request.setAttribute("answerError", "Please Enter answer");
			error = true;
		}
		if (error) {
			RequestDispatcher dispatcher = request
					.getRequestDispatcher("/forgotPassword.jsp");
			dispatcher.forward(request, response);
			return;
		}
		XUserService service = new XUserServiceImpl();
		String password = service.getPassword(email, securityQuestion, answer);

		LOG.debug(email);
		LOG.debug(securityQuestion);
		LOG.debug(answer);
		LOG.debug(password);

		if (password == null) {
			request.setAttribute("passwordMessage",
					"Invalid Details Entered!");
			RequestDispatcher dispatcher = request
					.getRequestDispatcher("/forgotPassword.jsp");
			dispatcher.forward(request, response);
			return;
		}
		request.setAttribute("passwordMessage",
				"Your Password Will Be Sent To Your E-Mail Id.");
		RequestDispatcher dispatcher = request
				.getRequestDispatcher("/forgotPassword.jsp");
		dispatcher.forward(request, response);

	}
}

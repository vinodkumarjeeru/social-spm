package org.socialapp.web.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.socialapp.domain.sub.XUser;
import org.socialapp.service.XUserService;
import org.socialapp.service.impl.XUserServiceImpl;
import org.socialapp.web.utils.RootServlet;

/**
 * Servlet implementation class ChangePasswordController
 */
public class ChangePasswordController extends RootServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger LOG = Logger
			.getLogger(ChangePasswordController.class);

	public void socialService(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		boolean error = false;
		String action = request.getParameter("action");
		if ("view".equalsIgnoreCase(action)) {
			RequestDispatcher dispatcher = request
					.getRequestDispatcher("/changePassword.jsp");
			dispatcher.forward(request, response);
			return;
		}
		if ("change".equalsIgnoreCase(action)) {
			LOG.debug(action);
			HttpSession session = request.getSession();
			XUser user = (XUser) session.getAttribute("user");
			XUserService xUserService = new XUserServiceImpl();
			XUser xUser = xUserService.findBy(user.getEmail());
			String email = request.getParameter("email");
			String currentPassword = request.getParameter("currentPassword");

			String newPassword = request.getParameter("newPassword");
			if (email == null || email.length() == 0) {
				request.setAttribute("emailError", "Email Required!");
				error = true;
			}
			if (currentPassword == null || currentPassword.length() == 0) {
				request.setAttribute("currentPasswordError",
						"Enter Your Current Password!");
				error = true;
			}
			if (newPassword == null || newPassword.length() == 0) {
				request.setAttribute("newPasswordError",
						"Enter Your New Password!");
				error = true;
			}
			if (error) {
				RequestDispatcher dispatcher = request
						.getRequestDispatcher("/changePassword.jsp");
				dispatcher.forward(request, response);
				return;
			}
			if (!xUser.getPassword().equals(currentPassword)) {
				request.setAttribute("invalidDetails",
						"Please Enter correct password!");
				RequestDispatcher dispatcher = request
						.getRequestDispatcher("/changePassword.jsp");
				dispatcher.forward(request, response);
				return;
			}

			xUser.setId(xUser.getId());
			xUser.setGuid(xUser.getGuid());
			xUser.setEmail(email);
			xUser.setFirstName(xUser.getFirstName());
			xUser.setLastName(xUser.getLastName());
			xUser.setPassword(newPassword);
			xUser.setDistrict(xUser.getDistrict());
			xUser.setMobile(xUser.getMobile());
			xUser.setSecurityQuestion(xUser.getSecurityQuestion());
			xUser.setAnswer(xUser.getAnswer());
			xUser.setProfilePic(xUser.getProfilePic());
			xUser.setCreatedOn(xUser.getCreatedOn());
			xUser.setCreatedBy(xUser.getCreatedBy());
			xUser.setModifiedBy(xUser.getModifiedBy());
			xUser.setModifiedOn(new java.util.Date());
			xUserService.update(xUser);
			request.setAttribute("passwordUpdateMessage",
					"Your Password Changed Successfully.");
			RequestDispatcher dispatcher = request
					.getRequestDispatcher("/changePassword.jsp");
			dispatcher.forward(request, response);
			return;
		}
	}
}

package org.socialapp.web.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.socialapp.domain.sub.XUser;
import org.socialapp.service.XUserService;
import org.socialapp.service.impl.XUserServiceImpl;
import org.socialapp.web.utils.RootServlet;

/**
 * Servlet implementation class ChangeProfileController
 */
public class ChangeProfileController extends RootServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger LOG = Logger
			.getLogger(ChangeProfileController.class);

	public void socialService(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		boolean error = false;
		String action = request.getParameter("action");
		LOG.debug(action);
		XUserService service = new XUserServiceImpl();

		if ("view".equalsIgnoreCase(action)) {
			String email = request.getParameter("email").trim();
			XUser user = service.findBy(email);
			LOG.debug(user.getEmail());
			request.setAttribute("user", user);
			RequestDispatcher dispatcher = request
					.getRequestDispatcher("/userProfile.jsp");
			dispatcher.forward(request, response);
			return;

		}

		if ("update".equalsIgnoreCase(action)) {
			String firstName = request.getParameter("firstName").trim();
			String lastName = request.getParameter("lastName").trim();
			String userEmail = request.getParameter("email1").trim();
			XUser user = service.findBy(userEmail);
			String district = request.getParameter("district").trim();
			String mobile = request.getParameter("mobile").trim();
			String secQuestion = request.getParameter("securityQuestion")
					.trim();
			String answer = request.getParameter("answer").trim();

			if (firstName == null || firstName.length() == 0) {
				request.setAttribute("firstNameError", "Firstname Required");
				error = true;

			}
			if (lastName == null || lastName.length() == 0) {
				request.setAttribute("lastNameError", "Lastname Required");
				error = true;

			}
			if (district == null || district.length() == 0) {
				request.setAttribute("districtError", "District Name Required");
				error = true;

			}
			if (mobile == null || mobile.length() == 0) {
				request.setAttribute("mobileError", "Mobile Number Required");
				error = true;

			}
			if (secQuestion.equalsIgnoreCase("Security Question")) {
				request.setAttribute("secQuestionError",
						"SecurityQuestion Required");
				error = true;

			}
			if (answer == null || answer.length() == 0) {
				request.setAttribute("answerError", "Answer Required");
				error = true;

			}

			if (error) {
				RequestDispatcher dispatcher = request
						.getRequestDispatcher("/userProfile.jsp");
				dispatcher.forward(request, response);
				return;
			}

			XUser xUser = new XUser();
			xUser.setId(user.getId());
			xUser.setGuid(user.getGuid());

			xUser.setEmail(userEmail);
			xUser.setFirstName(firstName);
			xUser.setLastName(lastName);
			xUser.setPassword(user.getPassword());
			xUser.setDistrict(district);
			xUser.setMobile(mobile);
			xUser.setSecurityQuestion(secQuestion);
			xUser.setAnswer(answer);

			xUser.setProfilePic(user.getProfilePic());
			xUser.setCreatedOn(user.getCreatedOn());
			xUser.setCreatedBy(user.getCreatedBy());
			xUser.setModifiedBy(user.getModifiedBy());
			xUser.setModifiedOn(new java.util.Date());
			xUser.setActive(1L);

			LOG.debug(xUser.getFirstName());
			LOG.debug(xUser.getMobile());
			LOG.debug(xUser.getEmail());

			service.update(xUser);
			request.setAttribute("updateMessage",
					"Your Profile Successfully Updated.");
			RequestDispatcher dispatcher = request
					.getRequestDispatcher("/userProfile.jsp");
			dispatcher.forward(request, response);
			return;
		}

	}
}

package org.socialapp.web.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.log4j.Logger;
import org.socialapp.domain.sub.XUser;
import org.socialapp.service.XUserService;
import org.socialapp.service.impl.XUserServiceImpl;
import org.socialapp.web.utils.RootServlet;

/**
 * Servlet implementation class XUserController
 */
public class XUserController extends RootServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger LOG = Logger.getLogger(XUserController.class);

	protected void socialService(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		boolean error = false;

		DiskFileItemFactory factory = new DiskFileItemFactory();
		ServletFileUpload upload = new ServletFileUpload(factory);
		try {
			@SuppressWarnings("unchecked")
			List<FileItem> list = upload.parseRequest(request);
			FileItem firstName = list.get(0);
			String fName = firstName.getString().trim();
			FileItem lastName = list.get(1);
			String lName = lastName.getString().trim();
			FileItem email = list.get(2);
			String mailId = email.getString().trim();
			FileItem password = list.get(3);
			String newPassword = password.getString().trim();
			FileItem confirmPassword = list.get(4);
			String rePassword = confirmPassword.getString().trim();
			FileItem districtName = list.get(5);
			String district = districtName.getString().trim();
			FileItem mobile = list.get(6);
			String mobileNumber = mobile.getString().trim();
			FileItem securityQuestion = list.get(7);
			String secQuestion = securityQuestion.getString().trim();
			FileItem answer = list.get(8);
			String givenAnswer = answer.getString().trim();
			FileItem profilePicture = list.get(9);

			if (fName == null || fName.length() == 0) {
				request.setAttribute("firstNameError",
						"Please Enter Your First Name");
				error = true;
			}
			if (lName == null || lName.length() == 0) {
				request.setAttribute("lastNameError",
						"Please Enter Your Last Name");
				error = true;
			}
			if (mailId == null || mailId.length() == 0) {
				request.setAttribute("mailIdError", "Please Enter Your Mail Id");
				error = true;
			}
			if (newPassword == null || newPassword.length() == 0) {
				request.setAttribute("newPasswordError",
						"Please Enter Your Password");
				error = true;
			}
			if (rePassword == null || rePassword.length() == 0) {
				request.setAttribute("rePasswordError",
						"Please Re-Enter Your Password");
				error = true;
			}
			if (!newPassword.equals(rePassword)) {
				request.setAttribute("checkPasswordError",
						"Passwords Mismatch! Enter Same Passwords");
				error = true;
			}
			if (district == null || district.length() == 0) {
				request.setAttribute("districtError",
						"Please Select Your District");
				error = true;
			}
			if (mobileNumber == null || mobileNumber.length() == 0) {
				request.setAttribute("mobileNumberError",
						"Please Enter Your Mobile Number");
				error = true;
			}
			if (secQuestion.equalsIgnoreCase("Security Question")) {
				request.setAttribute("secQuestionError",
						"Please Choose Your Security Question");
				error = true;
			}
			if (givenAnswer == null || givenAnswer.length() == 0) {
				request.setAttribute("givenAnswerError",
						"Please Enter Your Answer");
				error = true;
			}
			if (error) {
				RequestDispatcher dispatcher = request
						.getRequestDispatcher("/register.jsp");
				dispatcher.forward(request, response);
				return;
			}

			LOG.debug(fName);
			LOG.debug(lName);
			LOG.debug(mailId);
			LOG.debug(newPassword);
			LOG.debug(rePassword);
			LOG.debug(district);
			LOG.debug(mobileNumber);
			LOG.debug(secQuestion);
			LOG.debug(givenAnswer);
			// LOG.debug(profilePicture.get().length);

			if (!newPassword.equalsIgnoreCase(rePassword)) {
				request.setAttribute("errMsg", "Please Confirm your Password");
				RequestDispatcher dispatcher = request
						.getRequestDispatcher("/register.jsp");
				dispatcher.forward(request, response);
				return;
			}

			XUser xUser = new XUser();
			// xUser.setFbId(1L);
			xUser.setFirstName(fName);
			xUser.setLastName(lName);
			xUser.setEmail(mailId);
			xUser.setPassword(newPassword);
			xUser.setSecurityQuestion(secQuestion);
			xUser.setDistrict(district);
			xUser.setAnswer(givenAnswer);
			xUser.setMobile(mobileNumber);
			xUser.setProfilePic(profilePicture.get());
			xUser.setCreatedBy(1L);
			xUser.setCreatedOn(new java.util.Date());
			xUser.setModifiedBy(1L);
			xUser.setModifiedOn(new java.util.Date());
			xUser.setActive(1L);
			// LOG.debug(xUser);
			XUserService service = new XUserServiceImpl();
			service.create(xUser);

			request.setAttribute("msg", "Registration Completed, ");

			RequestDispatcher dispatcher = request
					.getRequestDispatcher("/register.jsp");
			dispatcher.forward(request, response);

		} catch (FileUploadException e) {
			LOG.debug(e);
		}
	}

}

package org.socialapp.web.controller;

import java.io.IOException;
import java.util.List;

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

		DiskFileItemFactory factory = new DiskFileItemFactory();
		ServletFileUpload upload = new ServletFileUpload(factory);
		try {
			@SuppressWarnings("unchecked")
			List<FileItem> list = upload.parseRequest(request);
			FileItem firstName = list.get(0);
			String name1 = firstName.getString();
			FileItem lastName = list.get(1);
			String name2 = lastName.getString();
			FileItem email = list.get(2);
			String mail = email.getString();
			FileItem password = list.get(3);
			String pwd = password.getString();
			FileItem confirmPassword = list.get(4);
			String cpwd = confirmPassword.getString();
			FileItem districtName = list.get(5);
			String dName = districtName.getString();
			FileItem mobile = list.get(6);
			String mobileNumber = mobile.getString();
			FileItem securityQuestion = list.get(7);
			String secQuestion = securityQuestion.getString();
			FileItem answer = list.get(8);
			String ans = answer.getString();
			FileItem profilePicture = list.get(9);

			LOG.debug(name1);
			LOG.debug(name2);
			LOG.debug(mail);
			LOG.debug(pwd);
			LOG.debug(cpwd);
			LOG.debug(dName);
			LOG.debug(mobileNumber);
			LOG.debug(secQuestion);
			LOG.debug(ans);
			//LOG.debug(profilePicture.get().length);

			XUser xUser = new XUser();
			// xUser.setFbId(1L);
			xUser.setFirstName(name1);
			xUser.setLastName(name2);
			xUser.setEmail(mail);
			xUser.setPassword(pwd);
			xUser.setSecurityQuestion(secQuestion);
			xUser.setAnswer(ans);
			xUser.setMobile(mobileNumber);
			xUser.setProfilePic(profilePicture.get());
			xUser.setCreatedBy(1L);
			xUser.setCreatedOn(new java.util.Date());
			xUser.setModifiedBy(1L);
			xUser.setModifiedOn(new java.util.Date());
			xUser.setActive(1L);
			// LOG.debug(xUser);
			XUserService service = new XUserServiceImpl();
			service.createOrUpdate(xUser);

		} catch (FileUploadException e) {
			LOG.debug(e);
		}
	}

}

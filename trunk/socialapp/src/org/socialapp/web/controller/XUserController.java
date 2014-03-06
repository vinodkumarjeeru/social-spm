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
			FileItem email = list.get(0);
			String mailId = email.getString().trim();
			FileItem username = list.get(1);
			String name = username.getString().trim();
			FileItem password = list.get(2);
			String password1 = password.getString().trim();
			FileItem securityQuestion = list.get(3);
			String secQuestion = securityQuestion.getString().trim();
			FileItem answer = list.get(4);
			String answer1 = answer.getString().trim();
			FileItem mobile = list.get(5);
			String mobileNumber = mobile.getString().trim();
			FileItem profilePicture = list.get(6);
			LOG.debug(mailId);
			LOG.debug(name);
			LOG.debug(password1);
			LOG.debug(secQuestion);
			LOG.debug(answer1);
			LOG.debug(mobileNumber);
			LOG.debug(profilePicture.get().length);
			
			XUser xUser = new XUser();
			xUser.setEmail(mailId);			
			xUser.setPassword(password1);
			xUser.setSecurityQuestion(secQuestion);
			xUser.setAnswer(answer1);
			xUser.setMobile(mobileNumber);
			xUser.setProfilePic(profilePicture.get());
			xUser.setCreatedBy(1L);
			xUser.setCreatedOn(new java.util.Date());
			xUser.setModifiedBy(1L);
			xUser.setModifiedOn(new java.util.Date());
			xUser.setActive(1L);

		} catch (FileUploadException e) {
			LOG.debug(e);
		}
	}

}

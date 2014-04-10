package org.socialapp.web.controller;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.socialapp.domain.sub.XUser;
import org.socialapp.service.XUserService;
import org.socialapp.service.impl.XUserServiceImpl;
import org.socialapp.web.utils.RootServlet;

/**
 * Servlet implementation class UserImageResponseController
 */

public class UserImageResponseController extends RootServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger LOG = Logger
			.getLogger(UserImageResponseController.class);

	public void socialService(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("image/jpg");

		String email = request.getParameter("email").trim();

		XUserService xUserService = new XUserServiceImpl();
		XUser xUser = xUserService.findBy(email);

		if (xUser.getProfilePic().length == 0 || xUser.getProfilePic() == null) {

			InputStream inputStream = this.getServletContext()
					.getResourceAsStream("images/MaleImg.jpg");

			LOG.debug("=================" + inputStream.available());

			response.setContentLength(inputStream.available());
			byte[] imgBtes = new byte[inputStream.available()];
			inputStream.read(imgBtes);
			ServletOutputStream outputStream = response.getOutputStream();
			outputStream.write(imgBtes);
			outputStream.flush();
			outputStream.close();
			return;

		}

		response.setContentLength(xUser.getProfilePic().length);
		ServletOutputStream outputStream = response.getOutputStream();
		outputStream.write(xUser.getProfilePic());
		outputStream.flush();
		outputStream.close();

	}

}

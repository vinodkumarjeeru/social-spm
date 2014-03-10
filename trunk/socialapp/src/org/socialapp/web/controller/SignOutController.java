package org.socialapp.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.socialapp.domain.sub.XUser;
import org.socialapp.web.utils.RootServlet;

/**
 * Servlet implementation class SignOutController
 */

public class SignOutController extends RootServlet {
	private static final long serialVersionUID = 1L;

	public void socialService(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		XUser user = (XUser) request.getSession().getAttribute("user");

		if (user != null) {
			request.getSession().invalidate();
			response.sendRedirect("index.jsp");
			return;
		}

		response.sendRedirect("index.jsp");

	}

}

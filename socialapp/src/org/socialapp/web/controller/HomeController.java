package org.socialapp.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.socialapp.web.utils.RootServlet;

public class HomeController extends RootServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void socialService(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.sendRedirect("userHome.jsp");
		
	}

}

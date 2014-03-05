/**
 * 
 */
package org.socialapp.web.utils;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Sudarsan
 * 
 */
public class RootServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public final void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		socialService(request, response);
	}

	protected void socialService(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

}

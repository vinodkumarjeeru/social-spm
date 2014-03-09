package org.socialapp.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.socialapp.domain.sub.XUser;
import org.socialapp.service.XUserService;
import org.socialapp.service.impl.XUserServiceImpl;
import org.socialapp.web.utils.RootServlet;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends RootServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger LOG = Logger.getLogger(LoginController.class);

    

    protected void socialService(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

        
        response.setContentType("text/html");

        String email = request.getParameter("email").trim();
        String password = request.getParameter("password").trim();
        LOG.debug(email);
        LOG.debug(password);

        PrintWriter out = response.getWriter();
        
        XUserService xUserService = new XUserServiceImpl();
        XUser xUser = xUserService.authenticate(email, password);
        
        LOG.debug("==================="+xUser);
        
        if(xUser == null) {
            out.print("0");
            return;
        }
        
        out.print("1");
        out.close();
        

    }
}

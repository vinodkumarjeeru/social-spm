package org.socialapp.web.utils;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sudarsan
 */
public class ActionMappingController extends RootServlet {

    public void socialService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action").trim();
        
        if("".equalsIgnoreCase(action)) {
            
        }
    }

}

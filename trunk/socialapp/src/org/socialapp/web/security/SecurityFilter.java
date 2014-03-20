package org.socialapp.web.security;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.socialapp.domain.sub.XUser;

/**
 *
 * @author Admin
 */
public class SecurityFilter implements Filter {

    @Override
    public void init(FilterConfig fc) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {

    	
    	HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;

        String uri = request.getRequestURI();
        if (uri.equalsIgnoreCase(request.getContextPath() + "/userHome.jsp") || uri.equalsIgnoreCase(request.getContextPath() + "/adminHome.jsp")) {
            XUser user = (XUser) request.getSession().getAttribute("user");
            if (user == null) {
                response.sendRedirect("index.jsp");
                return;
            }
        }
        chain.doFilter(request, response);

    }

    @Override
    public void destroy() {
    }
}

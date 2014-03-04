package org.socialapp.web.utils;

import java.io.File;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.xml.DOMConfigurator;

public class AppContextListener implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		
	}

	@Override
	public void contextInitialized(ServletContextEvent ctxEvent) {
		
		
		ServletContext ctx = ctxEvent.getServletContext();
		 String log4jConfig = ctx.getInitParameter("log4j-config");
	        if(log4jConfig == null){
	            System.err.println("No log4j-config init param, initializing log4j with BasicConfigurator");
	            BasicConfigurator.configure();
	        }else {
	            String webAppPath = ctx.getRealPath("/");
	            String log4jProp = webAppPath + log4jConfig;
	            System.out.println("===============Name ==="+log4jProp);
	            
	            File log4jConfigFile = new File(log4jProp);
	            if (log4jConfigFile.exists()) {
	                System.out.println("Initializing log4j with: " + log4jProp);
	                DOMConfigurator.configure(log4jProp);
	            } else {
	                System.err.println(log4jProp + " file not found, initializing log4j with BasicConfigurator");
	                BasicConfigurator.configure();
	            }
	        }
	}

}

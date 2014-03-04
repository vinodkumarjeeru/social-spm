/**
 * 
 */
package org.socialapp.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.scribe.builder.ServiceBuilder;
import org.scribe.builder.api.FacebookApi;
import org.scribe.model.Token;
import org.scribe.model.Verifier;
import org.scribe.oauth.OAuthService;

/**
 * @author sudarsan
 * 
 */
public class FBLoginController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final String PROTECTED_RESOURCE_URL = "https://graph.facebook.com/me";
	private static final String SCOPE = "email,offline_access,user_status,publish_actions,publish_stream,read_friendlists";
	private static final Token EMPTY_TOKEN = null;
	private OAuthService service;
	private Token accessToken = null;
	private String fbUserId = null;
	private Verifier verifier = null;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String apiKey = this.getServletConfig()
				.getInitParameter("app.config.oauth.facebook.apikey").trim();
		String apiSecret = this.getServletConfig()
				.getInitParameter("app.config.oauth.facebook.apisecret").trim();
		String callback = this.getServletConfig()
				.getInitParameter("app.config.oauth.facebook.callback").trim();

		service = new ServiceBuilder().provider(FacebookApi.class)
				.apiKey(apiKey).apiSecret(apiSecret).callback(callback).build();

		String authorizationUrl = service.getAuthorizationUrl(EMPTY_TOKEN);

	}

}

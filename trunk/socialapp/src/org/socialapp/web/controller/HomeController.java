package org.socialapp.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.json.JSONException;
import org.json.JSONObject;
import org.scribe.builder.ServiceBuilder;
import org.scribe.builder.api.FacebookApi;
import org.scribe.model.OAuthRequest;
import org.scribe.model.Response;
import org.scribe.model.Token;
import org.scribe.model.Verb;
import org.scribe.model.Verifier;
import org.scribe.oauth.OAuthService;
import org.socialapp.web.utils.RootServlet;

public class HomeController extends RootServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger LOG = Logger.getLogger(FBLoginController.class);

	private static final String PROTECTED_RESOURCE_URL = "https://graph.facebook.com/me";
	private static final Token EMPTY_TOKEN = null;
	private OAuthService service;
	private Token accessToken = null;
	private Verifier verifier = null;

	public void socialService(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String apiKey = this.getServletConfig()
				.getInitParameter("app.config.oauth.facebook.apikey").trim();
		String apiSecret = this.getServletConfig()
				.getInitParameter("app.config.oauth.facebook.apisecret").trim();
		String callback = this.getServletConfig()
				.getInitParameter("app.config.oauth.facebook.callback").trim();

		service = new ServiceBuilder().provider(FacebookApi.class)
				.apiKey(apiKey).apiSecret(apiSecret).callback(callback).build();

		JSONObject jsonObject = null;

		String userName = null;

		if (request.getParameter("code") != null) {
			verifier = new Verifier(request.getParameter("code"));

			accessToken = service.getAccessToken(EMPTY_TOKEN, verifier);

			OAuthRequest oAuthRequest = new OAuthRequest(Verb.GET,
					PROTECTED_RESOURCE_URL);
			service.signRequest(accessToken, oAuthRequest);
			Response oAuthResponse = oAuthRequest.send();

			try {
				jsonObject = new JSONObject(oAuthResponse.getBody());
				LOG.debug("\n======" + jsonObject.toString());
				userName = jsonObject.getString("username");

			} catch (JSONException e) {
				LOG.warn("", e);
			}

		}

		if ("lp.sudarsan".equals(userName)) {
			response.sendRedirect("adminHome.jsp");
			return;
		}
		response.sendRedirect("userHome.jsp");

	}

}

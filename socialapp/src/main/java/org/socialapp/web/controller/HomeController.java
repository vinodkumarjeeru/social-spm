package org.socialapp.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
import org.socialapp.domain.sub.FBUser;
import org.socialapp.service.FBUserService;
import org.socialapp.service.impl.FBUserServiceImpl;
import org.socialapp.web.utils.RootServlet;

public class HomeController extends RootServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger LOG = Logger.getLogger(HomeController.class);

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
		HttpSession session = request.getSession();

		if (request.getParameter("code") != null) {
			verifier = new Verifier(request.getParameter("code"));

			accessToken = service.getAccessToken(EMPTY_TOKEN, verifier);

			OAuthRequest oAuthRequest = new OAuthRequest(Verb.GET,
					PROTECTED_RESOURCE_URL);
			service.signRequest(accessToken, oAuthRequest);
			Response oAuthResponse = oAuthRequest.send();

			try {
				jsonObject = new JSONObject(oAuthResponse.getBody());

				String fbId = jsonObject.getString("id");
				userName = jsonObject.getString("username");

				// LOG.debug("\n======" + jsonObject.toString() + "\n\n");
				// LOG.debug("\n\n===============================\n");
				// LOG.debug("ID :  " + jsonObject.getString("id"));
				// LOG.debug("User Name :  " +
				// jsonObject.getString("username"));
				// LOG.debug("First Name :  " +
				// jsonObject.getString("first_name"));
				// LOG.debug("Last Name :  " +
				// jsonObject.getString("last_name"));
				// LOG.debug("Location : " + jsonObject.getString("location"));
				// LOG.debug("Gender : " + jsonObject.getString("gender"));
				// LOG.debug("================================================\n\n");
				//
				// LOG.debug("=================Using Object ============"
				// + jsonObject.get("username"));

				FBUserService service = new FBUserServiceImpl();
				FBUser fbUser = service.findByFbId(fbId);

				if ("admin.spm.3".equals(userName)) {
					session.setAttribute("fbUser", "fbUser");
					response.sendRedirect(request.getContextPath()
							+ "/adminHome.jsp");
					return;
				}

				if (fbUser == null) {
					return;
				}
				/*
				 * FBUser fbUser = new FBUser();
				 * fbUser.setFbId(jsonObject.getString("id"));
				 * fbUser.setFirstName(jsonObject.getString("first_name"));
				 * fbUser.setLastName(jsonObject.getString("last_name"));
				 * fbUser.setGender(jsonObject.getString("gender"));
				 * fbUser.setUserName(jsonObject.getString("username"));
				 */

			} catch (JSONException e) {
				LOG.warn("", e);
			}

		}

		response.sendRedirect("userHome.jsp");

	}
}

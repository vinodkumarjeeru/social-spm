package org.socialapp.web.controller;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.socialapp.domain.sub.District;
import org.socialapp.service.DistrictService;
import org.socialapp.service.impl.DistrictServiceImpl;
import org.socialapp.web.utils.RootServlet;

/**
 * Servlet implementation class ManageDistrictController
 */
public class ManageDistrictController extends RootServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger LOG = Logger
			.getLogger(ManageDistrictController.class);

	protected void socialService(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		DistrictService service = new DistrictServiceImpl();
		List<District> districtList = service.getAll();
		LOG.debug(districtList.size());

	}

}

package org.socialapp.web.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.log4j.Logger;
import org.socialapp.domain.sub.District;
import org.socialapp.service.DistrictService;
import org.socialapp.service.impl.DistrictServiceImpl;
import org.socialapp.web.utils.RootServlet;

/**
 * Servlet implementation class DistrictController
 */
public class DistrictController extends RootServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger LOG = Logger
			.getLogger(DistrictController.class);

	protected void socialService(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		DiskFileItemFactory factory = new DiskFileItemFactory();
		ServletFileUpload upload = new ServletFileUpload(factory);
		try {
			@SuppressWarnings("unchecked")
			List<FileItem> list = upload.parseRequest(request);
			FileItem districtName = list.get(0);
			String dname = districtName.getString().trim();
			FileItem districtHeadquarters = list.get(1);
			String dHeadquarters = districtHeadquarters.getString().trim();
			FileItem state = list.get(2);
			String state1 = state.getString().trim();
			FileItem districtMap = list.get(3);

			LOG.debug(dname);
			LOG.debug(dHeadquarters);
			LOG.debug(state1);
			LOG.debug(districtMap.get().length);
			District district = new District();
			district.setDistrictId(1L);
			district.setDistrictName(dname);
			district.setDistrictCapital(dHeadquarters);
			district.setState(state1);
			district.setDistrictMap(districtMap.get());
			district.setCreatedBy(1L);
			district.setCreatedOn(new java.util.Date());
			district.setModifiedBy(1L);
			district.setModifiedOn(new java.util.Date());
			district.setActive(1L);
			DistrictService service = new DistrictServiceImpl();
			service.createOrUpdate(district);
			LOG.debug(district);

		} catch (FileUploadException e) {
			LOG.debug(e);

		}
	}

}

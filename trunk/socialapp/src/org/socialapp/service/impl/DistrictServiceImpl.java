package org.socialapp.service.impl;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.socialapp.dao.DistrictDAO;
import org.socialapp.dao.impl.DistrictDAOImpl;
import org.socialapp.domain.sub.District;
import org.socialapp.service.DistrictService;
import org.socialapp.utils.HibernateUtils;

public class DistrictServiceImpl implements DistrictService {

	private static final Logger LOG = Logger.getLogger(DistrictServiceImpl.class);
	
	private DistrictDAO districtDAO = new DistrictDAOImpl();

	@Override
	public void create(District district) {

		try {
			HibernateUtils.beginTransaction();
			districtDAO.save(district);
			HibernateUtils.commitTransaction();
		} catch (HibernateException exception) {
			LOG.warn("", exception);
		}

	}

}

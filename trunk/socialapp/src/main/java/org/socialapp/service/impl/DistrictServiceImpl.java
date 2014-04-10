package org.socialapp.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.socialapp.dao.DistrictDAO;
import org.socialapp.dao.impl.DistrictDAOImpl;
import org.socialapp.domain.sub.District;
import org.socialapp.queries.SocialAppQueries;
import org.socialapp.service.DistrictService;
import org.socialapp.utils.HibernateUtils;

public class DistrictServiceImpl implements DistrictService {

	private static final Logger LOG = Logger
			.getLogger(DistrictServiceImpl.class);

	private DistrictDAO districtDAO = new DistrictDAOImpl();

	@Override
	public void createOrUpdate(District district) {

		try {
			HibernateUtils.beginTransaction();
			districtDAO.save(district);
			HibernateUtils.commitTransaction();
		} catch (HibernateException exception) {
			System.out.println();
			LOG.warn("", exception);
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<District> getAll() {
		List<District> list = null;
		try {
			HibernateUtils.beginTransaction();
			list = districtDAO.getAll(District.class);
			HibernateUtils.commitTransaction();
		} catch (Exception exception) {
			LOG.warn("", exception);
		}

		return list;
	}

	@Override
	public District findBy(String districtName) {
		District district = null;
		try {
			HibernateUtils.beginTransaction();
			Query query = HibernateUtils
					.currentSession()
					.createQuery(SocialAppQueries.DISTRICT_FIND_BY_DISTRICTNAME)
					.setParameter("districtName", districtName);
			district = districtDAO.findOne(query);
			HibernateUtils.closeSession();

		} catch (Exception exception) {
			LOG.warn("", exception);

		}
		return district;
	}

}

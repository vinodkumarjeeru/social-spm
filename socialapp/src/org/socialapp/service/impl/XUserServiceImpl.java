package org.socialapp.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.socialapp.dao.XUserDAO;
import org.socialapp.dao.impl.XUserDAOImpl;
import org.socialapp.domain.sub.XUser;
import org.socialapp.service.XUserService;
import org.socialapp.utils.HibernateUtils;

public class XUserServiceImpl implements XUserService {
	private static final Logger LOG = Logger.getLogger(XUserServiceImpl.class);
	private XUserDAO xUserDAO = new XUserDAOImpl();

	@Override
	public void createOrUpdate(XUser xUser) {

		try {
			HibernateUtils.beginTransaction();
			xUserDAO.save(xUser);
			HibernateUtils.commitTransaction();
		} catch (Exception exception) {
			LOG.warn("", exception);
		}

	}

	@Override
	public List<XUser> getAll() {
		return null;
	}

	@Override
	public XUser findBy(String userName) {
		return null;
	}

	@Override
	public XUser authenticate(String email, String password) {
		XUser user = null;
		try {
			HibernateUtils.beginTransaction();
			Query query = HibernateUtils
					.currentSession()
					.createQuery(
							"from XUser xUser where xUser.email=:email and xUser.password=:password")
					.setParameter("email", email)
					.setParameter("password", password);
			user = xUserDAO.findOne(query);
			HibernateUtils.commitTransaction();

		} catch (Exception exception) {
			LOG.debug("", exception);
		}
		return user;
	}

}

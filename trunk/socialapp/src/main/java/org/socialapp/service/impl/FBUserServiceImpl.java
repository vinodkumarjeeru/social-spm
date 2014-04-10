/**
 * 
 */
package org.socialapp.service.impl;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.socialapp.dao.FBUserDAO;
import org.socialapp.dao.impl.FBUserDAOImpl;
import org.socialapp.domain.sub.FBUser;
import org.socialapp.queries.SocialAppQueries;
import org.socialapp.service.FBUserService;
import org.socialapp.utils.HibernateUtils;

/**
 * @author Sudarsan
 * 
 */
public class FBUserServiceImpl implements FBUserService {

	private FBUserDAO fbUserDAO = new FBUserDAOImpl();
	private static final Logger LOG = Logger.getLogger(FBUserServiceImpl.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.socialapp.service.FBUserService#create(org.socialapp.domain.sub.FBUser
	 * )
	 */
	@Override
	public void create(FBUser fbUser) {
		try {
			HibernateUtils.beginTransaction();
			fbUserDAO.save(fbUser);
			HibernateUtils.commitTransaction();
		} catch (Exception exception) {
			LOG.debug("", exception);
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.socialapp.service.FBUserService#findByFbId(java.lang.String)
	 */
	@Override
	public FBUser findByFbId(String fbId) {
		FBUser fbUser = null;

		try {
			HibernateUtils.beginTransaction();
			Query query = HibernateUtils.currentSession()
					.createQuery(SocialAppQueries.FBUSER_FIND_BY_FBID)
					.setParameter("fbId", fbId);
			fbUser = (FBUser) query.uniqueResult();
			HibernateUtils.commitTransaction();
		} catch (Exception exception) {
			LOG.debug("", exception);
		}

		return fbUser;
	}

}

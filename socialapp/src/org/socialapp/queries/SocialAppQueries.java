package org.socialapp.queries;

public interface SocialAppQueries {
	public static final String DISTRICT_FIND_BY_DISTRICTNAME = "from District district where district.districtName=:districtName";
	public static final String XUSER_AUTHENTICATE = "from XUser xUser where xUser.email=:email and xUser.password=:password";
}

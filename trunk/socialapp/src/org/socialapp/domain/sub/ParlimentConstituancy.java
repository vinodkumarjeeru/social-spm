package org.socialapp.domain.sub;

import java.util.UUID;

import org.socialapp.domain.Domain;

public class ParlimentConstituancy extends Domain {
	private Long parlimentconstituancyId;
	private String parlimentconstituancyName;

	public ParlimentConstituancy() {
		setGuid(UUID.randomUUID().toString());
	}

	/**
	 * @return the parlimentconstituancyId
	 */
	public Long getParlimentconstituancyId() {
		return parlimentconstituancyId;
	}

	/**
	 * @param parlimentconstituancyId
	 *            the parlimentconstituancyId to set
	 */
	public void setParlimentconstituancyId(Long parlimentconstituancyId) {
		this.parlimentconstituancyId = parlimentconstituancyId;
	}

	/**
	 * @return the parlimentconstituancyName
	 */
	public String getParlimentconstituancyName() {
		return parlimentconstituancyName;
	}

	/**
	 * @param parlimentconstituancyName
	 *            the parlimentconstituancyName to set
	 */
	public void setParlimentconstituancyName(String parlimentconstituancyName) {
		this.parlimentconstituancyName = parlimentconstituancyName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ParlimentConstituancy [parlimentconstituancyId=");
		builder.append(parlimentconstituancyId);
		builder.append(", parlimentconstituancyName=");
		builder.append(parlimentconstituancyName);
		builder.append("]");
		return builder.toString();
	}

}

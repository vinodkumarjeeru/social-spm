package org.socialapp.domain.sub;

import java.util.UUID;

import org.socialapp.domain.Domain;

public class AssemblyConstitutuancy extends Domain {
	private Long constituancyId;
	private String constituancyName;

	public AssemblyConstitutuancy() {
		setGuid(UUID.randomUUID().toString());
	}

	/**
	 * @return the constituancyId
	 */
	public Long getConstituancyId() {
		return constituancyId;
	}

	/**
	 * @param constituancyId
	 *            the constituancyId to set
	 */
	public void setConstituancyId(Long constituancyId) {
		this.constituancyId = constituancyId;
	}

	/**
	 * @return the constituancyName
	 */
	public String getConstituancyName() {
		return constituancyName;
	}

	/**
	 * @param constituancyName
	 *            the constituancyName to set
	 */
	public void setConstituancyName(String constituancyName) {
		this.constituancyName = constituancyName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AssemblyConstitutuancy [constituancyId=");
		builder.append(constituancyId);
		builder.append(", constituancyName=");
		builder.append(constituancyName);
		builder.append("]");
		return builder.toString();
	}

}

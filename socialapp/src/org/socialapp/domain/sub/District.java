package org.socialapp.domain.sub;

import java.util.Arrays;
import java.util.UUID;

import org.socialapp.domain.Domain;

public class District extends Domain {
	private Long districtId;
	private String districtName;
	private String districtCapital;
	private String state;
	private byte[] districtMap;

	public District() {
		setGuid(UUID.randomUUID().toString());
	}

	/**
	 * @return the districtId
	 */
	public Long getDistrictId() {
		return districtId;
	}

	/**
	 * @param districtId
	 *            the districtId to set
	 */
	public void setDistrictId(Long districtId) {
		this.districtId = districtId;
	}

	/**
	 * @return the districtName
	 */
	public String getDistrictName() {
		return districtName;
	}

	/**
	 * @param districtName
	 *            the districtName to set
	 */
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	/**
	 * @return the districtCapital
	 */
	public String getDistrictCapital() {
		return districtCapital;
	}

	/**
	 * @param districtCapital
	 *            the districtCapital to set
	 */
	public void setDistrictCapital(String districtCapital) {
		this.districtCapital = districtCapital;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the districtMap
	 */
	public byte[] getDistrictMap() {
		return districtMap;
	}

	/**
	 * @param districtMap
	 *            the districtMap to set
	 */
	public void setDistrictMap(byte[] districtMap) {
		this.districtMap = districtMap;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("District [districtId=");
		builder.append(districtId);
		builder.append(", districtName=");
		builder.append(districtName);
		builder.append(", districtCapital=");
		builder.append(districtCapital);
		builder.append(", state=");
		builder.append(state);
		builder.append(", districtMap=");
		builder.append(Arrays.toString(districtMap));
		builder.append("]");
		return builder.toString();
	}

}

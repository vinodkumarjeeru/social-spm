/**
 * 
 */
package org.socialapp.domain.sub;

import java.util.Arrays;
import java.util.UUID;

import org.socialapp.domain.Domain;

/**
 * @author Sudarsan
 * 
 */
public class XUser extends Domain {

	private Long fbId;
	private String firstName;
	private String lastName;	
	private String email;
	private String password;
	private String district;
	private String securityQuestion;
	private String answer;
	private String mobile;
	private byte[] profilePic;

	public XUser() {
		setGuid(UUID.randomUUID().toString());
	}

	/**
	 * @return the fbId
	 */
	public Long getFbId() {
		return fbId;
	}

	/**
	 * @param fbId the fbId to set
	 */
	public void setFbId(Long fbId) {
		this.fbId = fbId;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the district
	 */
	public String getDistrict() {
		return district;
	}

	/**
	 * @param district the district to set
	 */
	public void setDistrict(String district) {
		this.district = district;
	}

	/**
	 * @return the securityQuestion
	 */
	public String getSecurityQuestion() {
		return securityQuestion;
	}

	/**
	 * @param securityQuestion the securityQuestion to set
	 */
	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}

	/**
	 * @return the answer
	 */
	public String getAnswer() {
		return answer;
	}

	/**
	 * @param answer the answer to set
	 */
	public void setAnswer(String answer) {
		this.answer = answer;
	}

	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * @return the profilePic
	 */
	public byte[] getProfilePic() {
		return profilePic;
	}

	/**
	 * @param profilePic the profilePic to set
	 */
	public void setProfilePic(byte[] profilePic) {
		this.profilePic = profilePic;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "XUser [fbId=" + fbId + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", email=" + email + ", password="
				+ password + ", district=" + district + ", securityQuestion="
				+ securityQuestion + ", answer=" + answer + ", mobile="
				+ mobile + ", profilePic=" + Arrays.toString(profilePic) + "]";
	}

	
	

}

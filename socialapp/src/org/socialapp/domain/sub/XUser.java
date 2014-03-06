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
	private String userName;
	private String email;
	private String password;
	private String securityQuestion;
	private String answer;
	private String mobile;
	private byte[] profilePic;

	public XUser() {
		setGuid(UUID.randomUUID().toString());
	}

	public Long getFbId() {
		return fbId;
	}

	public void setFbId(Long fbId) {
		this.fbId = fbId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSecurityQuestion() {
		return securityQuestion;
	}

	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public byte[] getProfilePic() {
		return profilePic;
	}

	public void setProfilePic(byte[] profilePic) {
		this.profilePic = profilePic;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("XUser [fbId=");
		builder.append(fbId);
		builder.append(", userName=");
		builder.append(userName);
		builder.append(", email=");
		builder.append(email);
		builder.append(", password=");
		builder.append(password);
		builder.append(", securityQuestion=");
		builder.append(securityQuestion);
		builder.append(", answer=");
		builder.append(answer);
		builder.append(", mobile=");
		builder.append(mobile);
		builder.append(", profilePic=");
		builder.append(Arrays.toString(profilePic));
		builder.append("]");
		return builder.toString();
	}

}

/**
 * 
 */
package org.socialapp.domain.sub;

import java.util.Arrays;

import org.socialapp.domain.Domain;

/**
 * @author Sudarsan
 *
 */
public class XUser extends Domain {

	private long fbId;
	private String userName;
	private String email;
	private String password;
	private String securityQuestion;
	private String answer;
	private byte[] profilePic;
	public long getFbId() {
		return fbId;
	}
	public void setFbId(long fbId) {
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
	public byte[] getProfilePic() {
		return profilePic;
	}
	public void setProfilePic(byte[] profilePic) {
		this.profilePic = profilePic;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("XUser [fbId=").append(fbId).append(", userName=")
				.append(userName).append(", email=").append(email)
				.append(", password=").append(password)
				.append(", securityQuestion=").append(securityQuestion)
				.append(", answer=").append(answer).append(", profilePic=")
				.append(Arrays.toString(profilePic)).append("]");
		return builder.toString();
	}
	
	
	
}

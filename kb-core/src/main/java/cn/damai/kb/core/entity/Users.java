package cn.damai.kb.core.entity;

import java.io.Serializable;
import java.util.List;


/**
 * @author 王惠 
 * @version 创建时间：2014年8月27日 上午10:53:59
 * @className Users.java
 */

public class Users implements Serializable {

	
	private static final long serialVersionUID = -4230033502738879119L;
	
	private Long id;
	
	public Users(){}
	
	public Users(String email, String password, byte[] headimage) {
		super();
		this.email = email;
		this.password = password;
		this.headimage = headimage;
	}
	
	public Users(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public byte[] getHeadimage() {
		return headimage;
	}
	public void setHeadimage(byte[] headimage) {
		this.headimage = headimage;
	}
	public List<UserProblem> getUserProblem() {
		return userProblem;
	}

	public void setUserProblem(List<UserProblem> userProblem) {
		this.userProblem = userProblem;
	}
	public List<Problem> getProblem() {
		return problem;
	}

	public void setProblem(List<Problem> problem) {
		this.problem = problem;
	}
	public List<UserTopic> getUserTopic() {
		return userTopic;
	}

	public void setUserTopic(List<UserTopic> userTopic) {
		this.userTopic = userTopic;
	}
	public List<UserDzReply> getUserDzReply() {
		return userDzReply;
	}

	public void setUserDzReply(List<UserDzReply> userDzReply) {
		this.userDzReply = userDzReply;
	}
	private String email;
	private String password;
	private byte[] headimage;
	private List<UserProblem> userProblem;
	private List<Problem> problem;
	
	private List<UserTopic> userTopic;
	
	private List<UserDzReply> userDzReply;
}

package cn.damai.kb.core.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author 王惠 
 * @version 创建时间：2014年8月27日 上午10:52:47
 * @className Reply.java
 */

public class Reply implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7197722540982765434L;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public Problem getProblem() {
		return problem;
	}
	public void setProblem(Problem problem) {
		this.problem = problem;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getIsanonymity() {
		return isanonymity;
	}
	public void setIsanonymity(Integer isanonymity) {
		this.isanonymity = isanonymity;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public List<UserDzReply> getUserDzReply() {
		return userDzReply;
	}
	public void setUserDzReply(List<UserDzReply> userDzReply) {
		this.userDzReply = userDzReply;
	}
	
	private Long id;
	private Users user;
	private Problem problem;
	private String content;
	private Integer isanonymity;
	private Date time;

	private List<UserDzReply> userDzReply;
}

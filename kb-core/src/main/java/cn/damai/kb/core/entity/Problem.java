package cn.damai.kb.core.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author 王惠 
 * @version 创建时间：2014年8月27日 上午10:52:27
 * @className Problem.java
 */

public class Problem implements Serializable {

	private static final long serialVersionUID = -4151652699667153459L;
	
	private Long id;

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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDesciption() {
		return desciption;
	}
	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
	private Users user;
	private String title;
	private String desciption;
	private Date time;
	
	private List<TopicProblem> topicpro;
	private List<Reply> reply;
	private List<UserProblem> userProblem;

	public List<TopicProblem> getTopicpro() {
		return topicpro;
	}

	public void setTopicpro(List<TopicProblem> topicpro) {
		this.topicpro = topicpro;
	}

	public List<Reply> getReply() {
		return reply;
	}

	public void setReply(List<Reply> reply) {
		this.reply = reply;
	}

	public List<UserProblem> getUserProblem() {
		return userProblem;
	}

	public void setUserProblem(List<UserProblem> userProblem) {
		this.userProblem = userProblem;
	}

}

package cn.damai.kb.core.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author 王惠 
 * @version 创建时间：2014年8月27日 上午10:49:31
 * @className Topic.java
 */

public class Topic implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5188170620752042578L;
	
	
	
	public Topic() {
		super();
	}
	
	private Long id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}

	public List<TopicProblem> getTopicpro() {
		return topicproblem;
	}
	public void setTopicproblem(List<TopicProblem> topicproblem) {
		this.topicproblem = topicproblem;
	}

	public List<UserTopic> getUserTopic() {
		return userTopic;
	}
	public void setUserTopic(List<UserTopic> userTopic) {
		this.userTopic = userTopic;
	}

	private String name;
	private Date time;
	
	private List<TopicProblem> topicproblem;
	
	private List<UserTopic> userTopic;

}

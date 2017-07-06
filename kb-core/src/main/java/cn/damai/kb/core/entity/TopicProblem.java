package cn.damai.kb.core.entity;

import java.io.Serializable;

/**
 * @author 王惠 
 * @version 创建时间：2014年8月27日 上午10:55:51
 * @className TopicProblem.java
 */

public class TopicProblem implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4742044538937925962L;
	
	private Long id;
	
	public TopicProblem() {
		super();
	}
	public TopicProblem(Problem problem , Topic topic) {
		super();
		this.topic = topic;
		this.problem = problem;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	public Problem getProblem() {
		return problem;
	}
	public void setProblem(Problem problem) {
		this.problem = problem;
	}
	private Topic topic;
	private Problem problem;

}

package cn.damai.kb.core.entity;

import java.io.Serializable;

/**
 * @author 王惠 
 * @version 创建时间：2014年8月27日 上午10:55:19
 * @className UserTopic.java
 */

public class UserTopic implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1301206826271559587L;
	
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
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	private Long id;
	private Users user;
	private Topic topic;

}

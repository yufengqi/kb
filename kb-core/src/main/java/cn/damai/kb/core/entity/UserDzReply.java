package cn.damai.kb.core.entity;

import java.io.Serializable;

/**
 * @author 王惠 
 * @version 创建时间：2014年8月27日 上午10:54:52
 * @className UserDzReply.java
 */

public class UserDzReply implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4766062107433223217L;
	
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
	public Reply getReply() {
		return reply;
	}
	public void setReply(Reply reply) {
		this.reply = reply;
	}
	
	private Users user;
	private Reply reply;
}

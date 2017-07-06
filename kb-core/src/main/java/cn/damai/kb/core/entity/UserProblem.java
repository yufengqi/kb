package cn.damai.kb.core.entity;

import java.io.Serializable;

/**
 * @author 王惠 
 * @version 创建时间：2014年8月27日 上午10:54:32
 * @className UserProblem.java
 */

public class UserProblem implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5958772230034698363L;
	
	private Long id;
	
	
	
	public UserProblem() {
		super();
	}

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
	private Users user;
	private Problem problem;

}

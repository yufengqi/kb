package cn.damai.kb.core.entity;

import java.io.Serializable;
import java.sql.Blob;

/**
 * @author 王惠 
 * @version 创建时间：2014年8月27日 上午10:53:17
 * @className Image.java
 */

public class Image implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5053883837824273876L;
	
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
	public Blob getImagephoto() {
		return imagephoto;
	}
	public void setImagephoto(Blob imagephoto) {
		this.imagephoto = imagephoto;
	}
	private String name;
	private Blob imagephoto;

}

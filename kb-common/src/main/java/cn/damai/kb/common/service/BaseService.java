package cn.damai.kb.common.service;

import java.io.Serializable;
import java.util.List;

import cn.damai.kb.common.exception.BasicException;

/**
 * @author 王惠 
 * @version 创建时间：2014年8月26日 下午3:09:58
 * @className BaseService.java
 */

public interface BaseService<E> {
	

	/**
	 * 保存数据，返回受影响的行数
	 * 
	 * @param e
	 * @return
	 */
	public int saveObj(E e) throws BasicException;
	
	/**
	 * 更新数据，返回受影响的行数
	 * 
	 * @param e
	 * @return
	 */
	public int updateObj(E e) throws BasicException;

	/**
	 * 根据id删除数据，返回受影响的行数
	 * 
	 * @param id
	 * @return
	 */
	public int deleteById(Serializable id) throws BasicException;

	/*public <T extends Serializable> int deleteObjByIds(List<T> ids)
			throws BasicException;*/

	/**
	 * 根据id查找某个对象，返回查找到的对象
	 * 
	 * @param id
	 * @return
	 */
	public E getObjById(Serializable id) throws BasicException;
	

	/**
	 * 根据多个id查找某个对象，返回查找到的对象
	 * 
	 * @param ids
	 * @return
	 */
	public <T extends Serializable> List<E> getObjByIds(List<T> ids)
			throws BasicException;

}

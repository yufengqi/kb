package cn.damai.kb.common.dao;

import java.io.Serializable;
import java.util.List;

/**
 * @author 王惠 
 * @version 创建时间：2014年8月26日 下午2:46:56
 * @className BaseDao.java
 */

public interface BaseDao {

	/**
	 * 保存数据，返回受影响的行数
	 * 
	 * @param e
	 * @return
	 */
	public <E> int save(E e) throws Exception;

	/**
	 * 更新数据，返回受影响的行数
	 * 
	 * @param e
	 * @return
	 */
	public <E> int update(E e) throws Exception;

	/**
	 * 根据主键id删除数据，返回受影响的行数
	 * 
	 * @param id
	 * @return
	 */
	public int deleteById(Serializable id) throws Exception;

	/**
	 * 根据主键id列表删除数据，返回受影响的行数
	 * 
	 * @param id
	 * @return
	 */
/*	public <T extends Serializable> int deleteByIds(List<T> ids)
			throws Exception;  用于联合主键的删除，此处没有用到联合主键！*/

	/**
	 * 根据主键id查询数据，返回一个对象
	 * 
	 * @param id
	 * @return
	 */
	public <E> E getById(Serializable id) throws Exception;
	
	/**
	 * 根据多个主键id查询数据，返回多个对象
	 * 
	 * @param ids
	 * @return
	 */
	public <E, T extends Serializable> List<E> getByIds(List<T> ids)
			throws Exception;
}

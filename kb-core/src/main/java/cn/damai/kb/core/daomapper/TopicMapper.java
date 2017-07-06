package cn.damai.kb.core.daomapper;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.damai.kb.common.dao.BaseDao;
import cn.damai.kb.core.entity.Topic;

/**
 * @author 王惠 
 * @version 创建时间：2014年8月29日 下午4:38:37
 * @className TopicMapper.java
 */

public interface TopicMapper extends BaseDao {

	/**
	 * 查找最受欢迎的话题前n条
	 * 
	 * @param n
	 * @return
	 * @throws Exception
	 */
	public <Topic> List<Topic> getMaxPopular(@Param("number") int number)
			throws Exception;
	
	/**
	 * 查找最新的话题前n条
	 * 
	 * @param n
	 * @return
	 * @throws Exception
	 */
	public <Topic> List<Topic> getNewest(@Param("number") int number)
			throws Exception;
	
	/**
	 * 通过话题名称查找相关的话题（模糊查询）
	 * 
	 * @param name
	 * @return
	 */
	public <Topic> List<Topic>  getByName(@Param("name") String name);

	/**
	 * 通过name查询话题
	 * 
	 * @param name
	 * @return
	 */
	public Topic getOneByName(@Param("name") Serializable name);
	
	
}

package cn.damai.kb.core.servicemapper;

import java.io.Serializable;
import java.util.List;

import cn.damai.kb.common.exception.BasicException;
import cn.damai.kb.common.service.BaseService;
import cn.damai.kb.core.entity.Topic;

/**
 * @author 王惠 
 * @version 创建时间：2014年8月29日 下午5:32:31
 * @className TopicService.java
 */

public interface TopicService extends BaseService<Topic> {

	/**
	 * 查找最受欢迎的话题前n条
	 * 
	 * @param n
	 * @return
	 * @throws Exception
	 */
	public List<Topic> getMaxPopularService(int n) throws Exception;
	
	/**
	 * 查找最新的话题前n条
	 * 
	 * @param n
	 * @return
	 * @throws Exception
	 */
	public List<Topic> getNewestService(int n) throws Exception;
	
	/**
	 * 通过话题名称查找相关的话题
	 * 
	 * @param n
	 * @return
	 */
	public List<Topic> getByName(String name);
	
	/**
	 * 分页查询
	 * 
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 * @throws BasicException
	 */
	public <T extends Serializable> List<Topic> getQueryAllService(int pageIndex,int pageSize)
			throws BasicException;

	/**
	 * 通过名字查询话题
	 * 
	 * @param name
	 * @return
	 */
	public Topic getObjByName(Serializable name);
}

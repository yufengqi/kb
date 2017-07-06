package cn.damai.kb.core.daomapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.damai.kb.common.dao.BaseDao;
import cn.damai.kb.core.entity.TopicProblem;

/**
 * @author 王惠 
 * @version 创建时间：2014年9月1日 下午5:49:16
 * @className TopicProblemMapper.java
 */

public interface TopicProblemMapper extends BaseDao {

	/**
	 * 根据问题id查询相关的话题和问题
	 * 
	 * @param problemid
	 * @return
	 */
	public List<TopicProblem> getByProblemId(@Param("problemid") Long problemid);
	
	/**
	 * 根据话题id查询相关的话题和问题
	 * 
	 * @param topicid
	 * @return
	 */
    public List<TopicProblem> getByTopicId(@Param("topicid") Long topicid);
}

package cn.damai.kb.core.daomapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.damai.kb.common.dao.BaseDao;
import cn.damai.kb.core.entity.UserTopic;

/**
 * @author 王惠 
 * @version 创建时间：2014年9月1日 下午5:49:45
 * @className UserTopicMapper.java
 */

public interface UserTopicMapper extends BaseDao {

	/**
	 * 根据话题id查询相关的话题和用户
	 * 
	 * @param problemid
	 * @return
	 */
	public List<UserTopic> getByTopicId(@Param("topicid") Long topicid);
	
	/**
	 * 根据用户id查询相关的用户和话题
	 * 
	 * @param userid
	 * @return
	 */
    public List<UserTopic> getByUserId(@Param("userid") Long userid);
}

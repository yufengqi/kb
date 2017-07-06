package cn.damai.kb.core.daomapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.damai.kb.common.dao.BaseDao;
import cn.damai.kb.core.entity.UserDzReply;

/**
 * @author 王惠 
 * @version 创建时间：2014年9月2日 上午9:35:12
 * @className UserDzReplyMapper.java
 */

public interface UserDzReplyMapper extends BaseDao {

	/**
	 * 根据用户ID查询相关的回复和相关用户
	 * 
	 * @param userid
	 * @return
	 */
	public List<UserDzReply> getByUserId(@Param("userid") Long userid);
	
	/**
	 * 根据回复ID查询相关的回复和相关用户
	 * 
	 * @param replyid
	 * @return
	 */
	public List<UserDzReply> getByReplyId(@Param("replyid") Long replyid);
}

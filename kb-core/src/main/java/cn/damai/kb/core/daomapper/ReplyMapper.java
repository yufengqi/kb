/**
 * 
 */
package cn.damai.kb.core.daomapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.damai.kb.common.dao.BaseDao;
import cn.damai.kb.core.entity.Reply;

/**
 * @author 王惠 
 * @version 创建时间：2014年8月29日 下午4:37:26
 * @className ReplyMapper.java
 */

public interface ReplyMapper extends BaseDao {

	/**
	 * 根据问题id查询相关的回复
	 * 
	 * @param problemid
	 * @return
	 */
	public List<Reply> getByProblemId(@Param("problemid") Long problemid);
}

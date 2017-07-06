package cn.damai.kb.core.daomapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.damai.kb.common.dao.BaseDao;
import cn.damai.kb.core.entity.UserProblem;

/**
 * @author 王惠 
 * @version 创建时间：2014年9月1日 下午5:47:59
 * @className UserProblemMapper.java
 */

public interface UserProblemMapper extends BaseDao {

	/**
	 * 根据问题id查询相关的话题和问题
	 * 
	 * @param problemid
	 * @return
	 */
	public List<UserProblem> getByProblemId(@Param("problemid") Long problemid);
	
	/**
	 * 根据话题id查询相关的话题和问题
	 * 
	 * @param userid
	 * @return
	 */
    public List<UserProblem> getByUserId(@Param("userid") Long userid);
}

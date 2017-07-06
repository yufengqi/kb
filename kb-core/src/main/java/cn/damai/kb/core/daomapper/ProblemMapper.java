package cn.damai.kb.core.daomapper;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.damai.kb.common.dao.BaseDao;
import cn.damai.kb.core.entity.Problem;


/**
 * @author 王惠 
 * @version 创建时间：2014年8月29日 下午4:36:07
 * @className ProblemMapper.java
 */

public interface ProblemMapper extends BaseDao {

	/**
	 * 分页查询
	 * 
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 * @throws Exception
	 */
	public <E, T extends Serializable> List<E> getQueryAll(@Param("pageIndex") int pageIndex,@Param("pageSize") int pageSize)
			throws Exception;
	
	/**
	 * 查找最受欢迎的问题前n条
	 * 
	 * @param number
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("hiding")
	public <Problem> List<Problem> getMaxPopular(@Param("number") int number)
			throws Exception;
	
	/**
	 * 根据问题id查询相关的回复
	 * 
	 * @param problemid
	 * @return
	 */
	public List<Problem> getByUserId(@Param("userid") Long userid);

	/**
	 * 获取所有的记录
	 * 
	 * @return
	 */
	public List<Problem> getAll();
	
}

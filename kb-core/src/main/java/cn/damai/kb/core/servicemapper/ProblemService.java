package cn.damai.kb.core.servicemapper;

import java.io.Serializable;
import java.util.List;

import cn.damai.kb.common.exception.BasicException;
import cn.damai.kb.common.service.BaseService;
import cn.damai.kb.core.entity.Problem;

/**
 * @author 王惠 
 * @version 创建时间：2014年8月29日 下午5:30:56
 * @className ProblemService.java
 */

public interface ProblemService extends BaseService<Problem> {
	
	/**
	 * 分页查询
	 * 
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 * @throws BasicException
	 */
	public <T extends Serializable> List<Problem> getQueryAllService(int pageIndex,int pageSize)
			throws BasicException;
	
	/**
	 * 查询最受欢迎的问题前n条
	 * 
	 * @param n
	 * @return
	 * @throws Exception
	 */
	public List<Problem> getMaxPopularService(int n) throws Exception;

	/**
	 * 查询所有记录
	 * 
	 * @return
	 */
	public int getAllService();

}

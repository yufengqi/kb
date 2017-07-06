package cn.damai.kb.core.servicemapper;

import java.io.Serializable;
import java.util.List;

import cn.damai.kb.common.exception.BasicException;
import cn.damai.kb.common.service.BaseService;
import cn.damai.kb.core.entity.Reply;

/**
 * @author 王惠 
 * @version 创建时间：2014年8月29日 下午5:31:48
 * @className ReplyService.java
 */

public interface ReplyService extends BaseService<Reply> {

	/**
	 * 分页查询
	 * 
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 * @throws BasicException
	 */
	public <T extends Serializable> List<Reply> getQueryAllService(int pageIndex,int pageSize)
			throws BasicException;
	
	/**
	 * 对回复点赞
	 * 
	 * @param e
	 * @return
	 */
	public <E> int savePraise(E e) throws Exception;
}

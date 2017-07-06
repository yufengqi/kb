package cn.damai.kb.core.servicemapper.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.damai.kb.common.exception.BasicException;
import cn.damai.kb.common.service.impl.BaseServiceImpl;
import cn.damai.kb.core.daomapper.ReplyMapper;
import cn.damai.kb.core.daomapper.UserDzReplyMapper;
import cn.damai.kb.core.entity.Reply;
import cn.damai.kb.core.servicemapper.ReplyService;

/**
 * @author 王惠 
 * @version 创建时间：2014年8月29日 下午5:39:37
 * @className ReplyServiceImpl.java
 */

@Service
public class ReplyServiceImpl extends BaseServiceImpl<Reply> implements ReplyService {

	
	@Resource
	private ReplyMapper replyMapper;
	@Resource
	private UserDzReplyMapper userDzReply;

	@Override
	protected ReplyMapper getDao() {
		// TODO Auto-generated method stub
		return this.replyMapper;
	}
	
	@Override
	public int saveObj(Reply e) throws BasicException {
		// TODO Auto-generated method stub
		int t = 0;
		try {
			t = this.getDao().save(e);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			//e1.printStackTrace();
			System.out.println("插入错误！请重新插入！");
		}
		return t;
	}

	@Override
	public int updateObj(Reply e) throws BasicException {
		// TODO Auto-generated method stub
		int t = 0;
		try {
			t = this.getDao().update(e);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return t;
	}

	@Override
	public int deleteById(Serializable id) throws BasicException {
		// TODO Auto-generated method stub
		int t = 0;
		try {
			t = this.getDao().deleteById(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return t;
	}

	@Override
	public Reply getObjById(Serializable id) throws BasicException {
		// TODO Auto-generated method stub
		Reply reply = null;
		try {
			reply =  this.getDao().getById(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return reply;
	}

	@Override
	public <T extends Serializable> List<Reply> getObjByIds(List<T> ids)
			throws BasicException {
		// TODO Auto-generated method stub
		List<Reply> list = null;
		try {
			list = this.getDao().getByIds(ids);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	//@Override
	public <T extends Serializable> List<Reply> getQueryAllService(
			int pageIndex, int pageSize) throws BasicException {
		// TODO Auto-generated method stub
		return null;
	}

	//@Override
	public <E> int savePraise(E e) throws Exception{
		// TODO Auto-generated method stub
		return this.userDzReply.save(e);
	}
}

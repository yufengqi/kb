package cn.damai.kb.core.servicemapper.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.damai.kb.common.exception.BasicException;
import cn.damai.kb.common.service.impl.BaseServiceImpl;
import cn.damai.kb.core.daomapper.TopicMapper;
import cn.damai.kb.core.entity.Topic;
import cn.damai.kb.core.servicemapper.TopicService;

/**
 * @author 王惠 
 * @version 创建时间：2014年8月29日 下午5:40:09
 * @className TopicServiceImpl.java
 */

@Service
public class TopicServiceImpl extends BaseServiceImpl<Topic> implements TopicService {

	
	@Resource
	private TopicMapper topicMapper;
	
	@Override
	protected TopicMapper getDao()
	{
		return this.topicMapper;
	}
	
	@Override
	public int saveObj(Topic e) throws BasicException {
		// TODO Auto-generated method stub
		int t = 0;
		try {
			t = this.getDao().save(e);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return t;
	}

	@Override
	public int updateObj(Topic e) throws BasicException {
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
		return t ;
	}

	@Override
	public Topic getObjById(Serializable id) throws BasicException {
		// TODO Auto-generated method stub
		Topic topic = null;
		try {
			topic = this.getDao().getById(id);
			return topic;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return topic;
	}

	@Override
	public <T extends Serializable> List<Topic> getObjByIds(List<T> ids)
			throws BasicException {
		// TODO Auto-generated method stub
		List<Topic> list = null;
		try {
			list = this.getDao().getByIds(ids);
			return list;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	//@Override
	public List<Topic> getMaxPopularService(int n) throws Exception {
		// TODO Auto-generated method stub
		return this.getDao().getMaxPopular(n);
	}

	//@Override
	public List<Topic> getByName(String name) {
		// TODO Auto-generated method stub
		return this.getDao().getByName(name);
	}

	//@Override
	public List<Topic> getNewestService(int n) throws Exception {
		// TODO Auto-generated method stub
		List<Topic> ls = new ArrayList<Topic>();
		 ls = this.getDao().getNewest(n);
		return ls;
	}

	//@Override
	public <T extends Serializable> List<Topic> getQueryAllService(
			int pageIndex, int pageSize) throws BasicException {
		// TODO Auto-generated method stub
	   return null;
	}

	public Topic getObjByName(Serializable name) {
		// TODO Auto-generated method stub
		return this.getDao().getOneByName(name);
	}

}

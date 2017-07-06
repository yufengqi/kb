package cn.damai.kb.core.servicemapper.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.damai.kb.common.exception.BasicException;
import cn.damai.kb.common.service.impl.BaseServiceImpl;
import cn.damai.kb.core.daomapper.TopicProblemMapper;
import cn.damai.kb.core.entity.TopicProblem;
import cn.damai.kb.core.servicemapper.TopicProblemService;

/**
 * @author 王惠 
 * @version 创建时间：2014年9月15日 上午11:04:53
 * @className TopicProblemServiceImpl.java
 */

@Service
public class TopicProblemServiceImpl extends BaseServiceImpl<TopicProblem> implements TopicProblemService {

	@Resource
	private TopicProblemMapper topicProblemMapper;

	@Override
	protected TopicProblemMapper getDao() {
		// TODO Auto-generated method stub
		return this.topicProblemMapper;
	}
	
	@Override
	public int saveObj(TopicProblem e) throws BasicException {
		// TODO Auto-generated method stub
		int t = 0;
		try {
			t = this.getDao().save(e);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			System.out.println("插入异常！");
		}
		return t;
	}

	@Override
	public int updateObj(TopicProblem e) throws BasicException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteById(Serializable id) throws BasicException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public TopicProblem getObjById(Serializable id) throws BasicException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Serializable> List<TopicProblem> getObjByIds(List<T> ids)
			throws BasicException {
		// TODO Auto-generated method stub
		return null;
	}

}

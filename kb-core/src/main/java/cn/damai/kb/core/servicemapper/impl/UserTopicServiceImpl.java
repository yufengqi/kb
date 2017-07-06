package cn.damai.kb.core.servicemapper.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.damai.kb.common.exception.BasicException;
import cn.damai.kb.common.service.impl.BaseServiceImpl;
import cn.damai.kb.core.daomapper.UserTopicMapper;
import cn.damai.kb.core.entity.UserTopic;
import cn.damai.kb.core.servicemapper.UserTopicService;

/**
 * @author 王惠 
 * @version 创建时间：2014年9月9日 下午4:27:49
 * @className UserProblemServiceImpl.java
 */

@Service
public class UserTopicServiceImpl extends BaseServiceImpl<UserTopic> implements UserTopicService{

	
	@Resource
	private UserTopicMapper userTopicMapper;
	
	@Override
	protected UserTopicMapper getDao() {
		// TODO Auto-generated method stub
		return this.userTopicMapper;
	}
	
	@Override
	public int saveObj(UserTopic e) throws BasicException {
		// TODO Auto-generated method stub
		int t = 0;
		try {
			 t = this.getDao().save(e);
			 return t;
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			System.out.println("关联插入失败！+UserTopicServiceImpl");
		}
		return t;
	}

	@Override
	public int updateObj(UserTopic e) throws BasicException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteById(Serializable id) throws BasicException {
		// TODO Auto-generated method stub
		int t = 0 ;
		try {
			t =  this.getDao().deleteById(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return t;
	}

	@Override
	public UserTopic getObjById(Serializable id) throws BasicException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Serializable> List<UserTopic> getObjByIds(List<T> ids)
			throws BasicException {
		// TODO Auto-generated method stub
		return null;
	}

}

package cn.damai.kb.core.servicemapper.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.damai.kb.common.exception.BasicException;
import cn.damai.kb.common.service.impl.BaseServiceImpl;
import cn.damai.kb.core.daomapper.UserProblemMapper;
import cn.damai.kb.core.entity.UserProblem;
import cn.damai.kb.core.servicemapper.UserProblemService;

/**
 * @author 王惠 
 * @version 创建时间：2014年9月9日 下午4:27:49
 * @className UserProblemServiceImpl.java
 */

@Service
public class UserProblemServiceImpl extends BaseServiceImpl<UserProblem> implements UserProblemService{

	
	@Resource
	private UserProblemMapper userProblemMapper;
	
	@Override
	protected UserProblemMapper getDao() {
		// TODO Auto-generated method stub
		return this.userProblemMapper;
	}
	
	@Override
	public int saveObj(UserProblem e) throws BasicException {
		// TODO Auto-generated method stub
		int t = 0;
		try {
			 t = this.getDao().save(e);
			 return t;
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			//e1.printStackTrace();
			System.out.println("关联插入失败！");
		}
		return t;
	}

	@Override
	public int updateObj(UserProblem e) throws BasicException {
		// TODO Auto-generated method stub
		return 0;
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
	public UserProblem getObjById(Serializable id) throws BasicException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Serializable> List<UserProblem> getObjByIds(List<T> ids)
			throws BasicException {
		// TODO Auto-generated method stub
		return null;
	}

}

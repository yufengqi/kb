package cn.damai.kb.core.servicemapper.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.damai.kb.common.exception.BasicException;
import cn.damai.kb.common.service.impl.BaseServiceImpl;
import cn.damai.kb.core.daomapper.ProblemMapper;
import cn.damai.kb.core.entity.Problem;
import cn.damai.kb.core.servicemapper.ProblemService;

/**
 * @author 王惠 
 * @version 创建时间：2014年8月29日 下午5:38:50
 * @className ProblemServiceImpl.java
 */

@Service
public class ProblemServiceImpl extends BaseServiceImpl<Problem> implements ProblemService {

	@SuppressWarnings("restriction")
	@Resource
	private ProblemMapper problemMapper;
	

	@Override
	protected ProblemMapper getDao() {
		// TODO Auto-generated method stub
		return this.problemMapper;
	}
	
	@Override
	public int saveObj(Problem e) throws BasicException {
		// TODO Auto-generated method stub
		int t = 0;
		try {
			t =  this.getDao().save(e);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return t;
	}

	@Override
	public int updateObj(Problem e) throws BasicException {
		// TODO Auto-generated method stub
		int t = 0;
		try {
			t =  this.getDao().update(e);
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
			t =  this.getDao().deleteById(id);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return t;
	}

	@Override
	public Problem getObjById(Serializable id) throws BasicException {
		// TODO Auto-generated method stub
		Problem problem = null;
		try {
			problem =  this.getDao().getById(id);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return problem;
	}

	@Override
	public <T extends Serializable> List<Problem> getObjByIds(List<T> ids)
			throws BasicException {
		// TODO Auto-generated method stub
		List <Problem> list = null;
		try {
			list =  this.getDao().getByIds(ids);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return list;
	}

	//@Override
	public <T extends Serializable> List<Problem> getQueryAllService(int pageIndex, int pageSize) throws BasicException {
		// TODO Auto-generated method stub
		List <Problem> list = new ArrayList<Problem>();
		try {
			list =  this.getDao().getQueryAll(pageIndex, pageSize);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			//e1.printStackTrace();
			throw new BasicException("查找失败，错误为ProblemServiceImpl");
		}
		return list;
	}

	//@Override
	public List<Problem> getMaxPopularService(int n) throws Exception {
		// TODO Auto-generated method stub
		List <Problem> list =  this.getDao().getMaxPopular(n);
		return list;
	}

	@Override
	public int getAllService() {
		// TODO Auto-generated method stub
		List <Problem> list =  this.getDao().getAll();
		return list.size();
	}
	
}

package cn.damai.kb.common.service.impl;

import java.io.Serializable;
import java.util.List;

import cn.damai.kb.common.dao.BaseDao;
import cn.damai.kb.common.exception.BasicException;
import cn.damai.kb.common.service.BaseService;
import cn.damai.kb.common.exception.ApplicationException;
import cn.damai.kb.common.exception.ParameterException;


/**
 * @author 王惠 
 * @version 创建时间：2014年8月26日 下午3:35:16
 * @param <E>
 * @className BaseServiceImpl.java
 */

public abstract class BaseServiceImpl<E> implements BaseService<E> {

	public int saveObj(E e) throws BasicException {
		if (e == null) {
			throw new ParameterException("parameter object is null...");
		}
		try {
			return this.getDao().save(e);
		} catch (Exception ex) {
			throw new ApplicationException(ex);
		}
		
	}
	
	public int updateObj(E e) throws BasicException {
		if (e == null) {
			throw new ParameterException("parameter object is null...");
		}
		try {
			return this.getDao().update(e);
		} catch (Exception ex) {
			throw new ApplicationException(ex);
		}
	}
	
	public int deleteById(Serializable id) throws BasicException {
		if (id == null) {
			throw new ParameterException("parameter id is null...");
		}
		try {
			return this.getDao().deleteById(id);
		} catch (Exception e) {
			throw new ApplicationException(e);
		}
	}
	
	public E getObjById(Serializable id) throws BasicException {
		if (id == null) {
			throw new ParameterException("parameter id is null...");
		}
		try {
			return this.getDao().getById(id);
		} catch (Exception e) {
			throw new ApplicationException(e);
		}
	}
	
	public <T extends Serializable> List<E> getObjByIds(List<T> ids)
			throws BasicException {
		if (ids == null || ids.size() == 0) {
			throw new ParameterException(
					"parameter idList is null or idList.size = 0...");
		}
		try {
			return this.getDao().getByIds(ids);
		} catch (Exception ex) {
			throw new ApplicationException(ex);
		}
	}
	
	protected abstract BaseDao getDao();
}

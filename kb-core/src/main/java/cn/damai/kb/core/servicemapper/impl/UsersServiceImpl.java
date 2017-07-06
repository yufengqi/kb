package cn.damai.kb.core.servicemapper.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.damai.kb.common.exception.BasicException;
import cn.damai.kb.common.service.impl.BaseServiceImpl;
import cn.damai.kb.core.daomapper.UsersMapper;
import cn.damai.kb.core.entity.Users;
import cn.damai.kb.core.servicemapper.UsersService;

/**
 * @author 王惠 
 * @version 创建时间：2014年8月27日 下午1:36:03
 * @className UsersServiceImpl.java
 */

@Service
public class UsersServiceImpl extends BaseServiceImpl<Users> implements UsersService {
	
	@Resource
	private UsersMapper usersMapper;
	
	@Override
	protected UsersMapper getDao()
	{
		return this.usersMapper;
	}

	public int saveObj(Users e) throws BasicException {
		// TODO Auto-generated method stub
		int t = 0;
		try {
			t = this.getDao().save(e);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			System.out.println("用户注册失败，请重新注册！");
		}
		return t;
	}

	public int updateObj(Users e) throws BasicException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteById(Serializable id) throws BasicException {
		// TODO Auto-generated method stub
		return 0;
	}

	public Users getObjById(Serializable id) throws BasicException {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends Serializable> List<Users> getObjByIds(List<T> ids)
			throws BasicException {
		// TODO Auto-generated method stub
		return null;
	}

	
	//这个地方可以考虑抛出异常---throws BasicException  再考虑考虑
	public Users getByNamePwdService(String email, String pwd) {
		// TODO Auto-generated method stub
		Users user = this.getDao().getByEmailPwd(email, pwd);
		if(null!=user)
		{
			return user;
		}
		else
		{
			//throws new BasicException
			System.out.println("此次需要做异常处理");
		}
		return null;
			
	}

	//@Override
	public <T extends Serializable> List<Users> getQueryAllService(
			int pageIndex, int pageSize) throws BasicException {
		// TODO Auto-generated method stub
		return null;
	}

	//@Override
	public Users getByNameService(String email) {
		// TODO Auto-generated method stub
		return this.getDao().getByEmail(email);
	}

}

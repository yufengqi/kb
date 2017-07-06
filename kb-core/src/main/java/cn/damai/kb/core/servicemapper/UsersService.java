package cn.damai.kb.core.servicemapper;

import java.io.Serializable;
import java.util.List;

import cn.damai.kb.common.exception.BasicException;
import cn.damai.kb.common.service.BaseService;
import cn.damai.kb.core.entity.Users;

/**
 * @author 王惠 
 * @version 创建时间：2014年8月27日 下午1:24:43
 * @className UsersService.java
 */

public interface UsersService extends BaseService<Users> {
	
	/**
	 * 通过用户的Email 和 pwd 来查询用户
	 * 
	 * @param email
	 * @param pwd
	 * @return
	 */
	public Users getByNamePwdService(String email,String pwd);
	
	/**
	 * 通过Email查询数据库中的用户
	 * 
	 * @param email
	 * @return
	 */
	public Users getByNameService(String email);
	
	/**
	 * 分页查询
	 * 
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 * @throws BasicException
	 */
	public <T extends Serializable> List<Users> getQueryAllService(int pageIndex,int pageSize)
			throws BasicException;

}

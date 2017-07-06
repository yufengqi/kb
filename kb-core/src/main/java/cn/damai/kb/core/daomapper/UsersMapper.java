package cn.damai.kb.core.daomapper;

import cn.damai.kb.common.dao.BaseDao;
import org.apache.ibatis.annotations.Param;

/**
 * @author 王惠 
 * @version 创建时间：2014年8月27日 上午11:18:14
 * @className UsersMapper.java
 */

public interface UsersMapper extends BaseDao{

	/**
	 * 通过Email 和 password 来查找用户，返回一个对象
	 * 
	 * @param email
	 *            
	 * @param password
	 *            
	 * @return
	 */
	public <Users> Users getByEmailPwd(@Param("email") String email,@Param("password") String password);
	
	/**
	 * 通过email 查询数据库中是否存在
	 * 
	 * @param email
	 * @return
	 */
	public <Users> Users getByEmail(@Param("email") String email);
}

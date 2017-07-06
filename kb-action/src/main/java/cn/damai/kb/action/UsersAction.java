package cn.damai.kb.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.damai.kb.core.entity.Problem;
import cn.damai.kb.core.entity.Topic;
import cn.damai.kb.core.entity.UserProblem;
import cn.damai.kb.core.entity.Users;
import cn.damai.kb.core.servicemapper.UsersService;

import com.opensymphony.xwork2.ModelDriven;

/**
 * @author 王惠 
 * @version 创建时间：2014年8月28日 上午11:44:31
 * @className UsersAction.java
 */

@Controller
@Scope("prototype")
@ParentPackage("httl-default") 
@Namespace("/user") 
public class UsersAction extends BaseAction implements ModelDriven<Users>{

	private static final long serialVersionUID = -1264537708525276917L;

	@Resource
	private UsersService usersService;
	
	private Users user = new Users();
	
	public Users getUser()
	{
		return this.user;
	}
	
	//@Override
	public Users getModel() {
		// TODO Auto-generated method stub
		System.out.println("wo dao action lai l !");
		return user;
	}
//
//	@Action(value = "userRegister", className = "cn.damai.kb.action.UsersAction" ,results = { @Result(name = SUCCESS, 
//			location = "/index.jsp"),
//			 @Result(name = ERROR, location = "/404")}) 
	public String register()
	{
		if(this.usersService.saveObj(this.user) > 0)
		{
			return SUCCESS;
		}
		return ERROR;
		 
	}
	
	@Action(value = "userLogin", results = {@Result(name = "success",type = "httl" ,location = "kb-war/web-inf/view/myself/myself.httl"),
			@Result(name = "error",type = "chain" ,location = "login")})
	public String login()
	{
		if(this.user.getEmail()!=null && this.user.getPassword()!=null)
		{
			this.user = this.usersService.getByNamePwdService(this.user.getEmail(),
	    		this.user.getPassword());
		}
		else
		{
			this.user = (Users) super.getSessionAttr("Users");
			if(null != this.user)
			 {
				this.user = this.usersService.getByNamePwdService(this.user.getEmail(),
		    		this.user.getPassword());
			 }
			else
				return ERROR;
		}
		if(this.user != null)
		{
			super.setSessionAttr("Users", this.user);
			return SUCCESS;
		}
		return ERROR;
	}
	
	public String logout()
	{
		super.setSessionAttr("Users", null);
		return SUCCESS;
	}
	
	public String isEmail()
	{
		PrintWriter out;
		super.getResponse().setContentType("text/html;charset=utf-8");
		try {
			 out = super.getResponse().getWriter();
			 if(super.getParameter("email") != null)
	         {
	        	 if(this.usersService.getByNameService(super.getParameter("email")) != null)
	        	 {
	        		 out.print("此邮箱已存在，请重新输入！");
		        	 out.flush();
		        	 return null;
	        	 }
	        	 else
	        	 {
	        		 out.print("此邮箱可用！");
		        	 out.flush();
		        	 return null;
	        	 }
	         }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		return null;
	}
}

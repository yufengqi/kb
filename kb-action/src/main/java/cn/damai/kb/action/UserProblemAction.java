package cn.damai.kb.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.damai.kb.core.entity.Problem;
import cn.damai.kb.core.entity.UserProblem;
import cn.damai.kb.core.entity.Users;
import cn.damai.kb.core.servicemapper.ProblemService;
import cn.damai.kb.core.servicemapper.UserProblemService;

import com.opensymphony.xwork2.ModelDriven;

/**
 * @author 王惠 
 * @version 创建时间：2014年9月11日 上午9:26:47
 * @className UserProblemAction.java
 */

@Controller
@Scope("prototype")
public class UserProblemAction extends BaseAction implements ModelDriven<UserProblem> {

	private static final long serialVersionUID = 7504838049039365017L;
	
	@Resource
	private ProblemService problemService;
	
	@Resource
	private UserProblemService userProblemService;
	
	
	private UserProblem userProblem  = new UserProblem();
	
	//@Override
	public UserProblem getModel() {
		// TODO Auto-generated method stub
		return this.userProblem;
	}

	public UserProblem getUserProblem() {
		return userProblem;
	}
	
	public String addAttentions()
	{

		Problem  p = this.problemService.getObjById(super.getParameter("proid"));
		this.userProblem.setUser((Users) super.getSessionAttr("Users"));
		this.userProblem.setProblem(p);
		super.setSessionAttr("proid",p.getId());
		if(this.userProblemService.saveObj(this.userProblem) > 0)
		{
			return SUCCESS;
		}
		return ERROR;
	}
	
	public String qxProblem()
	{
		if(this.userProblemService.deleteById(super.getParameter("upid")) > 0)
		{
			return SUCCESS;
		}
		return ERROR;
	}
}

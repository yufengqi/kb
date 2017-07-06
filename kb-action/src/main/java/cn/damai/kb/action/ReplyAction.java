package cn.damai.kb.action;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.ExceptionMapping;
import org.apache.struts2.convention.annotation.ExceptionMappings;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.damai.kb.core.entity.Reply;
import cn.damai.kb.core.entity.Users;
import cn.damai.kb.core.servicemapper.ProblemService;
import cn.damai.kb.core.servicemapper.ReplyService;

import com.opensymphony.xwork2.ModelDriven;

/**
 * @author 王惠 
 * @version 创建时间：2014年8月29日 下午4:29:04
 * @className ReplyAction.java
 */

@Controller
@Scope("prototype")
//@ParentPackage("struts-default") 

//@Results( { @Result(name = "success", location = "/index.jsp"), 
//        @Result(name = "error", location = "/404") }) 
//@ExceptionMappings( { @ExceptionMapping(exception = "java.lange.RuntimeException", result = "error") }) 
public class ReplyAction extends BaseAction implements ModelDriven<Reply> {

	private static final long serialVersionUID = 4092118378581370548L;
	
	@Resource
	private ReplyService replyService;
	@Resource
	private ProblemService problemService;

	private Reply reply = new Reply();
	
	public Reply getReply()
	{
		return this.reply;
	}
	
	//@Override
	public Reply getModel() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String addReply()
	{
		this.reply.setUser((Users)super.getSessionAttr("Users"));
		int proid = Integer.parseInt(super.getParameter("proid"));
		this.reply.setProblem(this.problemService.getObjById(proid));
		super.setSessionAttr("proid", proid);
		if(this.replyService.saveObj(this.reply) > 0)
		{
			return SUCCESS;
		}
		return ERROR;
	}

}

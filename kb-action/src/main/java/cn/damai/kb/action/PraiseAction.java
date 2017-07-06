package cn.damai.kb.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.damai.kb.core.entity.Reply;
import cn.damai.kb.core.entity.UserDzReply;
import cn.damai.kb.core.entity.Users;
import cn.damai.kb.core.servicemapper.ReplyService;

import com.opensymphony.xwork2.ModelDriven;

/**
 * @author 王惠 
 * @version 创建时间：2014年9月9日 下午2:40:26
 * @className PraiseAction.java
 */

@Controller
@Scope("prototype")
public class PraiseAction extends BaseAction implements ModelDriven<UserDzReply> {

	private static final long serialVersionUID = -776013044858355964L;
	
	@Resource
	private ReplyService replyService;
	
	private UserDzReply userDzReply = new UserDzReply();
	
	public UserDzReply getUserDzReply()
	{
		return this.userDzReply;
	}
	
	//@Override
	public UserDzReply getModel() {
		// TODO Auto-generated method stub
		return this.userDzReply;
	}
	
	public String  addPraise()
	{
		this.userDzReply.setUser((Users) super.getSessionAttr("Users"));
		Reply r = this.replyService.getObjById(super.getParameter("replyid"));
		this.userDzReply.setReply(r);
		super.setSessionAttr("proid",r.getProblem().getId());
		try {
			this.replyService.savePraise(this.userDzReply);
			return SUCCESS;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("插入失败，请重新插入！");
		}
		return ERROR;
	}

}

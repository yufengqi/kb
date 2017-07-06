package cn.damai.kb.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.damai.kb.core.entity.Problem;
import cn.damai.kb.core.entity.Topic;
import cn.damai.kb.core.entity.UserTopic;
import cn.damai.kb.core.entity.Users;
import cn.damai.kb.core.servicemapper.TopicService;
import cn.damai.kb.core.servicemapper.UserTopicService;

import com.opensymphony.xwork2.ModelDriven;

/**
 * @author 王惠 
 * @version 创建时间：2014年9月11日 上午9:26:47
 * @className UserTopicAction.java
 */

@Controller
@Scope("prototype")
public class UserTopicAction extends BaseAction implements ModelDriven<UserTopic> {

	private static final long serialVersionUID = 722310167607225022L;
	 
	@Resource
	private  UserTopicService userTopicService;
	@Resource
	private TopicService topicService;
	
	private UserTopic userTopic = new UserTopic();
	
	//@Override 
	public UserTopic getModel() {
		// TODO Auto-generated method stub
		return this.userTopic;
	}
	
	
	public String addAttentiontopic()
	{
		Topic t = this.topicService.getObjById(super.getParameter("topicid"));
		this.userTopic.setUser((Users) super.getSessionAttr("Users"));
		this.userTopic.setTopic(t);
		if(this.userTopicService.saveObj(this.userTopic) > 0)
		{
			return SUCCESS;
		}
		return ERROR;
	}
	
	public String qxAttentiontopic()
	{
		if(this.userTopicService.deleteById(super.getParameter("utid")) > 0)
		{
			return SUCCESS;
		}
		return ERROR;
	}

}

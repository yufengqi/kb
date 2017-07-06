package cn.damai.kb.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.damai.kb.core.entity.Topic;
import cn.damai.kb.core.entity.TopicProblem;
import cn.damai.kb.core.servicemapper.TopicService;

import com.opensymphony.xwork2.ModelDriven;

/**
 * @author 王惠 
 * @version 创建时间：2014年8月29日 下午4:27:01
 * @className TopicAction.java
 */

@Controller
@Scope("prototype")
//@ParentPackage("struts-default") 
public class TopicAction extends BaseAction implements ModelDriven<Topic> {

	private static final long serialVersionUID = -6344584940260931553L;
	
	@Resource
	private TopicService topicService;

	private Topic topic = new Topic();
	
	private List<Topic> topics = new ArrayList<Topic>();
	
	public List<Topic> getTopics() {
		return topics;
	}

	public void setTopics(List<Topic> topics) {
		this.topics = topics;
	}

	public Topic getTopic()
	{
		return this.topic;
	}
	
	//@Override
	public Topic getModel() {
		// TODO Auto-generated method stub
		return this.topic;
	}
	
	public String getNewestTopic()
	{
		try {
			this.topics = this.topicService.getNewestService(10);
			return SUCCESS;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("你所查找的对象为空！");
		}
		return ERROR;
	}
	
	
	public String chooseTopic()
	{
		PrintWriter out;
		super.getResponse().setContentType("text/html;charset=utf-8");
		try {
			 out = super.getResponse().getWriter();
			 if(super.getParameter("topic") != null)
	         {
	        	 StringBuffer sb = new StringBuffer();
	        	 sb.append("请根据以下话题选择输入话题！<br/>");
	        	 super.setSessionAttr("topic", super.getParameter("topic"));
	        	 this.topics = this.topicService.getByName(super.getParameter("topic"));
	        	 for(Topic t : topics)
	        	 {
	        		 sb.append(t.getName()+"<br/>");
	        	 }
	        	 out.print(sb.toString());
	        	 out.flush();
	         }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			 try {
				out = super.getResponse().getWriter();
				out.print("请根据提示输入话题！");
	        	out.flush();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} 
		}
		return null;
	}
	
	

}

package cn.damai.kb.action;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.ExceptionMapping;
import org.apache.struts2.convention.annotation.ExceptionMappings;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.damai.kb.core.entity.Problem;
import cn.damai.kb.core.entity.TopicProblem;
import cn.damai.kb.core.entity.Users;
import cn.damai.kb.core.servicemapper.ProblemService;
import cn.damai.kb.core.servicemapper.TopicProblemService;
import cn.damai.kb.core.servicemapper.TopicService;
import cn.damai.kb.util.SinglePage;

import com.opensymphony.xwork2.ModelDriven;

/**
 * @author 王惠 
 * @version 创建时间：2014年8月29日 下午4:22:59
 * @className ProblemAction.java
 */

@Controller
@Scope("prototype")

//@Results( { @Result(name = "success", location = "/index.jsp"), 
//        @Result(name = "error", location = "/404") }) 
//@ExceptionMappings( { @ExceptionMapping(exception = "java.lange.RuntimeException", result = "error") }) 
public class ProblemAction extends BaseAction implements ModelDriven<Problem>{

	private static final long serialVersionUID = 1376836793030350647L;
	
	@Resource
	private ProblemService problemService;
	@Resource
	private TopicService topicServcie;
	@Resource
	private TopicProblemService topicProblemService;

	private Problem problem = new Problem();
	
	private List<Problem> problemlist = new ArrayList<Problem>();
	
	public Problem getProblem()
	{
		return this.problem;
	}
	
	//@Override
	public Problem getModel() {
		// TODO Auto-generated method stub
		return problem;
	}

	public String addProblem()
	{	
		this.problem.setUser((Users) super.getSessionAttr("Users"));
		int key = this.problemService.saveObj(this.problem);
		if( key > 0) 
		{
			if( this.topicProblemService.saveObj(new TopicProblem(this.problem,this.topicServcie.getObjByName((Serializable) super.getSessionAttr("topic")))) > 0 )
			{
				return SUCCESS;
			}
			
		}
	    return ERROR;	
	}
	
	public String getProblems()
	{	
		SinglePage.getPage().setPageRecords(this.problemService.getAllService());
		
        int pageIndex = 1;
        if(super.getParameter("pageIndex")!=null)
        {
        	pageIndex = Integer.parseInt(super.getParameter("pageIndex"));
        	SinglePage.getPage().setPageIndex(pageIndex);
        }
		this.problemlist = this.problemService.getQueryAllService(pageIndex-1,SinglePage.getPage().PAGESIZE);
		if(null != problemlist)
		{
			return SUCCESS;
		}
		return ERROR;
	}
	
	public String getProblemDetatils()
	{
		if(null != super.getParameter("id"))
		{
			this.problem = this.problemService.getObjById(super.getParameter("id"));
	    }
		else
		{
			this.problem = this.problemService.getObjById((Serializable) super.getSessionAttr("proid"));
		}
		if(null != this.problem)
		{
			return SUCCESS;
	    }
		return ERROR;
	}
	
	public String getProblemPopular()
	{
        SinglePage.getPage().setPageRecords(20);
		
        int pageIndex = 1;
        if(super.getParameter("pageIndex")!=null)
        {
        	pageIndex = Integer.parseInt(super.getParameter("pageIndex"));
        	SinglePage.getPage().setPageIndex(pageIndex);
        }
		try {
			this.problemlist = this.problemService.getMaxPopularService((pageIndex)*SinglePage.getPage().PAGESIZE);
			return SUCCESS;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ERROR;
	}

	public List<Problem> getProblemlist() {
		return problemlist;
	}

	public void setProblemlist(List<Problem> problemlist) {
		this.problemlist = problemlist;
	}
}

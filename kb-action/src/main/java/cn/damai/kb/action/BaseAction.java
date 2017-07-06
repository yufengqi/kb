package cn.damai.kb.action;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author 王惠 
 * @version 创建时间：2014年8月29日 上午10:30:04
 * @className BaseAction.java
 */

public class BaseAction extends ActionSupport{

	private static final long serialVersionUID = 8295982715732639414L;

	/**
	 * 用于将返回的对象存入sessio中，提供所有的action类使用，
	 * 以下方法类似，均用于取到jsp中一些内置对象方便使用
	 * @param key
	 * @param value
	 */
	protected void setSessionAttr(String key, Object value) {
		ServletActionContext.getRequest().getSession().setAttribute(key, value);
	}

	protected Object getSessionAttr(String key) {
		return ServletActionContext.getRequest().getSession().getAttribute(key);
	}

	protected ServletContext getServletContext() {
		return ServletActionContext.getServletContext();
	}

	protected HttpServletRequest getRequest() {
		return ServletActionContext.getRequest();
	}

	protected String getParameter(String name) {
		return getRequest().getParameter(name);
	}

	protected HttpServletResponse getResponse() {
		return ServletActionContext.getResponse();
	}

}

package cn.damai.kb.util;

/**
 * @author 王惠 
 * @version 创建时间：2014年9月24日 上午9:48:24
 * @className SinglePage.java
 */

public class SinglePage {

	private static Page page = new Page();
	
	public static Page getPage()
	{
		if(page != null)
		{
			return page;
		}
		else
		{
			return new Page();
		}
	}
}

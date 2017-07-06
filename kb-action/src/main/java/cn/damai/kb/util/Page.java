package cn.damai.kb.util;


import java.util.List;

/**
 * @author 王惠 
 * @version 创建时间：2014年9月9日 下午2:40:26
 * @className Page.java
 */

public class Page {

	public static final int PAGESIZE = 10;
	private int allRecords;
	private int totalPages;
	private int pageIndex = 1;
	
	public int getPageIndex() {
		return pageIndex;
	}
	
	public void setPageRecords(int allRecords){
		this.allRecords = allRecords;
		this.totalPages = (allRecords % PAGESIZE == 0) ? (allRecords / PAGESIZE)
				: (allRecords / PAGESIZE + 1);
	}
	
	public Page() {
	}

	public int prious(){
		if(pageIndex != 1){
			return pageIndex - 1;
		}else{
			return 1;
		}
	}

	public int next(){
		if(pageIndex < totalPages){
			return pageIndex + 1;
		}else{
			return totalPages;
		}
	}
	
	public int top(){
		return 1;
	}
	
	public int end(){
		return totalPages;
	}
	
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	@Override
	public String toString() {
		return "Page [allRecords=" + allRecords + ", pageIndex=" + pageIndex
				+ ", totalPages=" + totalPages + "]";
	}

	

}

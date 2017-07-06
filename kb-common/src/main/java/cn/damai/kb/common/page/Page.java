package cn.damai.kb.common.page;

import java.io.Serializable;
import java.util.List;

/**
 * @author 王惠 
 * @version 创建时间：2014年9月3日 上午11:08:23
 * @className Page.java
 */

public class Page<E extends Serializable> implements Serializable {

	private static final long serialVersionUID = -8511626977685301930L;
	
	private List<E> data;

	private int currentPage;
	private int firstResult;
	private int totalResults;
	private int onePageSize;
	private int totalPage;
	private int nextPage;
	private int previousPage;

	public Page(int currentPage, int onePageSize) {
		if (currentPage > 1)
			this.currentPage = currentPage;
		else
			this.currentPage = 1;
		this.onePageSize = onePageSize;
		this.firstResult = (this.currentPage - 1) * this.onePageSize;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
		if (currentPage <= 0)
			this.currentPage = 1;
		if (currentPage > this.totalPage)
			this.currentPage = totalPage;
		this.firstResult = (this.currentPage - 1) * this.onePageSize;

	}

	public int getOnePageSize() {
		return onePageSize;
	}

	public void setOnePageSize(int onePageSize) {
		this.onePageSize = onePageSize;
	}

	public int getTotalResults() {
		return totalResults;
	}

	public void setTotalResults(int totalResults) {
		this.totalResults = totalResults;
		if (totalResults % this.onePageSize == 0) {
			this.totalPage = totalResults / this.onePageSize;
		} else {
			this.totalPage = (int) Math.floor(totalResults / this.onePageSize) + 1;
		}

		if (this.totalPage == 0) {
			this.totalPage = 1;
		}
		if (this.currentPage > totalPage) {
			this.currentPage = totalPage;
			this.firstResult = (this.currentPage - 1) * this.onePageSize;

		}
		if (this.currentPage > 1) {
			this.previousPage = this.currentPage - 1;
		} else {
			this.previousPage = 1;
		}
	}

	public int getFirstResult() {
		return firstResult;
	}

	public int getNextPage() {
		if (this.currentPage < this.totalPage) {
			this.nextPage = this.currentPage + 1;
		} else {
			this.nextPage = this.totalPage;
		}
		return nextPage;
	}

	public int getPreviousPage() {
		return previousPage;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public List<E> getData() {
		return data;
	}

	public void setData(List<E> data) {
		this.data = data;
	}

}

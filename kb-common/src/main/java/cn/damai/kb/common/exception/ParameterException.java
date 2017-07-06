package cn.damai.kb.common.exception;

import cn.damai.kb.common.exception.BasicException;

/**
 * @author 王惠 
 * @version 创建时间：2014年8月26日 下午3:52:30
 * @className ParameterException.java
 */

public class ParameterException extends BasicException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8959070905325799353L;

	public ParameterException() {
        super();
    }

    public ParameterException(String msg) {
        super(msg);
    }
}

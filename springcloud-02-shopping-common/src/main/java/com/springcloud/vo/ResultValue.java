package com.springcloud.vo;

import java.util.Map;

import lombok.Data;

/**
 * 定义本项目中所有controller返回结果的类型
 * @author Administrator
 *
 */
@Data
public class ResultValue implements java.io.Serializable {

	private static final long serialVersionUID = -7333058567132357663L;
	
	/**
	 * 设置返回结果的状态，0表示成功，1表示失败
	 */
	private Integer code;
	
	/**
	 * 设置返回的信息
	 */
	private String message;
	
	private Map<String, Object> dataMap;

}

package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TYPE_TWO表对应的实体类，用于保存表中一行二级类别信息
 * 
 * @author Administrator
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TypeTwo implements java.io.Serializable {
	
	private static final long serialVersionUID = -9117495822231456760L;

	/**
	 * 类别二编号
	 */
	private Integer typeTwoId;

	/**
	 * 类别二名称
	 */
	private String typeTwoName;

	/**
	 * 类别一编号
	 */
	private Integer typeOneId;

	/**
	 * 备注
	 */
	private String typeTwoRemark;

}
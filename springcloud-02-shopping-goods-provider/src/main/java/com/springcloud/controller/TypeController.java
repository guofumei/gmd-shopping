package com.springcloud.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.entity.TypeOne;
import com.springcloud.entity.TypeTwo;
import com.springcloud.service.TypeService;
import com.springcloud.vo.ResultValue;

/**
 * 一级类别与二级类别的控制器
 * 
 * @author Administrator
 *
 */
@RestController
@RequestMapping("type")
public class TypeController {

	@Autowired
	private TypeService typeService;

	/**
	 * 查询所有一级类别信息
	 * 
	 * @return
	 */
	@RequestMapping(value = "/selectAll")
	public ResultValue selectAll() {
		ResultValue rv = new ResultValue();

		try {
			List<TypeOne> typeOne = this.typeService.selectAllTypeOne();
			if (typeOne != null && typeOne.size() > 0) {
				rv.setCode(0);
				Map<String, Object> map = new HashMap<>();
				map.put("allTypeOne", typeOne);
				rv.setDataMap(map);
				return rv;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		rv.setCode(1);

		return rv;
	}

	/**
	 * 根据一级类别编号查询相应的二级类别信息
	 * 
	 * @param typeOneId 一级类别编号
	 * @return
	 */
	@RequestMapping(value = "/selectById")
	public ResultValue selectById(@RequestParam("typeOneId") Integer typeOneId) {

		ResultValue rv = new ResultValue();
		try {
			List<TypeTwo> typeTwoByTypeOneId = this.typeService.selectTypeTwoByTypeOneId(typeOneId);
			if (typeTwoByTypeOneId != null && typeTwoByTypeOneId.size() > 0) {
				rv.setCode(0);
				Map<String, Object> map = new HashMap<>();
				map.put("typeTwoByTypeOneId", typeTwoByTypeOneId);
				rv.setDataMap(map);
				return rv;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		rv.setCode(1);
		return rv;

	}

}

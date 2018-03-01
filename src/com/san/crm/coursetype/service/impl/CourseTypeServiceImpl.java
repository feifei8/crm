package com.san.crm.coursetype.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.san.crm.coursetype.dao.CourseTypeDao;
import com.san.crm.coursetype.domain.CrmCourseType;
import com.san.crm.coursetype.service.CourseTypeService;

public class CourseTypeServiceImpl implements CourseTypeService {
	private CourseTypeDao courseTypeDao;
	public void setCourseTypeDao(CourseTypeDao courseTypeDao) {
		this.courseTypeDao = courseTypeDao;
	}
	public List<CrmCourseType> findAll() {
		 
		return courseTypeDao.findAll();
	}

	public List<CrmCourseType> findAll(CrmCourseType courseType) {
		//拼凑查询条件
		StringBuilder buider=new StringBuilder();
		//拼凑实际参数
		List<Object> paramsList=new ArrayList<Object>();
		
		//课程类别(名称)
		if(StringUtils.isNotBlank(courseType.getCourseName())){
			buider.append(" and courseName like ?");
			paramsList.add("%"+courseType.getCourseName()+"%");
		}
		//课程简介
		if(StringUtils.isNotBlank(courseType.getRemark())){
			buider.append(" and remark like ?");
			paramsList.add("%"+courseType.getRemark()+"%");
		}
		//总学时
		if(StringUtils.isNotBlank(courseType.getTotalStart())){
			buider.append(" and total >= ?");
			paramsList.add(Integer.parseInt(courseType.getTotalStart()));
		}
		if(StringUtils.isNotBlank(courseType.getTotalEnd())){
			buider.append(" and total <= ?");
			paramsList.add(Integer.parseInt(courseType.getTotalEnd()));
		}
		//课程费用
		if(StringUtils.isNotBlank(courseType.getCourseCostStart())){
			buider.append(" and courseCost >= ?");
			paramsList.add(Double.parseDouble(courseType.getCourseCostStart()));
		}
		if(StringUtils.isNotBlank(courseType.getCourseCostEnd())){
			buider.append(" and courseCost <= ?");
			paramsList.add(Double.parseDouble(courseType.getCourseCostEnd()));
		}
		String condition=buider.toString();
		Object[] params=paramsList.toArray();
		return courseTypeDao.findAll(condition, params);
	}

}

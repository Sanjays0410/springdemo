package com.cruds.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cruds.db.DepartmentDAO;
import com.cruds.entity.Department;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentDAO dao;
	 
	public void create(Department d) 
	{
		dao.create(d);
	}
	public Department  get(int deptid)
	{
		
		return dao.get(deptid);
	}
	public List<Department> getall()
	{
		return dao.getall();
	}
	public void delete(int deptid)
	{
		 dao.delete(deptid);
	}
	public void update(Department d)
	{
		dao.update(d);
	}
	
}

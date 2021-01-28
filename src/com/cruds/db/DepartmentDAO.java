package com.cruds.db;

import java.util.List;

import com.cruds.entity.Department;

public interface DepartmentDAO {

	
	public void create(Department d );
	
	public Department get( int deptid);
	
	public List<Department> getall();
	
	public void delete(int deptid);
	
	public void update(Department d);
}

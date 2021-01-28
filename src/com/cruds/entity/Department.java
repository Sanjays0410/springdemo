package com.cruds.entity;

public class Department {

	
	private int deprid;
	private String deptname;
	
	public Department() {
		// TODO Auto-generated constructor stub
	}
	public Department(int deprid, String deptname) {
		super();
		this.deprid = deprid;
		this.deptname = deptname;
	}
	public int getDeprid() {
		return deprid;
	}
	public void setDeprid(int deprid) {
		this.deprid = deprid;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	@Override
	public String toString() {
		return "Department [deprid=" + deprid + ", deptname=" + deptname + "]";
	}
	
	
	
}

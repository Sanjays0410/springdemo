package com.cruds.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.cruds.entity.Department;
@Repository
public class DepartmentDAOImpl implements DepartmentDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	

	@Override
	public void create(Department d) {
		// TODO Auto-generated method stub
		String sql="insert into department(deptid,deptname) values(?,?)";
		jdbcTemplate.update(sql,new Object[]{d.getDeprid(),d.getDeptname()});
		
		
	}


	@Override
	public Department get(int deptid) {
		String sql="select * from department where deptid=?";
		Department d=jdbcTemplate.queryForObject(sql, new Object[]{deptid},new DeptRowMapper());
		return d;
	}



	@Override
	public List<Department> getall() {
		
		String sql="select * from department";
		List< Department> deptlist=jdbcTemplate.query(sql, new DeptRowMapper());
		return deptlist;
	}


	@Override
	public void delete(int deptid) {
		
		String sql="delete from department where deptid=?";
		 jdbcTemplate.update(sql, new Object[]{deptid});
		 
	}

	@Override
	public void update(Department d) {
		
		String sql="update department set deptname=? where deptid=?";
		jdbcTemplate.update(sql, new Object[]{d.getDeptname(),d.getDeprid()});
	}

	class DeptRowMapper implements RowMapper<Department>
	{

		@Override
		public Department mapRow(ResultSet rs, int arg1) throws SQLException {
			// TODO Auto-generated method stub
			
			Department d=new Department();
			d.setDeprid(rs.getInt(1));
			d.setDeptname(rs.getString(2));
			return d;
		}
		
	}
}

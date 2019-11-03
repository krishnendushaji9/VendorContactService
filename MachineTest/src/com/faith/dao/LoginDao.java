package com.faith.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.faith.model.Login;

public class LoginDao implements ILogin {
	// setting Jdbc template

	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public List<Login> getAllDetails() {
		// TODO Auto-generated method stub
		return template.query("select userid,username,password from login order by userid desc",
				new RowMapper<Login>() {

					@Override
					public Login mapRow(ResultSet rs, int row) throws SQLException {
						// TODO Auto-generated method stub
						Login login = new Login();
						login.setId(rs.getLong(1));
						login.setUsername(rs.getString(2));
						login.setPassword(rs.getString(3));
						
						return login;
					}

				});

	}

	

	
	@Override
	public Login searchUserDetails(String username, String password) {
		// TODO Auto-generated method stub
		String sql = "select userid,username,password from login where username=? and password=?";
		return template.queryForObject(sql, new Object[] { username, password },
				new BeanPropertyRowMapper<Login>(Login.class));
	}

	

}

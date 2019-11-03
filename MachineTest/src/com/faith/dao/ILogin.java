package com.faith.dao;

import java.util.List;

import com.faith.model.Login;

public interface ILogin {

	public abstract List<Login> getAllDetails();

	public abstract Login searchUserDetails(String username, String password);

}

package com.springboot.qunawan.service.impl;


import com.springboot.qunawan.dao.UserMapper;
import com.springboot.qunawan.pojo.User;
import com.springboot.qunawan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserMapper userMapper;
	
	@Override
	public User findUserById(int userid) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(userid);
	}

	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		return userMapper.checkUser(user);
	}

	@Override
	public Boolean checkPhone(String phone) {
		if(userMapper.checkPhone(phone)!=null)
			return true;
		return false;
	}

	@Override
	public Boolean checkEmail(String email) {
		if(userMapper.checkPhone(email)!=null)
			return true;
		return false;
	}

	@Override
	public void sign(User user) {
		userMapper.sign(user);
	}

	@Override
	public Boolean update(User user) {
		userMapper.updateByPrimaryKey(user);
		return true;
	}

	@Override
	public int updatepsw(User user) {
		return userMapper.updatepsw(user);
	}

	@Override
	public int updateuser(User user) {
		return userMapper.updateuser(user);
	}
}

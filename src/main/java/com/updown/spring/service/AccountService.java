package com.updown.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.updown.spring.domain.Account;
import com.updown.spring.mapper.AccountMapper;

@Service
public class AccountService {

	@Autowired
	private AccountMapper accountMapper;
	
	public List<Account> selectAccount() {
		return accountMapper.selectAccount();
	};
}

package com.vti.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.vti.entity.Account;
import com.vti.request.CreateAccountRequest;

public interface IAccountService {

	Page<Account> getAllAccount(Pageable pageable);

	Account getAccountById(int id);

	void createAccount(CreateAccountRequest accountRequest);

}

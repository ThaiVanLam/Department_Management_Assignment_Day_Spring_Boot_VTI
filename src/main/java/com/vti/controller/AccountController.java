package com.vti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vti.entity.Account;
import com.vti.request.CreateAccountRequest;
import com.vti.service.IAccountService;

@RestController
@RequestMapping(value = "api/v1/accounts")
public class AccountController {
	@Autowired
	private IAccountService accountService;

	@GetMapping
	public Page<Account> getAllAccount(Pageable pageable) {
		return accountService.getAllAccount(pageable);
	}

	@GetMapping(value = "/{id}")
	public Account getAccountById(@PathVariable(name = "id") int id) {
		return accountService.getAccountById(id);
	}

	@PostMapping
	public void createAccount(@RequestBody CreateAccountRequest accountRequest) {
		accountService.createAccount(accountRequest);
	}
}

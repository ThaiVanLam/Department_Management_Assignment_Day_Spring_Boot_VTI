package com.vti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Position;
import com.vti.repository.IAccountRepository;
import com.vti.repository.IDepartmentRepository;
import com.vti.repository.IPositionRepository;
import com.vti.request.CreateAccountRequest;

@Service
public class AccountService implements IAccountService {
	@Autowired
	private IAccountRepository accountRepository;

	@Autowired
	private IDepartmentRepository departmentRepository;

	@Autowired
	private IPositionRepository positionRepository;

	@Override
	public Page<Account> getAllAccount(Pageable pageable) {
		return accountRepository.findAll(pageable);
	}

	@Override
	public Account getAccountById(int id) {
		return accountRepository.findById(id);
	}

	@Override
	public void createAccount(CreateAccountRequest accountRequest) {
		Department department = departmentRepository.findById(accountRequest.getDepartmentId());
		Position position = positionRepository.findById(accountRequest.getPositionId());

		Account account = new Account(accountRequest.getEmail(), accountRequest.getUsername(),
				accountRequest.getFullname(), department, position);

		accountRepository.save(account);
	}

}

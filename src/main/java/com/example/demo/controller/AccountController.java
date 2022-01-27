package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Account;
import com.example.demo.service.AccountService;

@RestController
public class AccountController {
	@Autowired
	AccountService accountService;
	@GetMapping("/account")
	Iterable<Account> getAccounts() {
	      return accountService.getAccounts();
	 }
  
	@PostMapping("/account") // create
	void createAccount (@RequestBody @Valid Account account) {
		System.out.println(account.getAccounttype());
		System.out.println(account.getDepositinitial());
	accountService.saveAccount(account);
	}
}
	
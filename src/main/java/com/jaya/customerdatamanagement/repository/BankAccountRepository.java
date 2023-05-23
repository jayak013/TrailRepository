package com.jaya.customerdatamanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jaya.customerdatamanagement.entity.BankAccount;

public interface BankAccountRepository extends JpaRepository<BankAccount, Integer>{

}

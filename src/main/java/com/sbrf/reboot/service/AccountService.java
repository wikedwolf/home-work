package com.sbrf.reboot.service;

import com.sbrf.reboot.repository.AccountRepository;

import java.util.Set;

public class AccountService {
    AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public boolean isClientHasContract(long clientId, long contractNumber) {
        return ((Set<Long>) (accountRepository.getAllAccountsByClientId(clientId))).contains(contractNumber);
    }

    public int getClientsHasContractCount(long contractNumber) {
        return ((Set<Long>) (accountRepository.getAllAccountsByContractNumber(contractNumber))).size();
    }
}
package com.sbrf.reboot.repository;

public interface AccountRepository {
    Object getAllAccountsByClientId(long clientId);
    Object getAllAccountsByContractNumber(long contractNumber);
}
package service;

import java.math.BigDecimal;

import pojo.Credit;
import repository.AccountRepository;

public class CreditService implements AccountService {
    AccountRepository accountRepository;

    public CreditService(AccountRepository accountRepository){
        this.accountRepository=accountRepository;
    }
    public void createAccount(Credit checkingService) {
        accountRepository.createAccount(checkingService);
    }

    public Credit retrieveAccount(String id) {
        return (Credit)accountRepository.retrieveAccount(id).clone();
    }

    public void updateAccount(Credit account) {
        accountRepository.updateAccount(account);

    }

    public void deleteAccount(String id) {
        accountRepository.deleteAccount(id);
    }
    @Override
    public void deposit(String id,BigDecimal amount) {
        Credit account=(Credit)accountRepository.retrieveAccount(id);
        account.setCredit(account.getCredit().subtract(amount));
        accountRepository.updateAccount(account);
    }
    @Override
    public void withdraw(String id, BigDecimal amount) {
        Credit account=(Credit)accountRepository.retrieveAccount(id);
        account.setCredit(account.getCredit().add(amount));
        accountRepository.updateAccount(account);
    }

}

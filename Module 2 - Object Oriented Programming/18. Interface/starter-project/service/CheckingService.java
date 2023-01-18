package service;

import java.math.BigDecimal;

import pojo.Checking;
import repository.AccountRepository;

public class CheckingService implements AccountService {
        
    AccountRepository accountRepository;

    public CheckingService(AccountRepository accountRepository){
        this.accountRepository=accountRepository;
    }
    public void createAccount(Checking checkingService) {
        accountRepository.createAccount(checkingService);
    }

    public Checking retrieveAccount(String id) {
        return (Checking)accountRepository.retrieveAccount(id).clone();
    }

    public void updateAccount(Checking account) {
        accountRepository.updateAccount(account);

    }

    public void deleteAccount(String id) {
        accountRepository.deleteAccount(id);
    }

    @Override
    public void deposit(String id,BigDecimal amount) {
        Checking account=(Checking)accountRepository.retrieveAccount(id);
        account.setBalance(account.getBalance().add(amount));
        accountRepository.updateAccount(account);
    }
    @Override
    public void withdraw(String id, BigDecimal amount) {
        Checking account=(Checking)accountRepository.retrieveAccount(id);
        account.setBalance(account.getBalance().subtract(amount));
        accountRepository.updateAccount(account);
    }

}

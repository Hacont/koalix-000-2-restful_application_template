package ch.koalix.restfulApplicationTemplate.service;

import ch.koalix.restfulApplicationTemplate.model.Account;
import ch.koalix.restfulApplicationTemplate.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

/**
 * Created by Hacont on 04.10.2016.
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Transactional
    public Account save(Account account) {
        return accountRepository.save(account);
    }

    public ArrayList<Account> getAllAccounts() {
        return accountRepository.getAllAccounts();
    }
}

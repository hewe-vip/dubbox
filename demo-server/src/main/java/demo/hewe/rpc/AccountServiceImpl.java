package demo.hewe.rpc;

import demo.hewe.rpc.model.Account;
import demo.hewe.rpc.service.AccountService;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Override
    public Account findByName(String name) {
        System.out.println("get:    " + name);
        Account account = new Account();
        account.setLoginname("hewe");
        account.setPasswd("123456");
        return account;
    }
}

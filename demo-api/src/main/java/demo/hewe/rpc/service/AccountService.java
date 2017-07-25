package demo.hewe.rpc.service;

import demo.hewe.rpc.model.Account;

/**
 *
 */
public interface AccountService {
    Account findByName(String name);
}

package com.usthe.sureness.sample.support;

import com.usthe.sureness.provider.Account;
import com.usthe.sureness.provider.AccountProvider;
import org.springframework.stereotype.Component;

/**
 * @author tomsun28
 * @date 00:08 2019-05-13
 */
@Component
public class FileTextAccountProvider implements AccountProvider {
    @Override
    public Account loadAccount(String appId) {
        return null;
    }
}

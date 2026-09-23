package net.haruyuzuriha.seiroku.core.account;

import net.haruyuzuriha.seiroku.api.account.AccountId;
import net.haruyuzuriha.seiroku.api.account.AccountService;
import net.haruyuzuriha.seiroku.api.account.AccountSnapshot;
import net.haruyuzuriha.seiroku.api.exception.SeirokuException;
import net.haruyuzuriha.seiroku.core.persistence.AccountMapper;

public final class AccountServiceImpl implements AccountService {

    private final AccountMapper accountMapper;

    public AccountServiceImpl() {
        this(new AccountMapper());
    }

    AccountServiceImpl(AccountMapper accountMapper) {
        this.accountMapper = accountMapper;
    }

    @Override
    public AccountId openAccount(String ownerName) throws SeirokuException {
        if (ownerName == null || ownerName.isBlank()) {
            throw new SeirokuException("ownerName must not be blank");
        }
        AccountId id = AccountId.newId();
        accountMapper.insertAccount(id, ownerName);
        return id;
    }

    @Override
    public AccountSnapshot snapshot(AccountId accountId) throws SeirokuException {
        return accountMapper.findById(accountId)
                .orElseThrow(() -> new SeirokuException("no such account: " + accountId));
    }
}

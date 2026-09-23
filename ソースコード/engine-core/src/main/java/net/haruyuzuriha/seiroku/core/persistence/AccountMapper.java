package net.haruyuzuriha.seiroku.core.persistence;

import java.util.Optional;
import net.haruyuzuriha.seiroku.api.account.AccountId;
import net.haruyuzuriha.seiroku.api.account.AccountSnapshot;

/**
 * MyBatis mapper. Public so MyBatis can proxy/reflect into it, but the
 * *package* is unexported at the module level — only opened specifically to
 * org.mybatis in module-info.java, so nothing else can reach this class.
 */
public class AccountMapper {

    public void insertAccount(AccountId id, String ownerName) {
        // TODO: wire to a MyBatis SqlSession once db/ (Liquibase) schema lands.
    }

    public Optional<AccountSnapshot> findById(AccountId id) {
        // TODO: real query.
        return Optional.empty();
    }
}

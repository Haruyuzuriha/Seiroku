package net.haruyuzuriha.seiroku.core;

import net.haruyuzuriha.seiroku.api.account.AccountService;
import net.haruyuzuriha.seiroku.api.ledger.LedgerService;
import net.haruyuzuriha.seiroku.api.transaction.TransactionService;
import net.haruyuzuriha.seiroku.core.account.AccountServiceImpl;
import net.haruyuzuriha.seiroku.core.ledger.LedgerServiceImpl;
import net.haruyuzuriha.seiroku.core.transaction.TransactionServiceImpl;

/**
 * The single exported seam. This is the only class in engine-core that
 * engine-web is able to name via reflection/DI wiring; everything it returns
 * is typed as an engine-api interface, so callers never see a core class.
 */
public final class SeirokuCoreConfiguration {

    public AccountService accountService() {
        return new AccountServiceImpl();
    }

    public TransactionService transactionService() {
        return new TransactionServiceImpl();
    }

    public LedgerService ledgerService() {
        return new LedgerServiceImpl();
    }
}

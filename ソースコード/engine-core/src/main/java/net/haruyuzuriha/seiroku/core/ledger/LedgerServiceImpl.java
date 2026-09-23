package net.haruyuzuriha.seiroku.core.ledger;

import java.util.List;
import net.haruyuzuriha.seiroku.api.account.AccountId;
import net.haruyuzuriha.seiroku.api.exception.SeirokuException;
import net.haruyuzuriha.seiroku.api.ledger.LedgerService;
import net.haruyuzuriha.seiroku.api.transaction.TransactionReceipt;

public final class LedgerServiceImpl implements LedgerService {

    @Override
    public List<TransactionReceipt> history(AccountId accountId) throws SeirokuException {
        return List.of();
    }
}

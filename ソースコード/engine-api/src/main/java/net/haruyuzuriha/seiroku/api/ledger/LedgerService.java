package net.haruyuzuriha.seiroku.api.ledger;

import java.util.List;
import net.haruyuzuriha.seiroku.api.account.AccountId;
import net.haruyuzuriha.seiroku.api.exception.SeirokuException;
import net.haruyuzuriha.seiroku.api.transaction.TransactionReceipt;

public interface LedgerService {

    List<TransactionReceipt> history(AccountId accountId) throws SeirokuException;
}

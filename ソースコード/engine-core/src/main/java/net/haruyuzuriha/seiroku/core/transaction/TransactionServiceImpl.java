package net.haruyuzuriha.seiroku.core.transaction;

import net.haruyuzuriha.seiroku.api.exception.SeirokuException;
import net.haruyuzuriha.seiroku.api.transaction.TransactionReceipt;
import net.haruyuzuriha.seiroku.api.transaction.TransactionRequest;
import net.haruyuzuriha.seiroku.api.transaction.TransactionService;

public final class TransactionServiceImpl implements TransactionService {

    @Override
    public TransactionReceipt apply(TransactionRequest request) throws SeirokuException {
        // TODO: ledger update + audit aspect hook.
        throw new SeirokuException("not yet implemented");
    }
}

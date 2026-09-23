package net.haruyuzuriha.seiroku.api.transaction;

import net.haruyuzuriha.seiroku.api.exception.SeirokuException;

/**
 * The other primary entry point. Deposits, withdrawals, and transfers all
 * flow through here so that auditing/access-control aspects in engine-core
 * have a single seam to wrap.
 */
public interface TransactionService {

    TransactionReceipt apply(TransactionRequest request) throws SeirokuException;
}

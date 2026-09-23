package net.haruyuzuriha.seiroku.api.account;

import net.haruyuzuriha.seiroku.api.exception.SeirokuException;

/**
 * One of the engine's few entry points. Everything an account holder can do
 * is expressed here; nothing about how it's persisted or enforced leaks
 * through this interface.
 */
public interface AccountService {

    AccountId openAccount(String ownerName) throws SeirokuException;

    AccountSnapshot snapshot(AccountId accountId) throws SeirokuException;
}

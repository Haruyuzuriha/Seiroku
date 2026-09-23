package net.haruyuzuriha.seiroku.api.transaction;

import java.math.BigDecimal;
import net.haruyuzuriha.seiroku.api.account.AccountId;

public record TransactionRequest(AccountId accountId, BigDecimal amount, String memo) {
}

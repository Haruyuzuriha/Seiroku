package net.haruyuzuriha.seiroku.api.account;

import java.math.BigDecimal;

/**
 * Read-only view of an account at a point in time. Not the live entity —
 * engine-core never hands out anything mutable.
 */
public record AccountSnapshot(AccountId accountId, String ownerName, BigDecimal balance) {
}

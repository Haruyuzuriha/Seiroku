package net.haruyuzuriha.seiroku.api.account;

import java.util.UUID;

/**
 * Opaque, immutable handle to an account. Consumers pass this around; only
 * engine-core knows how to resolve it to actual account state.
 */
public record AccountId(UUID value) {

    public static AccountId newId() {
        return new AccountId(UUID.randomUUID());
    }
}

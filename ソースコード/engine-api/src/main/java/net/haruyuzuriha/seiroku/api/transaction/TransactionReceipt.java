package net.haruyuzuriha.seiroku.api.transaction;

import java.time.Instant;
import java.util.UUID;

public record TransactionReceipt(UUID transactionId, Instant recordedAt) {
}

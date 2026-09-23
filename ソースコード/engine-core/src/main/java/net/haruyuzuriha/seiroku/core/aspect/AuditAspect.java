package net.haruyuzuriha.seiroku.core.aspect;

/**
 * AOP hook for audit logging and access checks applied around core
 * operations, per the project's AOP design goal. Stays fully internal:
 * no engine-api type ever exposes this.
 */
public class AuditAspect {
    // TODO: pointcuts around AccountService/TransactionService methods.
}

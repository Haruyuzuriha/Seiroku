package net.haruyuzuriha.seiroku.api.exception;

/**
 * Base type for every checked failure the engine surfaces across its public
 * boundary. Consumers (engine-web, engine-cli) catch this, not the engine's
 * internal exception hierarchy, which lives in engine-core and is never exported.
 */
public class SeirokuException extends Exception {

    public SeirokuException(String message) {
        super(message);
    }

    public SeirokuException(String message, Throwable cause) {
        super(message, cause);
    }
}

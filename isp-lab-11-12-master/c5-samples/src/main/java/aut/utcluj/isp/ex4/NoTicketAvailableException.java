package aut.utcluj.isp.ex4;

/**
 * @author stefan
 */
public class NoTicketAvailableException extends RuntimeException {
    // Default constructor
    public NoTicketAvailableException() {
        super();
    }

    // Constructor that accepts a custom error message
    public NoTicketAvailableException(String message) {
        super(message);
    }

    // Constructor that accepts a custom error message and a cause
    public NoTicketAvailableException(String message, Throwable cause) {
        super(message, cause);
    }

    // Constructor that accepts a cause
    public NoTicketAvailableException(Throwable cause) {
        super(cause);
    }

    // Constructor that accepts a custom error message, a cause,
    // and allows enabling suppression and writable stack trace
    protected NoTicketAvailableException(String message, Throwable cause,
                                         boolean enableSuppression,
                                         boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

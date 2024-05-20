package aut.utcluj.isp.ex4;

/**
 * @author stefan
 */
public class TicketNotAssignedException extends RuntimeException {
    // Default constructor
    public TicketNotAssignedException() {
        super();
    }

    // Constructor that accepts a custom error message
    public TicketNotAssignedException(String message) {
        super(message);
    }

    // Constructor that accepts a custom error message and a cause
    public TicketNotAssignedException(String message, Throwable cause) {
        super(message, cause);
    }

    // Constructor that accepts a cause
    public TicketNotAssignedException(Throwable cause) {
        super(cause);
    }

    // Constructor that accepts a custom error message, a cause,
    // and allows enabling suppression and writable stack trace
    protected TicketNotAssignedException(String message, Throwable cause,
                                         boolean enableSuppression,
                                         boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

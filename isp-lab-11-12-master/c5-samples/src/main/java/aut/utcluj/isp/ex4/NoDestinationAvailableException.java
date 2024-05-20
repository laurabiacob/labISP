package aut.utcluj.isp.ex4;

/**
 * @author stefan
 */
public class NoDestinationAvailableException extends RuntimeException {
    // Default constructor
    public NoDestinationAvailableException() {
        super();
    }

    // Constructor that accepts a custom error message
    public NoDestinationAvailableException(String message) {
        super(message);
    }

    // Constructor that accepts a custom error message and a cause
    public NoDestinationAvailableException(String message, Throwable cause) {
        super(message, cause);
    }

    // Constructor that accepts a cause
    public NoDestinationAvailableException(Throwable cause) {
        super(cause);
    }

    // Constructor that accepts a custom error message, a cause,
    // and allows enabling suppression and writable stack trace
    protected NoDestinationAvailableException(String message, Throwable cause,
                                              boolean enableSuppression,
                                              boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

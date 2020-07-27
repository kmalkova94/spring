package org.example.bookshop.exceptions;

public class AddressException extends Exception {
    public AddressException() {
        super();
    }

    public AddressException(String message) {
        super(message);
    }

    public AddressException(String message, Throwable cause) {
        super(message, cause);
    }

    public AddressException(Throwable cause) {
        super(cause);
    }
}

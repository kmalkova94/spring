package org.example.bookshop.exceptions;

public class BookOrderException extends Exception{
    public BookOrderException() {
    }

    public BookOrderException(String message) {
        super(message);
    }

    public BookOrderException(String message, Throwable cause) {
        super(message, cause);
    }

    public BookOrderException(Throwable cause) {
        super(cause);
    }
}

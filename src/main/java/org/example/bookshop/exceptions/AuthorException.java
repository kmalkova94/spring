package org.example.bookshop.exceptions;

public class AuthorException extends Exception{

    public AuthorException() {
    }

    public AuthorException(String message) {
        super(message);
    }

    public AuthorException(String message, Throwable cause) {
        super(message, cause);
    }

    public AuthorException(Throwable cause) {
        super(cause);
    }
}

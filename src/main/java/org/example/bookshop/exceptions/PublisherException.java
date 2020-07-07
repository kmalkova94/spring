package org.example.bookshop.exceptions;

public class PublisherException extends Exception{
    public PublisherException() {
    }

    public PublisherException(String message) {
        super(message);
    }

    public PublisherException(String message, Throwable cause) {
        super(message, cause);
    }

    public PublisherException(Throwable cause) {
        super(cause);
    }
}

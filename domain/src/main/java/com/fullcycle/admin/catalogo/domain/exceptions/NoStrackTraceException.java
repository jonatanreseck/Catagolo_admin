package com.fullcycle.admin.catalogo.domain.exceptions;

public class NoStrackTraceException extends RuntimeException {

    public NoStrackTraceException(final String message) {
        super(message, null);
    }

    public NoStrackTraceException(final String message, final Throwable cause) {
        super(message, cause, true, false);
    }
}

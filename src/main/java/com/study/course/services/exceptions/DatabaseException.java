package com.study.course.services.exceptions;

public class DatabaseException extends RuntimeException {

    public static final long serialVersionUID = 1L;

    public DatabaseException (String errorMessage) {
        super(errorMessage);
    }

}

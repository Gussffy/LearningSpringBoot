package com.codefylab.learningspringboot.services.exceptions;

public class DatabaseException extends RuntimeException {
     private static final long serialVersionUID = 1L;

     public DatabaseException(String message) {
         super(message);
     }
}

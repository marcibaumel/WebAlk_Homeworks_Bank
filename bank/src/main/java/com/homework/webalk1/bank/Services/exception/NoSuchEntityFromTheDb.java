package com.homework.webalk1.bank.Services.exception;

import java.util.UUID;

public class NoSuchEntityFromTheDb extends RuntimeException {

    private UUID id;

    public NoSuchEntityFromTheDb(UUID id) {
        super("No such entity "+id);
        this.id = id;
    }
}

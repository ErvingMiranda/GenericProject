package org.Ezone.POO.model;

import java.util.UUID;

public class Identity {
    protected String id;
    public Identity() {
        id = UUID.randomUUID().toString();
    }

    public Identity(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}

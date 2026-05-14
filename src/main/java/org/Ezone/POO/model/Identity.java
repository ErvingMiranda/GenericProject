package org.Ezone.POO.model;

import java.util.UUID;

public class Identity {
    protected String id;
    public Identity() {
        id = UUID.randomUUID().toString();
    }
    
    public String getId() {
        return id;
    }
}

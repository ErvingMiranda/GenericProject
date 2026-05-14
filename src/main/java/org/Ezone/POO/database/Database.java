package org.Ezone.POO.database;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private static Database instance = new Database();

    public List<Object> registro = new ArrayList<>();

    public static Database getInstance() {
        return instance;
    }

    private void agregarDatabase(Object entidad) {
        registro.add(entidad);
    }
}

package org.Ezone.POO.database;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Database {
    private static Database instance = new Database();

   private final Map<String, List<?>> tables = new HashMap<>();

   private Database() {}

    public static Database getInstance() {
        return instance;
    }

    public<T> List<T> getTable(String tableName) {
        return (List<T>) tables.computeIfAbsent(
                tableName,
                k -> new ArrayList<>());
    }
}

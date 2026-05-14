package org.Ezone.POO.service;

import java.util.List;

public interface Repository<T> {
    void guardar(T entidad);
    T buscarPorId(String id);
    List<T> buscarTodos();
}

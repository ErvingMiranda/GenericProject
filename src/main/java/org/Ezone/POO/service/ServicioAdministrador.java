package org.Ezone.POO.service;

import org.Ezone.POO.database.Database;
import org.Ezone.POO.model.Administrador;

import java.util.List;

public class ServicioAdministrador implements Repository<Administrador>{

    private final List<Administrador> administradores;

    public ServicioAdministrador() {
        this.administradores = Database
                .getInstance()
                .getTable("Administrador");
    }

    @Override
    public void guardar(Administrador entidad) {
        administradores.add(entidad);
    }

    @Override
    public Administrador buscarPorId(String id) {
        return administradores.stream()
                .filter(admin -> admin.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Administrador> buscarTodos() {
            return administradores;
    }
}

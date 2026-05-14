package org.Ezone.POO.service;
import org.Ezone.POO.database.Database;
import org.Ezone.POO.model.Usuario;

import java.util.List;

public class ServicioUsuario implements Repository<Usuario> {

    private final List<Usuario>  usuarios;

    public ServicioUsuario() {
        this.usuarios = Database
                .getInstance()
                .getTable("usuarios");
    }

    @Override
    public void guardar(Usuario entidad) {
        usuarios.add(entidad);
    }

    @Override
    public Usuario buscarPorId(String id) {
        return usuarios.stream()
                .filter(s -> s.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Usuario> buscarTodos() {
        return usuarios;
    }
}

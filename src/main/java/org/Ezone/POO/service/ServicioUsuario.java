package org.Ezone.POO.service;
import org.Ezone.POO.database.Database;
import org.Ezone.POO.model.Usuario;

import java.util.List;

public class ServicioUsuario implements Repository<Usuario> {

    @Override
    public void guardar(Usuario entidad) {
        Database.getInstance().registro.add(entidad);
    }

    @Override
    public Usuario buscarPorId(String id) {
        return Database.getInstance()
                .registro.stream()
                .filter(s -> ((Usuario) s).getId().equals(id))
                .map(s -> (Usuario)s)
                .findFirst().orElse(null);
    }

    @Override
    public List<Usuario> buscarTodos() {
        return List.of();
    }
}

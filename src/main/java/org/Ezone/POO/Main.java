package org.Ezone.POO;

import org.Ezone.POO.model.Administrador;
import org.Ezone.POO.model.Usuario;
import org.Ezone.POO.service.ServicioAdministrador;
import org.Ezone.POO.service.ServicioUsuario;

public class Main {
    public static void main(String[] args) {
        ServicioUsuario servicioUsuario = new ServicioUsuario();
        ServicioAdministrador servicioAdministrador = new ServicioAdministrador();

        servicioUsuario.guardar(
                new Usuario("Norman", "Cash")
        );

        servicioAdministrador.guardar(
                new Administrador("Erving", "Miranda", "ervingmr@uamv.edu.ni")
        );

        servicioUsuario.buscarTodos().forEach(System.out::println);
        servicioAdministrador.buscarTodos().forEach(System.out::println);
    }
}
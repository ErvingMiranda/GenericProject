package org.Ezone.POO;

import org.Ezone.POO.model.Caja;

public class Main {
    public static void main(String[] args) {
        Caja<String> caja = new Caja<String>();
        caja.guardar("Hola mundo");
        System.out.println(caja.getContenido());

        Caja<Integer> caja1 = new Caja<>();
        caja1.guardar(100);
        System.out.println(caja1.getContenido());
    }
}
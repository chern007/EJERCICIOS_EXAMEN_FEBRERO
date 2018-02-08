/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DI03_clase_listener;

import java.util.EventObject;

/**
 *
 * @author chern007
 */
public class main {

    public static void main(String[] args) {

        Escuchador customListener = new Escuchador() {
            @Override
            public void cambioDNI(EventObject ev) {
                System.out.println("Se ha cambiado el DNI de la persona.");
            }

            @Override
            public void cambioNombre(EventObject ev) {
                System.out.println("Se ha cambiado el Nombre de la persona.");
            }

            @Override
            public void cambioEdad(EventObject ev) {
                System.out.println("Se ha cambiado la Edad de la persona.");
            }

            @Override
            public void cambioAltura(EventObject ev) {
                System.out.println("Se ha cambiado la Altura de la persona.");
            }
        };

        persona_listener nuevaPersona = new persona_listener(customListener);
        nuevaPersona.setDNI("50230617C");
        nuevaPersona.setNombre("Carlos");
        nuevaPersona.setAltura(180);
        nuevaPersona.setEdad(30);

    }

}

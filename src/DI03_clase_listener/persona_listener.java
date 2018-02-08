/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DI03_clase_listener;

import java.util.EventListener;
import java.util.EventObject;

/**
 *
 * @author chern007
 */
public class persona_listener {
   
    String DNI;
    String nombre;
    int edad;
    int altura;
    Escuchador oyente;

    public persona_listener(Escuchador oyente) {
        this.oyente = oyente;
    }

    public String getDNI() {
        return DNI;        
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;        
        
        oyente.cambioDNI(new objetoEvento(this));
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        
        oyente.cambioNombre(new objetoEvento(this));
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
        
        oyente.cambioEdad(new objetoEvento(this));
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
        
        oyente.cambioAltura(new objetoEvento(this));
    }
}


interface Escuchador extends EventListener{

public void cambioDNI(EventObject ev);

public void cambioNombre(EventObject ev);

public void cambioEdad(EventObject ev);

public void cambioAltura(EventObject ev);


}

class objetoEvento extends EventObject{
    
    public objetoEvento(Object source) {
        super(source);
    }
}
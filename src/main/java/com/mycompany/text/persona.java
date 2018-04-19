/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.text;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author villa
 */

@Path("wr")
public class persona {
    public String nombre,apellido;
    public int edad;

    public persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @GET
    public String saludo(){
        return "Chinchilla se la come doblada";
    }
     
    
}

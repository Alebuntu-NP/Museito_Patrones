/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package museito;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author empic
 */
public class Persona {
    private String nombre;
    private String apellido;
    private String dni;
    private String direccion;
    private int telefono;
    
    public Persona(String nombre, String apellido, String dni, String direccion, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    //GETTERS
    public String getNombre() {
        return nombre;
    }
        
    public String getApellido() {
        return apellido;
    }
            
    public String getDni() {
        return dni;
    }
                
    public String getDireccion() {
        return direccion;
    }
                    
    public int getTelefono() {
        return telefono;
    }
    
    
    //SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
     public void setApellido(String apellido) {
        this.apellido = apellido;
    }
     
      public void setDni(String dni) {
        this.dni = dni;
    }
      
       public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
       
        public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }

    

}

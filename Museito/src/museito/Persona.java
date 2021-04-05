/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package museito;

/**
 *
 * @author Autores
 */
public class Persona implements Comparable {

    private String nombre;
    private String apellido;
    private String dni;
    private String direccion;
    private int telefono;

    /**
     * Constructor con parametros de persona
     *
     * @param nombre Nombre de la persona
     * @param apellido Apellido de la persona
     * @param dni Dni de la persona
     * @param direccion Direccion de la persona
     * @param telefono Telefono de la persona
     */
    public Persona(String nombre, String apellido, String dni, String direccion, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    /**
     * Metodo que nos devuelve el nombre de una persona
     *
     * @return Nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que nos modifica el nombre de una persona
     *
     * @param nombre Nombre que queremos ponerle ha esa persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que nos devuelve el apellido de una persona
     *
     * @return Apellido de la persona
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Metodo que nos modifica el apellido de una persona
     *
     * @param apellido Apellido que queremos que tenga esa persona
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Metodo que nos devuelve el dni de una persona
     *
     * @return Dni de la persona
     */
    public String getDni() {
        return dni;
    }

    /**
     * Metodo que nos modifica el dni de una persona
     *
     * @param dni Dni que queremos ponerle a esa persona
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Metodo que nos devuelve la direccion de una persona
     *
     * @return Direccion de una persona
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Metodo que nos modifica la direccion de una persona
     *
     * @param direccion Direccion que queremos que tenga una persona
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Metodo que nos devuelve el telefono de una persona
     *
     * @return Telefono de una persona
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * Metodo que nos modifica el telefono de una persona
     *
     * @param telefono Telefono que queramos colocarle a esa persona
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    @Override
   public int compareTo(Object o) {
        Persona p = (Persona) o;
        return this.nombre.compareTo(p.getNombre());
    }


}

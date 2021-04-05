package museito;

import java.util.Calendar;

/**
 *
 * @author aleja
 */
public class Obra {

    private String id;
    private String nombre;
    private String tipo;
    private String estilo;
    private int anyo;
    private String origen;
    private Calendar fecha_reparacion;
    private String autor;
    private String estado;
    private boolean reparado;
    private String descripcion;

    /**
     * Constructor de obra que se utiliza en las clases donde se extiende obra con un super
     *
     * @param id Identificador de la obra(Cuadro,Escultura,Libro)
     * @param nombre Nombre de la obra(Cuadro,Escultura,Libro)
     * @param tipo Tipo de la obra que puede ser: Cuadro, Escultura o Libro
     * @param estilo Estilo de la obra(Cuadro,Escultura,Libro)
     * @param anyo Año de la obra(Cuadro,Escultura,Libro)
     * @param origen Lugar de origen de la obra(Cuadro,Escultura,Libro)
     * @param fecha_reparacion Fecha de la ultima reparación de la obra(Cuadro,Escultura,Libro)
     * @param autor Autor de la obra(Cuadro,Escultura,Libro)
     * @param estado Ultima accion relacionada con la obra(Cuadro,Escultura,Libro)
     * @param reparado Estado en el que se encuentra la obra(Cuadro,Escultura,Libro)
     * @param descripcion Descripción detallada de la obra(Cuadro,Escultura,Libro)
     */
    public Obra(String id, String nombre, String tipo, String estilo, int anyo, String origen, Calendar fecha_reparacion, String autor, String estado, boolean reparado, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.estilo = estilo;
        this.anyo = anyo;
        this.origen = origen;
        this.fecha_reparacion = fecha_reparacion;
        this.autor = autor;
        this.estado = estado;
        this.reparado = reparado;
        this.descripcion = descripcion;
    }

    /**
     * Metodo que nos devuelve el id de una obra
     *
     * @return Id de la obra
     */
    public String getId() {
        return id;
    }

    /**
     * Metodo que nos modifica el id de una obra
     *
     * @param id Id de la obra que queremos modificar
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Metodo que nos devuelve el nombre de la obra
     *
     * @return Nombre de la obra
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que nos modifica el nombre de una obra
     *
     * @param nombre Nombre que queramos ponerle a la obra
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que nos devuelve el tipo de la obra
     *
     * @return Tipo al que pertenece la obra
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Metodo que nos modifica el tipo que tendra la obra Posdata esto no se podra hacer debido a que por defecto si es un libro no puede transformarse una escultura por ejemplo
     *
     * @param tipo Tipo de obra que queramos modificar
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Metodo que nos devuelve el estilo de una obra
     *
     * @return Estilo de la obra
     */
    public String getEstilo() {
        return estilo;
    }

    /**
     * Metodo que nos modifica el estilo de una obra
     *
     * @param estilo Estilo que queramos que tenga la obra
     */
    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    /**
     * Metodo que nos devuelve el año que se creo la obra
     *
     * @return Año de creacion de la obra
     */
    public int getAnyo() {
        return anyo;
    }

    /**
     * Metodo que nos modifica el año que se creo la obra
     *
     * @param anyo Año de creacion de la obra
     */
    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    /**
     * Metodo que nos devuelve el lugar donde se creo la obra
     *
     * @return Lugar de creacion de la obra
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * Metodo que nos modificar el lugar donde se creo la obra
     *
     * @param origen Lugar donde se creo la obra
     */
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    /**
     * Metodo que nos devuelve la fecha de la ultima reparacion realizada a una obra
     *
     * @return Fecha de la ultima reparacion a una obra en concreto
     */
    public Calendar getFecha_reparacion() {
        return fecha_reparacion;
    }

    /**
     * Metodo que nos modifica la fecha de la ultima reparacion de una obra
     *
     * @param fecha_reparacion Fecha de la ultima reparación realizada
     */
    public void setFecha_reparacion(Calendar fecha_reparacion) {
        this.fecha_reparacion = fecha_reparacion;
    }

    /**
     * Metodo que nos devuelve el autor de una obra
     *
     * @return Autor de la obra
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Metodo que nos modificar el autor de una obra
     *
     * @param autor Autor al que pertenece la obra
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Metodo que nos devuelve la ultima accion realizada con esa obra
     *
     * @return Ultima accion realizada con una obra en concreto
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Metodo que nos modifica la ultima accion realizada a una obra
     *
     * @param estado Ultima accion realizada a una obra
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Metodo que nos indica esta reparada o estropeada una obra
     *
     * @return True si esta reparada y false si esta estropeada
     */
    public boolean isReparado() {
        return reparado;
    }

    /**
     * Metodo que nos modifica el estado en el que se encuentra la obra
     *
     * @param reparado Estado en el que se encuentra la obra
     */
    public void setReparado(boolean reparado) {
        this.reparado = reparado;
    }

    /**
     * Metodo que nos devuelve los datos detallado de una obra es decir su descripcion
     *
     * @return Descripcion de la obra
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Metodo que nos modifica la descripcion de una obra
     *
     * @param descripcion Descripcion que le queramos poner a una obra
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}

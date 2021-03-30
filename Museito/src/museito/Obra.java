package museito;

import java.util.Calendar;

public class Obra {

    private String id;
    private String nombre;
    private String tipo;
    private String estilo;
    private int anyo;
    private String origen;
    private Calendar fecha_reparacion;
    private String autor;
    private boolean estado;
    private String descripcion;

    public Obra(String id, String nombre, String tipo, String estilo, int anyo, String origen, Calendar fecha_reparacion, String autor, boolean estado, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.estilo = estilo;
        this.anyo = anyo;
        this.origen = origen;
        this.fecha_reparacion = fecha_reparacion;
        this.autor = autor;
        this.estado = estado;
        this.descripcion = descripcion;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getEstilo() {
        return estilo;
    }

    public int getAnyo() {
        return anyo;
    }

    public String getOrigen() {
        return origen;
    }

    public Calendar getFecha_reparacion() {
        return fecha_reparacion;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isEstado() {
        return estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setFecha_reparacion(Calendar fecha_reparacion) {
        this.fecha_reparacion = fecha_reparacion;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}

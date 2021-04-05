
package museito;

import java.util.Calendar;

/**
 *
 * @author Autores
 */
public class Cuadro extends Obra {

    private static String tipo = "Cuadro";
    private String marco;

    /**
     * Constructor con parametros de cuadro
     * @param id Identificador del cuadro
     * @param nombre Nombre del cuadro
     * @param estilo Estilo del cuadro
     * @param anyo Año del cuadro
     * @param origen Lugar de origen del cuadro
     * @param fecha_reparacion Fecha de la ultima reparación del cuadro
     * @param autor Autor del cuadro
     * @param estado Ultima accion relacionada con el cuadro
     * @param reparado Estado en el que se encuentra el cuadro
     * @param descripcion Descripción detallada del cuadro
     * @param marco Tipo de marco que tiene el cuadro
     */
    public Cuadro(String id, String nombre, String estilo, int anyo, String origen, Calendar fecha_reparacion, String autor, String estado, boolean reparado, String descripcion, String marco) {
        super(id, nombre, tipo, estilo, anyo, origen, fecha_reparacion, autor, estado, reparado, descripcion);
        this.marco = marco;

    }

    /**
     * Este metodo sirve para devolvernos el tipo de marco del cuadro
     * @return Devuelve el tipo de cuadro
     */
    public String getMarco() {
        return marco;
    }

    /**
     * Nos modifica el marco del cuadro
     * @param marco Marco que queramos que tenga el cuadro
     */
    public void setMarco(String marco) {
        this.marco = marco;
    }

}

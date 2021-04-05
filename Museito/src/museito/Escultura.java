package museito;

import java.util.Calendar;

/**
 *
 * @author aleja
 */
public class Escultura extends Obra {

    private static String tipo = "Escultura";
    private String material;

    /**
     * Constructor con parametros de escultura
     * @param id Identificador de la escultura
     * @param nombre Nombre de la escultura
     * @param estilo Estilo de la escultura
     * @param anyo Año de la escultura
     * @param origen Lugar de origen de la escultura
     * @param fecha_reparacion Fecha de la ultima reparación de la escultura
     * @param autor Autor de la escultura
     * @param estado Ultima accion relacionada con la escultura
     * @param reparado Estado en el que se encuentra la escultura
     * @param descripcion Descripción detallada de la escultura
     * @param material Material con el que esta hecha la escultura
     */
    public Escultura(String id, String nombre, String estilo, int anyo, String origen, Calendar fecha_reparacion, String autor, String estado, boolean reparado, String descripcion, String material) {
        super(id, nombre, tipo, estilo, anyo, origen, fecha_reparacion, autor, estado, reparado, descripcion);
        this.material = material;
    }

    /**
     * Este metodo sirve para devolvernos el tipo de material de la escultura
     * @return Devuelve el material con el que esta hecha la escultura
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Nos modifica el material de la escultura
     * @param material Material del que esta hecha la escultura
     */
    public void setMaterial(String material) {
        this.material = material;
    }

}

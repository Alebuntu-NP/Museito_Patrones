
package museito;

import java.util.Calendar;

/**
 *
 * @author Autores
 */
public class Libro extends Obra {

    private static String tipo = "Libro";
    private int num_paginas;

    /**
     * Constructor con parametros de libro
     * @param id Identificador del libro
     * @param nombre Nombre del libro
     * @param estilo Estilo del libro
     * @param anyo Año del libro
     * @param origen Lugar de origen del libro
     * @param fecha_reparacion Fecha de la ultima reparación del libro
     * @param autor Autor del libro
     * @param estado Ultima accion relacionada con el libro
     * @param reparado Estado en el que se encuentra el libro
     * @param descripcion Descripción detallada del libro
     * @param num_paginas Numero de paginas que tiene el libro
     */
    public Libro(String id, String nombre, String estilo, int anyo, String origen, Calendar fecha_reparacion, String autor, String estado, boolean reparado, String descripcion, int num_paginas) {

        super(id, nombre, tipo, estilo, anyo, origen, fecha_reparacion, autor, estado, reparado, descripcion);
        this.num_paginas = num_paginas;

    }

    /**
     * Metodo que nos devuelve el numero de paginas que tiene un libro
     * @return Paginas que tiene el libro
     */
    public int getNum_paginas() {
        return num_paginas;
    }

    /**
     * Metodo que nos modifica el numero de paginas que tiene un libro
     * @param num_paginas Numero de paginas del libro
     */
    public void setNum_paginas(int num_paginas) {
        this.num_paginas = num_paginas;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nNumero de paginas: " + num_paginas;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package museito;

import java.util.Calendar;

/**
 *
 * @author aleja
 */
public class Libro extends Obra {

    private int num_paginas;

    public Libro(String id, String nombre, String tipo, String estilo, int anyo, String origen, Calendar fecha_reparacion, String autor, String estado, boolean reparado, String descripcion, int num_paginas) {

        super(id, nombre, tipo, estilo, anyo, origen, fecha_reparacion, autor, estado, reparado, descripcion);
        this.num_paginas = num_paginas;
    }

    public int getNum_paginas() {
        return num_paginas;
    }

    public void setNum_paginas(int num_paginas) {
        this.num_paginas = num_paginas;
    }
    
    
}

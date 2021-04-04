
package museito;

import java.util.Calendar;

public class Escultura extends Obra{
    
    private String material;

    public Escultura(String id, String nombre, String tipo, String estilo, int anyo, String origen, Calendar fecha_reparacion, String autor, String estado, boolean reparado, String descripcion, String materials) {
        super(id, nombre, tipo, estilo, anyo, origen, fecha_reparacion, autor, estado, reparado, descripcion);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    
    
}

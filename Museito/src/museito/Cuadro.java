/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package museito;

import java.util.Calendar;

/**
 *
 * @author empic
 */
public class Cuadro extends Obra{
       private static String tipo = "Cuadro";
    private String marco;
    
     public Cuadro(String id, String nombre,String estilo, int anyo, String origen, Calendar fecha_reparacion, String autor, String estado, boolean reparado, String descripcion, String marco){
        super(id, nombre, tipo, estilo, anyo, origen, fecha_reparacion, autor, estado, reparado, descripcion);
        this.marco = marco;
        
    }

    public String getMarco() {
        return marco;
    }

    public void setMarco(String marco) {
        this.marco = marco;
    }
     
}

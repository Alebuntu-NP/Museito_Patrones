/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package museito;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aleja
 */
public class LibroStrategy implements Estrategia {

    public LibroStrategy() {
    }

    public void reparar(Obra obra, Museo museo) {


        obra.setEstado("enviado a reparar.");
        Museo.getInstance().notifyObservers(obra);
        obra.setEstado("se esta reparando");
        Museo.getInstance().notifyObservers(obra);
        try {
            Thread.sleep(5 * 1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(LibroStrategy.class.getName()).log(Level.SEVERE, null, ex);
        }
        obra.setEstado("ha sido reparado.");
        Museo.getInstance().notifyObservers(obra);

    }

    public String getTipoStrategy() {
        return "LIBRO";
    }

}

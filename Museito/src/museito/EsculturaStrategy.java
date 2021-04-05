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
 * @author Autores
 */
public class EsculturaStrategy implements Estrategia {

    /**
     * Construtor vacio de la estrategia de la reparacion de una escultura
     */
    public EsculturaStrategy() {
    }

    /**
     * Metodo que nos reparar una escultura
     *
     * @param obra Escultura que vamos a reparar
     * @param museo Museo donde se encuentra la escultura
     */
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

    @Override
    public String getTipoStrategy() {
        return "ESCULTURA";
    }
}

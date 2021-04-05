package museito;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Autores
 */
public class CuadroStrategy implements Estrategia {

    /**
     * Constructor vacio de la estrategia de la reparación de un cuadro.
     */
    public CuadroStrategy() {
    }

    /**
     * Metodo que nos repara un cuadro
     *
     * @param obra Cuadro que vamos a reparar
     * @param museo Museo donde se encuentra dicha obra
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
        return "CUADRO";
    }
}

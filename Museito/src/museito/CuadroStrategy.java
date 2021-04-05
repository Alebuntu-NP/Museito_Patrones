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
        try {
            obra.setEstado("se lleva a una sala con buena iluminación");
            Museo.getInstance().notifyObservers(obra);
            Thread.sleep(5 * 1000);
            obra.setEstado("se esta buscando la copia original para ver como era");
            Museo.getInstance().notifyObservers(obra);
            Thread.sleep(5 * 1000);
            obra.setEstado("se esta captando las diferencias respecto a la obra original");
            Museo.getInstance().notifyObservers(obra);
            Thread.sleep(5 * 1000);
            obra.setEstado("se le estan arreglando las diferencias respecto la copia original ");
            Museo.getInstance().notifyObservers(obra);
            Thread.sleep(5 * 1000);
            obra.setEstado("ha terminado de repararse");
            Museo.getInstance().notifyObservers(obra);
            Thread.sleep(5 * 1000);
            obra.setEstado("esta siendo llevada a la exposición del museo.");
            Museo.getInstance().notifyObservers(obra);
            Thread.sleep(5 * 1000);
            obra.setEstado("esta en la exposición del museo.");
            Museo.getInstance().notifyObservers(obra);

        } catch (InterruptedException ex) {
            Logger.getLogger(CuadroStrategy.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getTipoStrategy() {
        return "CUADRO";
    }
}

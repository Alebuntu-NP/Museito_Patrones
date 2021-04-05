
package museito;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alberto García,Maria Pérula y Alejandro Román
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
        try {
            obra.setEstado("se ha enviado al almacen para reparar");
            Museo.getInstance().notifyObservers(obra);
            Thread.sleep(5 * 1000);
            obra.setEstado("lo esta mirando un restaurador para ver los defectos que hay que arreglar");
            Museo.getInstance().notifyObservers(obra);
            Thread.sleep(5 * 1000);
            obra.setEstado("se encarga arcilla especial para la restauracion");
            Museo.getInstance().notifyObservers(obra);
            Thread.sleep(5 * 1000);
            obra.setEstado("la esta arreglando el trabajador que es restaurador");
            Museo.getInstance().notifyObservers(obra);
            Thread.sleep(5 * 1000);
            obra.setEstado("ha terminado de repararse");
            obra.setReparado(true);
            Museo.getInstance().notifyObservers(obra);
            Thread.sleep(5 * 1000);
            obra.setEstado("esta siendo llevada a la exposición del museo.");
            Museo.getInstance().notifyObservers(obra);
            Thread.sleep(5 * 1000);
            obra.setEstado("esta en la exposición del museo.");
            Museo.getInstance().notifyObservers(obra);
        } catch (InterruptedException ex) {
            Logger.getLogger(EsculturaStrategy.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getTipoStrategy() {
        return "ESCULTURA";
    }
}

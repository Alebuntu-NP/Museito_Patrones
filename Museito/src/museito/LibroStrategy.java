
package museito;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alberto García,Maria Pérula y Alejandro Román
 */
public class LibroStrategy implements Estrategia {

    /**
     * Constructor vacio de la estrategia de un libro
     */
    public LibroStrategy() {
    }

    /**
     * Metodo que nos repara un libro
     *
     * @param obra Libro que vamos a reparar
     * @param museo Museo en donde vamos a reparar el libro
     */
    public void reparar(Obra obra, Museo museo) {
        try {
            obra.setEstado("se ha enviado a  espacio especial para reparar");
            Museo.getInstance().notifyObservers(obra);
            Thread.sleep(5 * 1000);
            obra.setEstado("se estan mirando las letras borrosas y otros defectos del libro");
            Museo.getInstance().notifyObservers(obra);
            Thread.sleep(5 * 1000);
            obra.setEstado("se estan arreglando las letras borrosas con tinta especial y la solapa si estuviera dañada");
            Museo.getInstance().notifyObservers(obra);
            Thread.sleep(5 * 1000);
            obra.setEstado("ha sido reparado.");
            obra.setReparado(true);
            Museo.getInstance().notifyObservers(obra);
            Thread.sleep(5 * 1000);
            obra.setEstado("se esta llevando al museo.");
            Museo.getInstance().notifyObservers(obra);
            Thread.sleep(5 * 1000);
            obra.setEstado("esta reparado en el museo.");
            Museo.getInstance().notifyObservers(obra);
        } catch (InterruptedException ex) {
            Logger.getLogger(LibroStrategy.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getTipoStrategy() {
        return "LIBRO";
    }

}

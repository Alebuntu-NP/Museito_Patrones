package museito;

/**
 *
 * @author Autores
 */
public interface Sujeto {
    //Implementación patrón Observador

    /**
     * Metodo que nos guarda un observador en este caso del museo
     * @param o Observador que queremos añadir
     */

    public void registerObserver(Observador o);

    /**
     * Metodo que nos elimina un observador en este caso del museo
     * @param o Observador que queremos eliminar
     */
    public void removeObserver(Observador o);

    /**
     * Metodo que notifica a todos los observadores de que le ha ocurrido algo a la obra del museo
     * @param obra Obra a la que le ha ocurrido algo
     */
    public void notifyObservers(Obra obra);

}

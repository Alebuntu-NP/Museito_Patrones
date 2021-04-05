package museito;

/**
 *
 * @author Autores
 */
public interface Observador {

    //Implementación patrón Observador

    /**
     * Metodo que nos informa de lo que le va ocurriendo a la obra
     * @param obra Obra a la que se le esta haciendo cosas
     */
    public void update(Obra obra);
}

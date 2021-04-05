
package museito;

/**
 *
 * @author Alberto García,Maria Pérula y Alejandro Román
 */
public interface Estrategia {

    /**
     * Metodo que nos repara una obra dependiendo del tipo de estrategia a utilizar
     *
     * @param obra Obra que vamos a reparar
     * @param museo Museo donde se encuentra dicha obra
     */
    void reparar(Obra obra, Museo museo);

    /**
     * Metodo que nos devuelve el tipo de estrategia que estamos utilizando
     *
     * @return Tipo de estrategia que estamos usando
     */
    String getTipoStrategy();

}

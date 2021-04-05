/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package museito;

/**
 *
 * @author Autores
 */
public interface Estrategia {

    /**
     * Metodo que nos repara una obra dependiendo del tipo de estrategia a utilizar
     * @param obra Obra que vamos a reparar
     * @param museo Museo donde se encuentra dicha obra
     */
    void reparar(Obra obra, Museo museo);

    /**
     * Metodo que nos devuelve el tipo de estrategia que estamos utilizando
     * @return Tipo de estrategia que estamos usando
     */
    String getTipoStrategy();

}

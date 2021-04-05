/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package museito;

/**
 *
 * @author aleja
 */
public interface Estrategia {

    void reparar(Obra obra,Museo museo);

    String getTipoStrategy();

}

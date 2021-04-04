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
public class CuadroStrategy implements Estrategia {
    public CuadroStrategy() {
    }

    public void reparar(SimpleObraFactory obra) {
        System.out.println("El cuadro con nombre " + obra.getNombre() + " ha sido enviado a reparar.\n ");
    }

    public String getTipoStrategy() {
        return "CUADRO";
    }
}

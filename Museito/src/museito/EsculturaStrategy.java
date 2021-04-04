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
public class EsculturaStrategy implements Estrategia{

    public EsculturaStrategy() {
    }

    public void reparar(IObra obra) {
        System.out.println("La escultura con nombre " + obra.getNombre() + " ha sido enviada a reparar.\n ");
    }

    public String getTipoStrategy() {
        return "ESCULTURA";
    }
}

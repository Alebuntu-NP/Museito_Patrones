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
public class Museito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Patrón Singleton
        Museo m = Museo.getInstance();
        System.out.println(m.getDireccion());

    }

}

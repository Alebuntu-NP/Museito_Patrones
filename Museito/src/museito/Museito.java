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
        Museo museo = Museo.getInstance();
        System.out.println(museo.getDireccion());
        Trabajador t1 = new Trabajador("Norberto", "Garcia", "5678932B", "Calle Alemeda 37", 673947638, "Presidente");
        Trabajador t2 = new Trabajador("Patricia", "Garcia", "5678931B", "Calle Alemeda 37", 673947637, "Barrendero");

        museo.registerObserver(t1);
        museo.registerObserver(t2);
        IObra obra1 = new Obra("12sq","Mona Lisa","Cuadro","Barroco",2013,"ESPAÑA",null,"Alberto",false,"Mu bonito y poco color");
        museo.addObra(obra1);


    }

}

package museito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Trabajador extends Persona implements Observador {

    private String puesto;

    private List<Estrategia> estrategias;

    public Trabajador(String nombre, String apellido, String dni, String direccion, int telefono, String puesto) {
        super(nombre, apellido, dni, direccion, telefono);

        this.estrategias = new ArrayList<Estrategia>();
        
        this.estrategias.add((Estrategia) new EsculturaStrategy());
        this.estrategias.add((Estrategia) new LibroStrategy());
        this.estrategias.add((Estrategia) new CuadroStrategy());
        this.puesto = puesto;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public Estrategia getEstrategia(String tipo) {
        Estrategia estrategia = null;
        if (tipo.compareToIgnoreCase("Escultura") == 0) {
            estrategia = estrategias.get(0);
        } else if (tipo.compareToIgnoreCase("Libro") == 0) {
            estrategia = estrategias.get(1);
        } else if (tipo.compareToIgnoreCase("Cuadro") == 0) {
            estrategia = estrategias.get(2);
        }
        return estrategia;
    }

    public void update(Obra obra) {
        System.out.println("Se informa1 al trabajador " + getNombre() + " que la obra con nombre " + obra.getNombre() + " " + obra.getEstado());
    }

}

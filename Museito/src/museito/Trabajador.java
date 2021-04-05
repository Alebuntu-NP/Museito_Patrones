package museito;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Autores
 */
public class Trabajador extends Persona implements Observador {

    private String puesto;

    private List<Estrategia> estrategias;

    /**
     * Contructor con parametros del trabajador que hace uso del constructor de persona
     *
     * @param nombre Nombre del trabajador
     * @param apellido Apellido del trabajador
     * @param dni Dni del trabajador
     * @param direccion Direccion del trabajador
     * @param telefono Telefono del trabajador
     * @param puesto Puesto del trabajador, como por ejemplo Encargado del Mantenimiento
     */
    public Trabajador(String nombre, String apellido, String dni, String direccion, int telefono, String puesto) {
        super(nombre, apellido, dni, direccion, telefono);

        this.estrategias = new ArrayList<Estrategia>();

        this.estrategias.add((Estrategia) new EsculturaStrategy());
        this.estrategias.add((Estrategia) new LibroStrategy());
        this.estrategias.add((Estrategia) new CuadroStrategy());
        this.puesto = puesto;
    }

    /**
     * Metodo que nos devuelve el puesto de un trabajador
     *
     * @return Puesto al que pertenece el trabajador
     */
    public String getPuesto() {
        return puesto;
    }

    /**
     * Metodo que nos modifica el puesto al pertenece un trabajador
     *
     * @param puesto Puesto que va ha tener un trabajador
     */
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    /**
     * Metodo que nos repara una obra basado en la estrategia de reparacion
     *
     * @param obra Obra que vamos a reparar
     * @param museo Museo al que pertenece la obra
     */
    public void repararObra(Obra obra, Museo museo) {
        Estrategia estrategia = getEstrategia(obra.getTipo());
        estrategia.reparar(obra, museo);
    }

    /**
     * Metodo que avisa que esta estropeada una obra
     *
     * @param obra Obra que se ha estropeado
     */
    public void avisaEstropeado(Obra obra) {
        obra.setEstado("necesita reparación");
        obra.setReparado(false);
    }

    /**
     * Metodo que nos devuelve la estrategia que se esta usando dependiendo del tipo de obra
     *
     * @param tipo Tipo de obra que puede ser: Escultura, Libro o Cuadro
     * @return Estrategia de reparacion a usar
     */
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

    @Override
    public void update(Obra obra) {

        System.out.println("Se informa al trabajador " + getNombre() + " que: " + obra.getTipo() + " con id" + obra.getId() + " " + obra.getEstado());
    }

    @Override
    public String toString() {
        String s = "\nNombre: " + this.getNombre()
                + "\nApellido: " + this.getApellido()
                + "\nDNI: " + this.getDni()
                + "\nDirección: " + this.getDireccion()
                + "\nTeléfono: " + this.getTelefono()
                + "\nPuesto: " + this.getPuesto();
        return s;
    }

}

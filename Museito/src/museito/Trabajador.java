package museito;

public class Trabajador extends Persona implements Observador {

    private String puesto;

    public Trabajador(String nombre, String apellido, String dni, String direccion, int telefono, String puesto) {
        super(nombre, apellido, dni, direccion, telefono);
        this.puesto = puesto;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    
    
    public void update(IObra obra) {
            
        System.out.println("Trabajador " + getNombre() + " atento se ha añadido una obra nueva al museo con id " + obra.getId());
    }

}

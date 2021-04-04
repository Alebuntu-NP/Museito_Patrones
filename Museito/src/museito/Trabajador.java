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
        System.out.println("Se informa1 al trabajador " + getNombre() + " que la obra con nombre "+ obra.getNombre()+" "+obra.getEstado());
    }
    
    
    
    
    

}

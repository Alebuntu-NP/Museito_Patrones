package museito;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Autores
 */
public class Museo implements Sujeto {

    private String nombre = "AL A MA";
    private String direccion = "Calle Pablo de Olavide 57";
    private String pais = "ESPAÑA";
    private int telefono = 955556689;
    private String web = "https://al-a-ma.es";
    private List<Obra> obras = new ArrayList();
    private List<Observador> observadores = new ArrayList();
    private static Museo uniqueInstance;

    private Museo() {

    }

    /**
     * Metodo que nos crea una instancia unica de un MUSEO Esto pertenece al patron Singletone
     *
     * @return Nos devuelve un objeto de la clase Museo
     */
    public static Museo getInstance() {

        if (uniqueInstance == null) {

            uniqueInstance = new Museo();
        }

        return uniqueInstance;
    }

    /**
     * Metodo que nos devuelve nombre del museo
     *
     * @return Nombre del museo
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que nos modifica el nombre del museo
     *
     * @param nombre Nombre que queremos que tenga el museo
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que nos devuelve la direccion del museo
     *
     * @return Direccion del museo
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Metodo que nos modifica la direccion del museo
     *
     * @param direccion Direccion del museo
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Metodo que nos devuelve el pais al que pertenece el museo
     *
     * @return Pais al que pertenece el museo
     */
    public String getPais() {
        return pais;
    }

    /**
     * Metodo que nos modifica el pais al que pertenece el museo
     *
     * @param pais Pais donde va ha estar nuestro museo
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * Metodo que nos devuelve el telefono del museo
     *
     * @return Telefono del museo
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * Metodo que nos modifica el telefono del museo
     *
     * @param telefono Telefono que queremos que tenga el museo
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * Metodo que nos devuelve la web que tiene el museo
     *
     * @return Web que tiene el museo
     */
    public String getWeb() {
        return web;
    }

    /**
     * Metodo que nos modifica la web que tiene el museo
     *
     * @param web Web que queremos que tenga el museo
     */
    public void setWeb(String web) {
        this.web = web;
    }

    //Implementación patrón Observador
    @Override
    public void notifyObservers(Obra obra) {
        observadores.forEach((o) -> {
            o.update(obra);
        });
    }

    @Override
    public void registerObserver(Observador o) {
        this.observadores.add(o);
    }

    @Override
    public void removeObserver(Observador o) {
        this.observadores.remove(o);
    }

    /**
     * Metodo que nos devuelve la lista de las obras que tiene el museo
     *
     * @return Lista de obras del museo
     */
    public List<Obra> getObras() {
        return obras;
    }

    /**
     * Metodo que nos devuelve la lista de todos los observadores que tiene el museo Posdata los observadores son los trabajadores del museo
     *
     * @return Lista de los observadores del museo
     */
    public List<Observador> getObservadores() {
        return observadores;
    }

    /**
     * Metodo que nos devuelve una obra en concreto basandonos en un id
     *
     * @param id Identificador de la obra que queremos buscar
     * @return Obra que buscamos
     */
    public Obra getObra(String id) {
        Iterator it;

        it = obras.iterator();

        while (it.hasNext()) {
            Obra o = (Obra) it.next();
            if (o.getId().compareTo(id) == 0) {
                System.out.println(o.getNombre());
                return o;
            }
        }
        return null;
    }

    /**
     * Metodo que nos devuelve un trabajador dependiendo de un dni
     *
     * @param dni Dni del trabajador que buscamos
     * @return Trabajador que buscamos
     */
    public Trabajador getTrabajador(String dni) {
        Iterator it;

        it = observadores.iterator();

        while (it.hasNext()) {
            Trabajador t = (Trabajador) it.next();
            if (t.getDni().compareTo(dni) == 0) {
                System.out.println(t.getNombre());
                return t;
            }
        }
        return null;
    }

    /**
     * Metodo que nos añade un obra al museo y notifica a todos los trabajadores que se ha añadido la obra
     *
     * @param obra Obra que se ha añadido al museo
     */
    public void addObra(Obra obra) {
        obra.setEstado("se añadió");
        this.obras.add(obra);
        this.notifyObservers(obra);
    }

    /**
     *
     * Metodo que nos elimina un obra del museo y notifica a todos los trabajadores que se ha eliminado la obra
     *
     * @param obra Obra que queremos eliminar
     * @return Nos devuelve un true indicando si se ha eliminado la obra o no con un false
     */
    public boolean deleteObra(Obra obra) {

        obra.setEstado("se eliminó");
        this.notifyObservers(obra);
        return obras.remove(obra);

    }

    /**
     * Metodo que nos añade un trabajador al museo
     *
     * @param t Trabajador del museo que vamos añadir
     * @return True si se ha añadido el trabajador o no con un false
     */
    public boolean addTrabajador(Trabajador t) {

        return this.observadores.add(t);

    }

    /**
     * Metodo que nos elimina el trabajador del museo
     *
     * @param t Trabajado que queremos eliminar del museo
     * @return True si se ha eliminado el trabajador o no con un false
     */
    public boolean deleteTrabajador(Trabajador t) {

        return observadores.remove(t);

    }
}

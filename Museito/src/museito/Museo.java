package museito;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Museo {

    private String nombre = "AL A MA";
    private String direccion = "Calle Pablo de Olavide 57";
    private String pais = "ESPAÑA";
    private int telefono = 955556689;
    private String web = "https://al-a-ma.es";
    private List<Obra> obras = new ArrayList();
    private static Museo uniqueInstance;

    private Museo() {
        
    }

    public static Museo getInstance() {

        if (uniqueInstance == null) {

           //Creando la instancia unica Patron Singleton
            uniqueInstance = new Museo();
        }

        //Devolviendo instancia unica Patron Singleton
        return uniqueInstance;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public boolean addObra(Obra obra) {

        return obras.add(obra);

    }

    public boolean deleteObra(String id) {
        boolean enc = false;
        Iterator it;
        it = obras.iterator();

        while (it.hasNext() && !enc) {
            Obra o = (Obra) it.next();

            if (id.compareTo(o.getId()) == 0) {

                obras.remove(o);

            }

        }
        return enc;
    }

}

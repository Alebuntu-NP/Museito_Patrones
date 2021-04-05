package museito;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import poo.io.IO;

public class Museito {

    //Pone las letras rojas para el error
    public static final String LR = "\u001B[31m";
    // Pone las letras en verde si ha funcionado correctamente
    public static final String LG = "\u001B[32m";
    //Pone las letras a su color por defecto
    public static final String LD = "\u001B[0m";

    //Museo 
    public static Museo museo = Museo.getInstance();

    public static void main(String[] args) {

        // Patrón Singleton
//        System.out.println(museo.getDireccion());
        Trabajador t1 = new Trabajador("Norberto", "Garcia", "5678932B", "Calle Alemeda 37", 673947638, "Presidente");
//        Trabajador t2 = new Trabajador("Patricia", "Garcia", "5678931B", "Calle Alemeda 37", 673947637, "Barrendero");
//
//        museo.registerObserver(t1);
//        museo.registerObserver(t2);
//        Libro libro1 = new Libro("12sq", "Mona Lisa", "Barroco", 2013, "ESPAÑA", null, "Alberto", "Recien añadido", false, "Mu bonito y poco color", 23);
//        Escultura escultura = new Escultura("12sq", "Mono Lisa", "Barroco", 2013, "ESPAÑA", null, "Alberto", "Recien añadido", false, "Mu bonito y poco color", "Oro");
//        System.out.println(libro1.getTipo());
//        museo.addObra(libro1);
//        museo.addObra(escultura);
        //museo.addTrabajador(t1);
        // t1.getEstrategia("libro").reparar(libro1, museo);
        // t1.getEstrategia("escultura").reparar(escultura, museo);
        //museo.deleteObra("12sq");
        // museo.deleteTrabajador("5678932B");
        mostrarOpciones();
    }

    public static void mostrarOpciones() {

        int opc;
        do {
            System.out.println("\n\n\n\tMenú Principal:\n");
            System.out.println("\t1. Gestionar Trabajador");
            System.out.println("\t2. Gestionar Obra");
            System.out.println("\t----------------------");
            System.out.println("\t0. Salir");
            System.out.print("\n\n--> Introduzca una opción: ");
            opc = (int) IO.readNumber();
            while (opc < 0 || opc > 6) {
                System.out.println("\n\n--> Introduzca una opción válida: ");
                opc = (int) IO.readNumber();
                System.out.println("\n");
            }
            if (opc != 0) {
                salto(30);
                realizarOpcion(opc);
                salto(30);

            }
        } while (opc != 0);
    }

    private static void realizarOpcion(int opc) {
        switch (opc) {
            case 1:
                pantallaMenuTrabajador();
                break;
            case 2:
                pantallaMenuObra();
                break;
        }
    }

    private static void pantallaMenuTrabajador() {

        int opc;

        do {
            System.out.println("\n\n\n\tMenú Gestionar Trabajador:\n");
            System.out.println("\t1. Alta de Trabajador");
            System.out.println("\t2. Baja de Trabajador");
            System.out.println("\t3. Modificación de Trabajador");
            System.out.println("\t4. Consulta de Trabajador");
            System.out.println("\t---------------------");
            System.out.println("\t0. Volver");
            System.out.print("\n\n--> Introduzca una opción: ");
            opc = (int) IO.readNumber();
            while (opc < 0 || opc > 4) {
                System.out.print(LR + "--> Introduzca una opción valida: " + LD);
                opc = (int) IO.readNumber();
                System.out.println("\n");
            }
            if (opc != 0) {
                realizarOpcionGestionTrabajador(opc);
                System.out.println("");
                System.out.println("Pulsa ENTER para ir al menú");
                IO.readLine();
                salto(30);
            }
        } while (opc != 0);
    }

    private static void realizarOpcionGestionTrabajador(int opc) {
        System.out.println("Opción elegida: " + opc);

        switch (opc) {
            case 1:
                mostrarAltaTrabajador();
                break;
            case 2:
                mostrarBajaTrabajador();
                break;
            case 3:
                mostrarModificacionTrabajador();
                break;
            case 4:
                mostrarConsultaTrabajador();
                break;
        }
    }

    private static void mostrarAltaTrabajador() {
        String nombre, apellido, dni, direccion, puesto;
        int telefono;
        System.out.println("\nIntroduzca los datos del Cliente");

        System.out.print("Nombre: ");
        nombre = IO.readLine();
        System.out.print("Apellidos: ");
        apellido = IO.readLine();
        System.out.print("DNI: ");
        dni = IO.readLine();
        System.out.print("Dirección: ");
        direccion = IO.readLine();
        System.out.print("Telefono: ");
        telefono = (int) IO.readNumber();
        System.out.print("Puesto: ");
        puesto = IO.readLine();
        Trabajador t = new Trabajador(nombre, apellido, dni, direccion, telefono, puesto);
        museo.addTrabajador(t);
        System.out.println("El trabajador " + t.getNombre() + " se ha dado de baja correctamente.");
    }

    private static void mostrarBajaTrabajador() {

        String dni;
        System.out.println("\nIntroduzca el DNI de la obra: ");
        dni = IO.readLine();
        boolean enc = false;
        Iterator it;
        List trabajadores = museo.getObservadores();
        it = trabajadores.iterator();

        while (it.hasNext() && !enc) {
            Trabajador t = (Trabajador) it.next();
            if (t.getDni().compareTo(dni) == 0) {
                enc = true;
                museo.deleteTrabajador(dni);
            }
        }

        if (!enc) {
            System.out.println(LR + "No se ha encontrado un trabajador con el DNI dado" + LD);
        } else {

            System.out.println("Se ha dado de baja correctamente.");
        }

    }

    private static void mostrarModificacionTrabajador() {

    }

    private static void mostrarConsultaTrabajador() {

        String dni;
        System.out.println("\nIntroduzca el DNI de la obra: ");
        dni = IO.readLine();
        boolean enc = false;
        Iterator it;
        List trabajadores = museo.getObservadores();
        it = trabajadores.iterator();

        while (it.hasNext() && !enc) {
            Trabajador t = (Trabajador) it.next();
            if (t.getDni().compareTo(dni) == 0) {
                enc = true;
                System.out.println(t.getNombre());
            }
        }

        if (!enc) {
            System.out.println(LR + "No se ha encontrado un trabajador con el DNI dado" + LD);
        }

    }

    private static void pantallaMenuObra() {

        int opc;

        do {
            System.out.println("\n\n\n\tMenú Gestionar Obra:\n");
            System.out.println("\t1. Añadir Obra");
            System.out.println("\t2. Eliminar Obra");
            System.out.println("\t3. Modificación de Obra");
            System.out.println("\t4. Consulta de Obra");
            System.out.println("\t---------------------");
            System.out.println("\t0. Volver");
            System.out.print("\n\n--> Introduzca una opción: ");
            opc = (int) IO.readNumber();
            while (opc < 0 || opc > 4) {
                System.out.print(LR + "--> Introduzca una opción válida: " + LD);
                opc = (int) IO.readNumber();
                System.out.println("\n");
            }
            if (opc != 0) {
                realizarOpcionGestionObra(opc);
                System.out.println("");
                System.out.println("Pulsa ENTER para ir al menú");
                IO.readLine();
                salto(30);
            }
        } while (opc != 0);
    }

    private static void realizarOpcionGestionObra(int opc) {
        System.out.println("Opción elegida: " + opc);

        switch (opc) {
            case 1:
                mostrarAltaObra();
                break;
            case 2:
                mostrarBajaObra();
                break;
            case 3:
                mostrarModificacionObra();
                break;
            case 4:
                mostrarConsultaObra();
                break;
        }
    }

    private static void mostrarAltaObra() {
        String id = "", nombre, tipo, estilo, estado = "", origen, autor, descripcion;
        int fallo, anyo, contador = 1;
        boolean reparado;

        System.out.println("\nIntroduzca los datos del Obra");

        System.out.print("Nombre: ");
        nombre = IO.readLine();

        do {
            System.out.print("Tipo: (Libro, Escultura o Cuadro)");
            tipo = IO.readLine();
            if (tipo.compareToIgnoreCase("Libro") == 0 || tipo.compareToIgnoreCase("Escultura") == 0 || tipo.compareToIgnoreCase("Cuadro") == 0) {
                fallo = 0;
            } else {
                System.out.println(LR + "\nError: El dato introducido ha de ser Libro, Escultura o Libro." + LD);
                fallo = -1;
            }
        } while (fallo == -1);

        switch (tipo) {
            case "Libro":
                id = "L" + contador;
                break;
            case "Escultura":
                id = "E" + contador;
                break;
            case "Cuadro":
                id = "C" + contador;
                break;
            default:
                break;
        }
        contador++;
        System.out.print("Estilo: ");
        estilo = IO.readLine();
        System.out.print("Origen: ");
        origen = IO.readLine();
        System.out.print("Autor: ");
        autor = IO.readLine();
        fallo = -1;
        do {
            System.out.print("¿Está para reparar?: (true/false)");
            reparado = IO.readBoolean();
            if (reparado == true || reparado == false) {
                fallo = 0;
            } else {
                System.out.println(LR + "\nError: El dato introducido ha de ser true o false" + LD);
            }
        } while (fallo == -1);
        fallo = -1;
        do {
            System.out.print("Año de la obra: ");
            anyo = (int) IO.readNumber();
            if (anyo <= Calendar.getInstance().get(Calendar.YEAR)) {
                fallo = 0;
            } else {
                System.out.println(LR + "\nError: La obra no puede ser creada con fecha posterior a la actual" + LD);
            }
        } while (fallo == -1);
        System.out.print("Descripción: ");
        descripcion = IO.readLine();
        Obra nuevaObra = new Obra(id, nombre, tipo, estilo, anyo, origen, null, autor, estado, reparado, descripcion);
        museo.addObra(nuevaObra);
        System.out.println("La obra se ha añadido correctamente");
    }

    private static void mostrarBajaObra() {
        String id;
        System.out.println("\nIntroduzca el Id de la obra: ");
        id = IO.readLine();
        boolean enc = false;
        Iterator it;
        List obras = museo.getObras();
        it = obras.iterator();

        while (it.hasNext() && !enc) {
            Obra o = (Obra) it.next();
            if (o.getId().compareTo(id) == 0) {
                enc = true;
                museo.deleteObra(id);
            }
        }

        if (!enc) {
            System.out.println("No se ha encontrado una obra con el Id dado");
        }
    }

    private static void mostrarModificacionObra() {
        String id;
        System.out.println("\nIntroduzca el Id de la obra a modificar: ");
        id = IO.readLine();
        Obra o = museo.getObra(id);
        if (o != null) {
            System.out.println("\nIntroduzca los datos del Obra");

            System.out.print("Nombre: ");
            nombre = IO.readLine();
            o.setAutor();
            System.out.print("Nombre: ");
            nombre = IO.readLine();
            o.getDescripcion();
        } else {
            System.out.println(LR + "No se ha encontrado una obra con el Id dado" + LD);
        }

    }

    private static void mostrarConsultaObra() {
        String id;
        System.out.println("\nIntroduzca el Id de la obra: ");
        id = IO.readLine();
        Obra o = museo.getObra(id);
        if (o != null) {
            System.out.println(o.getNombre());
        } else {
            System.out.println(LR + "No se ha encontrado una obra con el Id dado" + LD);
        }
    }

    public static void salto(int n) {

        for (int i = 0; i < n; i++) {

            System.out.println("");
        }

    }

}

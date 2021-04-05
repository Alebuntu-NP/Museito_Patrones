package museito;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import poo.io.IO;

/**
 *
 * @author aleja
 */
public class Museito {

    /**
     * Pone las letras rojas para el error
     */
    public static final String LR = "\u001B[31m";

    /**
     * Pone las letras en verde si ha funcionado correctamente
     */
    public static final String LG = "\u001B[32m";

    /**
     * Pone las letras a su color por defecto
     */
    public static final String LD = "\u001B[0m";

    /**
     * Museo en donde se utiliza la aplicación
     */
    public static Museo museo = Museo.getInstance();

    //Contador de id de libro
    public static int c1 = 1;

    //Contador de id de escultura
    public static int c2 = 1;

    //Contador de id de cuadro
    public static int c3 = 1;

    /**
     * Programa principal
     *
     * @param args No tiene por defecto ningun argumento, solo nos sirve para indicar el main
     */
    public static void main(String[] args) {

        Trabajador t1 = new Trabajador("Norberto", "Garcia", "5678932B", "Calle Alemeda 37", 673947638, "Presidente");
        Trabajador t2 = new Trabajador("Patricia", "Garcia", "5678931B", "Calle Alemeda 37", 673947637, "Barrendero");

        museo.registerObserver(t1);
        museo.registerObserver(t2);
        Libro libro1 = new Libro("L1", "Mona Lisa", "Barroco", 2013, "ESPAÑA", null, "Alberto", "Recien añadido", false, "Mu bonito y poco color", 23);
        Escultura escultura = new Escultura("E1", "Mono Lisa", "Barroco", 2013, "ESPAÑA", null, "Alberto", "Recien añadido", false, "Mu bonito y poco color", "Oro");

        museo.addObra(libro1);
        museo.addObra(escultura);
        museo.addTrabajador(t1);
        museo.addTrabajador(t2);

        mostrarOpciones();
    }

    /**
     * Menus de nuestra aplicaion del museo
     */
    public static void mostrarOpciones() {

        int opc;
        do {
            System.out.println("\n\n\n\tMenú Principal:\n");
            System.out.println("\t1. Gestionar Trabajador");
            System.out.println("\t2. Gestionar Obra");
            System.out.println("\t3. Listar Trabajadores");
            System.out.println("\t4. Listar Obras");
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
            case 3:
                pantallaListarTrabajadores();
                break;
            case 4:
                pantallaListarObras();
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
        System.out.println("El trabajador " + t.getNombre() + " se ha dado de alta correctamente.");
    }

    private static void mostrarBajaTrabajador() {

        String dni;
        System.out.println("\nIntroduzca el DNI del trabajador: ");
        dni = IO.readLine();
        Trabajador t = museo.getTrabajador(dni);
        if (t != null) {
            museo.deleteTrabajador(t);
            System.out.println("Se ha dado de baja correctamente.");
        } else {
            System.out.println(LR + "No se ha encontrado un trabajador con el DNI dado" + LD);

        }

    }

    private static void mostrarModificacionTrabajador() {
        String nombre, apellido, dni, direccion, puesto;
        int telefono;
        System.out.println("\nIntroduzca el DNI del trabajador: ");
        dni = IO.readLine();
        Trabajador t = museo.getTrabajador(dni);
        if (t != null) {
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
            t.setNombre(nombre);
            t.setApellido(apellido);
            t.getDni();
            t.setDireccion(direccion);
            t.setTelefono(telefono);
            t.setPuesto(puesto);

        } else {
            System.out.println(LR + "No se ha encontrado un trabajador con el DNI dado" + LD);
        }

    }

    private static void mostrarConsultaTrabajador() {

        String dni;
        System.out.println("\nIntroduzca el DNI del trabajador: ");
        dni = IO.readLine();
        Trabajador t = museo.getTrabajador(dni);
        if (t != null) {
            System.out.println(t.toString());

        } else {
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
            System.out.println("\t5. Reparar Obra");
            System.out.println("\t6. Hace falta reparación");
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
            case 5:
                mostrarRepararObra();
                break;
            case 6:
                mostrarAvisoReparacionObra();
                break;
        }
    }

    private static void mostrarAltaObra() {
        String id = "", nombre, tipo, estilo, estado = "", origen, autor, descripcion;
        int fallo, anyo;
        boolean reparado;

        System.out.println("\nIntroduzca los datos del Obra");

        System.out.print("Nombre: ");
        nombre = IO.readLine();

        do {
            System.out.print("Tipo(Libro, Escultura o Cuadro): ");
            tipo = IO.readLine();
            if (tipo.compareToIgnoreCase("Libro") == 0 || tipo.compareToIgnoreCase("Escultura") == 0 || tipo.compareToIgnoreCase("Cuadro") == 0) {
                fallo = 0;
            } else {
                System.out.println(LR + "\nError: El dato introducido ha de ser Libro, Escultura o Libro." + LD);
                fallo = -1;
            }
        } while (fallo == -1);

        System.out.print("Estilo: ");
        estilo = IO.readLine();
        System.out.print("Origen: ");
        origen = IO.readLine();
        System.out.print("Autor: ");
        autor = IO.readLine();
        fallo = -1;
        do {
            System.out.print("¿Está para reparar?(true/false): ");
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

        switch (tipo) {
            case "Libro":
                id = "L" + c1;
                int paginas;
                System.out.print("Numero de paginas: ");
                paginas = (int) IO.readNumber();
                Libro libro = new Libro(id, nombre, estilo, anyo, origen, null, autor, estado, reparado, descripcion, paginas);
                museo.addObra(libro);
                c1++;
                break;
            case "Escultura":
                id = "E" + c2;
                String material;
                System.out.print("Material: ");
                material = IO.readLine();
                Escultura escultura = new Escultura(id, nombre, estilo, anyo, origen, null, autor, estado, reparado, descripcion, material);
                museo.addObra(escultura);
                c2++;
                break;
            case "Cuadro":
                id = "C" + c3;
                String marco;
                System.out.print("Marco: ");
                marco = IO.readLine();
                Cuadro cuadro = new Cuadro(id, nombre, estilo, anyo, origen, null, autor, estado, reparado, descripcion, marco);
                museo.addObra(cuadro);
                c3++;
                break;
            default:
                break;
        }

        System.out.println("La obra se ha añadido correctamente");
    }

    private static void mostrarBajaObra() {
        String id;
        System.out.println("\nIntroduzca el Id de la obra: ");
        id = IO.readLine();

        Obra obra = museo.getObra(id);
        if (obra != null) {
            museo.deleteObra(obra);
        } else {
            System.out.println(LR + "No se ha encontrado una obra con el Id dado" + LD);
        }
    }

    private static void mostrarModificacionObra() {
        String id, nombre, autor, estilo, descripcion, origen;
        int anyo, fallo = -1;
        System.out.println("\nIntroduzca el Id de la obra a modificar: ");
        id = IO.readLine();
        Obra o = museo.getObra(id);
        if (o != null) {
            System.out.println("\nIntroduzca los datos del Obra");
            System.out.print("Nombre: ");
            nombre = IO.readLine();
            System.out.print("Autor: ");
            autor = IO.readLine();
            System.out.print("Estilo: ");
            estilo = IO.readLine();
            System.out.print("Descripción: ");
            descripcion = IO.readLine();
            do {
                System.out.print("Año de la obra: ");
                anyo = (int) IO.readNumber();
                if (anyo <= Calendar.getInstance().get(Calendar.YEAR)) {
                    fallo = 0;
                } else {
                    System.out.println(LR + "\nError: La obra no puede ser creada con fecha posterior a la actual" + LD);
                }
            } while (fallo == -1);
            System.out.print("Origen: ");
            origen = IO.readLine();

            o.setNombre(nombre);
            o.setEstilo(estilo);
            o.setAutor(autor);
            o.setAnyo(anyo);
            o.setOrigen(origen);
            o.setDescripcion(descripcion);

            o.setEstado("se ha actualizado la información");
            museo.notifyObservers(o);

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
            System.out.println(o.toString());
        } else {
            System.out.println(LR + "No se ha encontrado una obra con el Id dado" + LD);
        }
    }

    private static void mostrarRepararObra() {

        String id, dni;
        System.out.println("\nIntroduzca el DNI del trabajador que lleva\n"
                + "la obra a reparar: ");

        dni = IO.readLine();
        Trabajador t = museo.getTrabajador(dni);
        if (t != null) {

            System.out.println("\nIntroduzca el Id de la obra que necesita repación: ");
            id = IO.readLine();
            Obra o = museo.getObra(id);
            if (o != null) {
                t.repararObra(o, museo);
            } else {
                System.out.println(LR + "No se ha encontrado una obra con el Id dado" + LD);
            }
        } else {
            System.out.println(LR + "No se ha encontrado un trabajador con el DNI dado" + LD);

        }

    }

    private static void mostrarAvisoReparacionObra() {
        String id, dni;
        System.out.println("\nIntroduzca el DNI del trabajador que\n"
                + " avisa de necesita repararicion la obra: ");

        dni = IO.readLine();
        Trabajador t = museo.getTrabajador(dni);
        if (t != null) {

            System.out.println("\nIntroduzca el Id de la obra que necesita repación: ");
            id = IO.readLine();
            Obra o = museo.getObra(id);
            if (o != null) {
                t.avisaEstropeado(o);
                museo.notifyObservers(o);
            } else {
                System.out.println(LR + "No se ha encontrado una obra con el Id dado" + LD);
            }
        } else {
            System.out.println(LR + "No se ha encontrado un trabajador con el DNI dado" + LD);

        }
    }

    private static void pantallaListarTrabajadores() {
        System.out.println("LISTA DE TRABAJADORES");
        List<Observador> ts = museo.getObservadores();
        Iterator it;
        it = ts.iterator();

        while (it.hasNext()) {
            Trabajador t = (Trabajador) it.next();
            System.out.println("\nDNI: " + t.getDni() + "\t-\tNombre: " + t.getNombre() + " " + t.getApellido());

        }
        System.out.println("");
        System.out.println("Pulsa ENTER para ir al menú");
        IO.readLine();
    }

    private static void pantallaListarObras() {
        System.out.println("LISTA DE OBRAS");
        List<Obra> ts = museo.getObras();
        Iterator it;
        it = ts.iterator();

        while (it.hasNext()) {
            Obra o = (Obra) it.next();
            System.out.println("\nID: " + o.getId() + "\t-\tNombre: " + o.getNombre() + "\t-\tAutor: " + o.getAutor());
        }
        System.out.println("");
        System.out.println("Pulsa ENTER para ir al menú");
        IO.readLine();
    }

    /**
     * Es basicamente un salto de linea muy grande para hacer el salto de un menu a otro
     *
     * @param n Numero de linea que queramos saltarnos
     */
    public static void salto(int n) {

        for (int i = 0; i < n; i++) {

            System.out.println("");
        }

    }

}

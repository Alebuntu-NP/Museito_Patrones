package museito;

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
    //Patron para validar el telefono
    Pattern patronTelefono = Pattern.compile("[0-9]");

    public static void main(String[] args) {

        // Patrón Singleton
        Museo museo = Museo.getInstance();
        System.out.println(museo.getDireccion());
        Trabajador t1 = new Trabajador("Norberto", "Garcia", "5678932B", "Calle Alemeda 37", 673947638, "Presidente");
        Trabajador t2 = new Trabajador("Patricia", "Garcia", "5678931B", "Calle Alemeda 37", 673947637, "Barrendero");

        museo.registerObserver(t1);
        museo.registerObserver(t2);
        IObra obra1 = new Obra("12sq", "Mona Lisa", "Cuadro", "Barroco", 2013, "ESPAÑA", null, "Alberto", "Recien añadido", false, "Mu bonito y poco color");
        t1.getEstrategia("libro").reparar(obra1);
        // museo.addObra(obra1);
        //museo.deleteObra("12sq");

        //mostrarOpciones();
    }

    public static void mostrarOpciones() {

        int opc;
        do {
            System.out.println("\n\n\n\tMenú Principal:\n");
            System.out.println("\t1. Gestionar Clientes");
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
                pantallaMenuCliente();
                break;

        }
    }

    private static void pantallaMenuCliente() {

        int opc;

        do {
            System.out.println("\n\n\n\tMenú Gestionar Cliente:\n");
            System.out.println("\t1. Alta de Cliente");
            System.out.println("\t2. Baja de Cliente");
            System.out.println("\t3. Modificación de Cliente");
            System.out.println("\t4. Consulta de Cliente");
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
                realizarOpcionGestionCliente(opc);
                System.out.println("");
                System.out.println("Pulsa ENTER para ir al menú");
                IO.readLine();
                salto(30);
            }
        } while (opc != 0);
    }

    private static void realizarOpcionGestionCliente(int opc) {
        System.out.println("Opción elegida: " + opc);

        switch (opc) {
            case 1:
                mostrarAltaCliente();
                break;
            case 2:
                mostrarBajaCliente();
                break;
            case 3:
                mostrarModificacionCliente();
                break;
            case 4:
                mostrarConsultaCliente();
                break;
        }
    }

    private static void mostrarAltaCliente() {

    }

    private static void mostrarBajaCliente() {

    }

    private static void mostrarModificacionCliente() {

    }

    private static void mostrarConsultaCliente() {

    }

    // Validacion del DNI
    public static boolean validarNIF(String nif) {

        boolean correcto;
        Pattern pattern = Pattern.compile("(\\d{1,8})([TRWAGMYFPDXBNJZSQVHLCKEtrwagmyfpdxbnjzsqvhlcke])");
        Matcher matcher = pattern.matcher(nif);
        if (matcher.matches()) {
            String letra = matcher.group(2);
            String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
            int index = Integer.parseInt(matcher.group(1));
            index = index % 23;
            String reference = letras.substring(index, index + 1);
            correcto = reference.equalsIgnoreCase(letra);
        } else {
            correcto = false;
        }
        return correcto;
    }

    public static void salto(int n) {

        for (int i = 0; i < n; i++) {

            System.out.println("");
        }

    }

}

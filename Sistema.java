import java.util.ArrayList;
import java.util.Scanner;
public class Sistema {

    private ArrayList<Paciente> pacientes = new ArrayList<>();
    private ArrayList<Consulta> consultas = new ArrayList<>();

    public void registrarConsulta(){
        Scanner leer = new Scanner(System.in);

        leer.nextLine();


        System.out.println("REGISTRAR CONSULTA");

        System.out.print("Ingrese su Nombre: ");
        String nombre = leer.nextLine();

        System.out.print("Ingrese su Edad: ");
        int edad = leer.nextInt();
        leer.nextLine();

        System.out.print("Ingrese su Comuna: ");
        String comuna = leer.nextLine();
        System.out.println("Previsión:");
        System.out.println("1. Isapre");
        System.out.println("2. Fonasa");
        System.out.print("Seleccione: ");
        int prevision = leer.nextInt();


        System.out.println("¿Posee alguna enfermedad crónica?( diabetes, hirpentension, asma, etc)");

        System.out.println("1. Sí");
        System.out.println("2. No");
        System.out.print("Seleccione: ");
        int opcionCronico = leer.nextInt();


        boolean cronico = (opcionCronico == 1);

        Paciente paciente = new Paciente(nombre, edad, comuna, prevision, cronico);

        System.out.println("¿Cuales son sus sintomas principales?");
        System.out.println("1. Malestar General");
        System.out.println("2. Realizacion de examenes medicos");
        System.out.println("3. urgencia medica");
        System.out.println("4. Control médico programado");
        System.out.print("Seleccione: ");
        int servicio = leer.nextInt();

        System.out.println("¿Cuenta con alguna derivación médica?");
        System.out.println("1. Sí");
        System.out.println("2. No");
        System.out.print("Seleccione: ");
        int opcionDerivacion = leer.nextInt();

        boolean derivacion = (opcionDerivacion == 1);

        Consulta consulta = new Consulta(servicio, derivacion);

        pacientes.add(paciente);
        consultas.add(consulta);

        System.out.println("Consulta registrada correctamente.");

        consulta.mostrarOrientacion(paciente);
    }



    public void buscarConsulta(Scanner leer) {

        if (pacientes.isEmpty()) {
            System.out.println("No existe ninguna consulta registrada.");
            return;
        }

        leer.nextLine();

        System.out.print("Ingrese el nombre del paciente: ");
        String nombre = leer.nextLine();

        boolean encontrado = false;

        for (int i = 0; i < pacientes.size(); i++) {

            if (pacientes.get(i).getNombre().equalsIgnoreCase(nombre)) {

                System.out.println("Paciente encontrado");
                System.out.println("Nombre: " + pacientes.get(i).getNombre());
                System.out.println("Edad: " + pacientes.get(i).getEdad());
                System.out.println("Comuna: " + pacientes.get(i).getComuna());

                consultas.get(i).mostrarOrientacion(pacientes.get(i));
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Paciente no se a encontrado.");
        }
    }




    public void mostrarConsultas(){

        if (pacientes.isEmpty()) {
            System.out.println("No existen consultas registradas.");
            return;
        }

        System.out.println("CONSULTAS REGISTRADAS");

        for (int i = 0; i < pacientes.size(); i++) {

            System.out.println("1" + "Consulta #" + (i + 1));

            System.out.println("Nombre: " + pacientes.get(i).getNombre());
            System.out.println("Edad: " + pacientes.get(i).getEdad());
            System.out.println("Comuna: " + pacientes.get(i).getComuna());

            consultas.get(i).mostrarOrientacion(pacientes.get(i));
        }


    }

    public void mostrarInformacion(){

        System.out.println("INFORMACIÓN DEL SISTEMA");
        System.out.println("Sistema de orientación básica en salud.");
        System.out.println("Este sistema entrega orientación general.");
        System.out.println("Este sistema no reemplaza la atención de un profesional de la salud.");
    }


}
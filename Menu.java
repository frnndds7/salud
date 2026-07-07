import java.util.Scanner;
public class Menu {
    private Scanner leer = new Scanner(System.in);
    private Sistema sistema = new Sistema();
    String buscar = leer.next();


    public void iniciar(){
        int opcionMenu = 0;
        while(opcionMenu!=5){
            mostrarMenu(); opcionMenu= validarMenu();

            if(opcionMenu==1){registrarConsulta();}
            else if (opcionMenu==2){
                System.out.println("ingrese nombre del paciente para reindicar");
                sistema.buscarPaciente(buscar);}
            else if (opcionMenu==3){sistema.mostrarPacientes();}
            else if (opcionMenu==4){mostrarInfoSistema();}
            else if  (opcionMenu==5){System.out.println("fin");}
        }
    }
    private void mostrarMenu(){
        System.out.println("Este es el sistema de orientacion (marque una opcion)");
        System.out.println("1. comenzar con la orientacion medica");
        System.out.println("2. recuperar una orientacion medica anterior");
        System.out.println("3. ver las consultar registradas ");
        System.out.println("4. informacion del sistema");
        System.out.println("5. Salir");
    } private int validarMenu(){
        int opcion = leer.nextInt();
        while(opcion<1 || opcion>5){System.out.println("opcion invalida, solo eliga de 1-5");
        opcion = leer.nextInt();}return opcion;
    }
    private int validarServicio(){int opcion = leer.nextInt();
    while (opcion < 1||opcion >4) System.out.println("opcion invalida, solo eliga de 1-4");opcion = leer.nextInt();
    return opcion;
    }
    private int validarOpciondos(){int opcion = leer.nextInt();
    while (opcion < 1 || opcion > 2){System.out.println("opcion incorrecta solo eliga 1 o 2");
    opcion = leer.nextInt();}return opcion;}

    private int validarEdad(){int opcion = leer.nextInt(); int edad = leer.nextInt();
    while (edad<=0) {System.out.println("edad invalida ingrese nuevamente");
        edad = leer.nextInt();}
    return opcion;
    }
    private void registrarConsulta(){
        System.out.println("Registrar nueva consulta");
        System.out.println("ingrese su nombre: "); String nombre = leer.next();
        System.out.println("ingrese su edad: "); int edad = validarEdad();
        System.out.println("ingrese su comuna:  "); String Comuna = leer.next();
        //
        System.out.println("cuales son sus principales sintomas?");
        System.out.println("1. malestar general");
        System.out.println("2. realizacion de eexamenes medicos");
        System.out.println("3. urgencia medica ");
        System.out.println("4. control medico programado");
        int servicioElegido = validarServicio();
        //
        System.out.println("tiene derivacion medica?");
        System.out.println("1. si");
        System.out.println("2. no"); int derivacion = validarOpciondos();
        //
        System.out.println("tiene enfermedad cronica?(ya sea diabetes, asma, hipertension, etc)");
        System.out.println("1. si");
        System.out.println("2. no"); int cronico = validarOpciondos();
        Paciente paciente = new Paciente(nombre, edad , Comuna, servicioElegido, derivacion, cronico);
        sistema.getOrientacion().mostrarOrientacion(paciente);
        sistema.registrarPaciente(paciente);
    }
    private void mostrarInfoSistema(){
        System.out.println("este sistema es para orientar a las personas");
        System.out.println("sobre como acceder a los distintos servicios de");
        System.out.println("salud de forma correcta");
    }

}

import java.util.ArrayList;
public class Sistema {
    private ArrayList<Paciente> pacientes = new ArrayList();
    private Orientacion orientacion = new Orientacion();

    public void registrarPaciente(Paciente paciente) {
        pacientes.add(paciente);
        System.out.println("consulta registrada");
    }

    public void buscarPaciente(String nombre) {
        System.out.println("recuperar atencion anterior");
        if (pacientes.isEmpty()) {
            System.out.println("no hay rergisitros de orientacion en el sistema");
            return;
        }
        boolean encontrado = false;
        for (
                int i = 0; i < pacientes.size(); i++) {
            Paciente paciente = pacientes.get(i);
            if (paciente.getNombre().equalsIgnoreCase(nombre)) {
                encontrado = true;
                orientacion.mostrarOrientacion(paciente);
                System.out.println("emision de ficha de orientacion");
                System.out.println("nombrbe:  " + paciente.getNombre());
                System.out.println("edad:  " + paciente.getEdad());
                System.out.println("comuna:  " + paciente.getComuna());
            }
        }if (!encontrado) {System.out.println("no se encontro orientacion para  "+nombre);}
    }
    public void mostrarPacientes() {
        System.out.println("consultas registradas");
        if (pacientes.isEmpty()) {System.out.println("no se encontraron orientaciones");return;
        }
        for (
                int i = 0; i < pacientes.size(); i++) {
            Paciente paciente = pacientes.get(i);
            System.out.println("nombre:  " + paciente.getNombre());
            System.out.println("edad:  " + paciente.getEdad());
            System.out.println("comuna:  " + paciente.getComuna());
        }
    }
    public Orientacion getOrientacion() {
        return orientacion;
    }
}

public class Paciente {
    private String nombre;
    private String comuna;
    private int edad;
    private int servicio;
    private int derivacion;
    private int cronico;
    public Paciente(String nombre, String comuna, int edad, int servicio, int derivacion) {
        this.nombre = nombre;
        this.comuna = comuna;
        this.edad = edad;
        this.servicio = servicio;
        this.derivacion = derivacion;
        this.cronico = cronico;}
    public String getNombre(){return nombre;}
    public String getComuna(){return comuna;}
    public int getEdad(){return edad;}
    public int getServicio(){return servicio;}
    public int getDerivacion(){return derivacion;}
    public int getCronico(){return cronico;}
}

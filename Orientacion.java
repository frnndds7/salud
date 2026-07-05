public class Orientacion {
    public void mostrarOrientacion(Paciente paciente){
        System.out.println("la orientacion que s ele recomienda:");
        if(paciente.getServicio()==1){
            System.out.println("malestar general o sistomas leves");
            System.out.println("se le recomienda acurdir al cesfam"+paciente.getServicio()+" para una consulta general");}
        else if(paciente.getServicio()==2){
            System.out.println("realizacion de examenes medicos ");
            System.out.println("vaya el centro indicado en su orden medica");

        }else if(paciente.getServicio()==3){
            System.out.println("uurgencia medica");
            System.out.println("establecimiento recomendado: SAPU u Hospital urgencia mas cercano");
        }else if(paciente.getServicio()==4){
            System.out.println("control medico programado");
            System.out.println("vaya al hospital de  "+paciente.getComuna()+"o al centro medico indicado en su orden medica");
        }

        System.out.println("Los requsitos obligatorios:");
        System.out.println("Cedula de identidad vigente");
        if (paciente.getDerivacion()==1){System.out.println("documento impreso de la orden o derivacion medica ");}
        if(paciente.getEdad()<=1||paciente.getEdad()>=65||paciente.getCronico()==1)
        {System.out.println("informacion adidcional:");
        System.out.println("debido a su edad o condicion medica se le recomienda no retrasar la consulta");
        System.out.println("y seguir las indicaciones dadas por el establecimiento correspondiente");}
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herrenciasimplepaper;

/**
 *
 * @author Erick Unda
 */
class MotorInduccion{
    double falla_motor_induccion;
    double diagnostico_usuario;

    void MostrarCaracteristicaFalla(){
        System.out.println("El  diagnostico es :"
        + falla_motor_induccion+"\t Tipo de falla númerica"+
                "\nEl tipo de falla es:"+diagnostico_usuario+"\tnúmero de análisis para ejecución");
    }
}
class MotorMonofasico extends MotorInduccion{
    String tipo;

    double CodigoFalla(){
        return falla_motor_induccion=diagnostico_usuario;
    }
    void mostrarTipo(){
        System.out.println("El Motor es: "+tipo);
    }
}

class MotorTrifasico extends MotorInduccion{
    String tipo;

    double CodigoFalla(){
        return falla_motor_induccion=diagnostico_usuario;
    }
    void mostrarTipo(){
        System.out.println("El Motor es:"+tipo);
    }
}

class Motor extends MotorInduccion{
    String tipo;

    double CodigoFalla(){
        return falla_motor_induccion=diagnostico_usuario;
    }

    void mostrarTipo(){
        System.out.println("El Motor es:"+tipo);
    }
}
public class HerrenciaSimplePaper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

                System.out.println("____________________________________________________________");
        System.out.println("---------[UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE]---------");
        System.out.println("ASIGNATURA: PROGRAMACION");
        System.out.println("DOCENTE: ING. LUIS ALBERTO GUERRA CRUZ");
        System.out.println("NRC: 7450");
        System.out.println("ESTUDIANTE: ERICK UNDA");
        System.out.println("\tDIAGNOSTICO DE FALLAS MOTOR DE INDUCCIÓN");

        MotorMonofasico motormonofasico1=new MotorMonofasico();
        MotorTrifasico motortrifasico1=new MotorTrifasico();
        Motor motor1=new Motor();

        motormonofasico1.falla_motor_induccion=54;
        motormonofasico1.diagnostico_usuario=1228;
        motormonofasico1.tipo="Motor Monofasico AC de Inducción";

        motor1.falla_motor_induccion=1834;
        motor1.diagnostico_usuario=12;
        motor1.tipo="Motor Electrico DC 110 voltios";

        motortrifasico1.falla_motor_induccion=34;
        motortrifasico1.diagnostico_usuario=130;
        motortrifasico1.tipo="Motor Trifásico AC de Inducción 220 voltios";

        System.out.println("Información para el Motor Monofasico:");
        motormonofasico1.mostrarTipo();
        motormonofasico1.MostrarCaracteristicaFalla();
        System.out.println("Código de falla:"+motormonofasico1.CodigoFalla() + "\tReparación Rotor");
        System.out.println();

        System.out.println("Información del Motor:");
        motor1.mostrarTipo();
        motor1.MostrarCaracteristicaFalla();
        System.out.println("Código de falla:"+motor1.CodigoFalla() + "\tMotor Quemado--Reemplazarlo");
        System.out.println();

       System.out.println("Información para el Motor Trifasico:");
        motortrifasico1.mostrarTipo();
        motortrifasico1.MostrarCaracteristicaFalla();
        System.out.println("Código de falla:"+motortrifasico1.CodigoFalla() + "\tReparación Bobinas Primarias");
        System.out.println();
    }

}

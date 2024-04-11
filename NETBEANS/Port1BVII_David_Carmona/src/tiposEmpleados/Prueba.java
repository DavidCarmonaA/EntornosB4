package tiposEmpleados;

import java.util.ArrayList;

/**
 * Clase encargada de crear los objetos e imprimirlos por pantalla, apoyándose
 * de las clases que definen los objetos.
 * @author David
 */
public class Prueba {
    
    /**
     * Método main encargado de la ejecución.
     * @param args
     */
    public static void main(String[] args) {
        
        System.out.println("INICIO DE PROGRAMA:");
        System.out.println("");
        
        Asalariado asalariado1 = new Asalariado(800, "Juan",
                "Gómez", "11111111A");        
        PorHoras porHoras1 = new PorHoras("Carolina", "Marín", 
                "22222222B", 16.75, 40);        
        Comision comision1 = new Comision("Marcos", "Guerra", "33333333C",
                10000, 0.06);
        BaseConComision baseComision1 = new BaseConComision("Roberto", "Jiménez",
                "44444444D", 5000, 0.04, 300);
        
        System.out.println("EMPLEADOS PROCESADOS INDIVIDUALMENTE");
        System.out.println("------------------------------------");
        System.out.println("");
        System.out.println(asalariado1);
        System.out.println(porHoras1);
        System.out.println(comision1);
        System.out.println(baseComision1);
        
        Empleado asalariado2 = new Asalariado(800, "Juan",
                "Gómez", "11111111A");
        Empleado porHoras2 = new PorHoras("Carolina", "Marín", 
                "22222222B", 16.75, 40);
        Empleado comision2 = new Comision("Marcos", "Guerra", "33333333C",
                10000, 0.06);
        Empleado baseComision2 = new BaseConComision("Roberto", "Jiménez",
                "44444444D", 5000, 0.04, 300);
        
        System.out.println("EMPLEADOS PROCESADOS CON POLIMORFISMO");
        System.out.println("-------------------------------------");
        System.out.println("");
        System.out.println(asalariado2);
        System.out.println(porHoras2);
        System.out.println(comision2);
        System.out.println(baseComision2);
        
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(asalariado2);
        empleados.add(porHoras2);
        empleados.add(comision2);
        empleados.add(baseComision2);
        
        for (int i = 0; i < empleados.size(); i++){
            Empleado empleado = empleados.get(i);
            System.out.println("Empleado" + i + " es del tipo: " 
                    +empleado.getClass().getName());
        }
    }
    
}

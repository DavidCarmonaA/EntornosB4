package tiposEmpleados;

/**
 * Clase encargada de crear el objeto del empleado que sea un asalariado, 
 * heredando características de la super clase abstracta y añadiendo las suyas
 * propias.
 * @author David
 */
public class Asalariado extends Empleado {
    
    private double salarioSemanal;
    
    /**
     * Constructor del empleado que sea asalariado, heredando el básico de empleado.
     * @param salarioSemanal Añado el salarioSemanal, double que contiene la
     * cantidad que gana por semana.
     * @param nombre Cadena que contiene el nombre del empleado.
     * @param apellido Cadena que contiene el apellido del empleado.
     * @param nif Cadena que contiene el NIF del empleado.
     */
    public Asalariado(double salarioSemanal,String nombre, String apellido, String nif) {
        super(nombre, apellido, nif);
        this.salarioSemanal = salarioSemanal;
        if (salarioSemanal < 0.0){
            throw new IllegalArgumentException("No puedes tener salario negativo.");
        }
    }

    /**
     * Setter del salarioSemanal.
     * @param salarioSemanal Double que contiene la cantidad que gana por semana.
     */
    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }

    /**
     * Getter del salarioSemanal.
     * @return Devuelve el double.
     */
    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    /**
     * Método que convierte a cadena el objeto, añadiendo los propios parámetros,
     * partiendo de la base del "toString" de la super clase.
     * @return Objeto convertido en cadena.
     */
    @Override
    public String toString() {
        return "Asalariado: " + super.toString() + "\n" + "Salario semanal: "
                + salarioSemanal + "€" + "\n" + "A pagar: " + ganancias() + "€" + "\n";
    }

    /**
     * Método que calcula las ganancias del empleado.
     * @return El double que contiene las ganancias.
     */
    @Override
    public double ganancias() {
        return salarioSemanal;
    }
    
}

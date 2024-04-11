package tiposEmpleados;

/**
 * Clase encargada de crear el objeto del empleado que sea un empleado que cobra 
 * por comisión más salario base, heredando características de la super clase 
 * abstracta y añadiendo las suyas propias.
 * @author David
 */
public class BaseConComision extends Comision{
    
    private double salarioBase;
    
    /**
     * Constructor del empleado que sea pagado por comisión más salario base, 
     * heredando el básico de empleado.
     * @param nombre Cadena que contiene el nombre del empleado.
     * @param apellido Cadena que contiene el apellido del empleado.
     * @param nif Cadena que contiene el NIF del empleado.
     * @param ventasBrutas Cantidad bruta de dinero conseguida por ventas.
     * @param porcentajeComision Comisión ganada por ventas.
     * @param salarioBase Salario base que gana el empleado.
     */
    public BaseConComision(String nombre, String apellido, String nif, double ventasBrutas, 
            double porcentajeComision, double salarioBase) {
        super(nombre, apellido, nif, ventasBrutas, porcentajeComision);
        this.salarioBase = salarioBase;
        if (salarioBase < 0.0){
            throw new IllegalArgumentException("No puedes tener salario negativo.");
        }
    }

    /**
     * Setter de salarioBase.
     * @param salarioBase Double que contiene el salario base del empleado.
     */
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    /**
     * Getter de salarioBase.
     * @return Devuelve el double.
     */
    public double getSalarioBase() {
        return salarioBase;
    }
    
    /**
     * Método que calcula las ganancias del empleado.
     * @return El double que contiene las ganancias.
     */
    @Override
    public double ganancias() {
        double salario = salarioBase * 1.1;
        salario = salario + super.ganancias();
        return salario;
    }

     /**
     * Método que convierte a cadena el objeto, añadiendo los propios parámetros,
     * partiendo de la base del "toString" de la super clase, en este caso, 
     * "comision".
     * @return Objeto convertido en cadena.
     */
    @Override
    public String toString() {
        return super.toString() + "Con salario base: " +salarioBase +
                "€\nNuevo salario base con 10% de incremento: " +salarioBase*1.1
                + "€\n";
    }
    
    
}

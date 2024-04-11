package tiposEmpleados;


/**
 * Clase encargada de crear el objeto del empleado que sea un empleado que cobra por comisión, 
 * heredando características de la super clase abstracta y añadiendo las suyas
 * propias.
 * @author David
 */
public class Comision extends Empleado{

    private double ventasBrutas;
    private double porcentajeComision;
    
    /**
     * Constructor del empleado que sea pagado por comisión, heredando el básico 
     * de empleado.
     * @param nombre Cadena que contiene el nombre del empleado.
     * @param apellido Cadena que contiene el apellido del empleado.
     * @param nif Cadena que contiene el NIF del empleado.
     * @param ventasBrutas Cantidad bruta de dinero conseguida por ventas.
     * @param porcentajeComision Comisión ganada por ventas.
     */
    public Comision(String nombre, String apellido, String nif, double ventasBrutas,
            double porcentajeComision) {
        super(nombre, apellido, nif);
        this.porcentajeComision = porcentajeComision;
        this.ventasBrutas = ventasBrutas;
        if (porcentajeComision < 0.0 || ventasBrutas < 0.0){
            throw new IllegalArgumentException("No puedes tener valores en negativo.");
        }
    }

    /**
     * Setter de ventasBrutas. 
     * @param ventasBrutas Double que contiene la cantidad de dinero ganada por
     * ventas.
     */
    public void setVentasBrutas(double ventasBrutas) {
        this.ventasBrutas = ventasBrutas;
    }

    /**
     * Getter de ventasBrutas.
     * @return Devuelve el double.
     */
    public double getVentasBrutas() {
        return ventasBrutas;
    }

    /**
     * Setter de porcentajeComision.
     * @param porcentajeComision Double que contiene el porcentaje de comisión
     * de las ventas.
     */
    public void setPorcentajeComision(double porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }

    /**
     * Getter de porcentajeComision.
     * @return Devuelve el double.
     */
    public double getPorcentajeComision() {
        return porcentajeComision;
    }

     /**
     * Método que convierte a cadena el objeto, añadiendo los propios parámetros,
     * partiendo de la base del "toString" de la super clase.
     * @return Objeto convertido en cadena.
     */
    @Override
    public String toString() {
        return "Empleado por comisión: " + super.toString() + "\n" + 
                "Ventas brutas: "
                + ventasBrutas + "€; % comisión: " +porcentajeComision + "\n" + "A pagar: " 
                + ganancias() + "€" + "\n";
    }

    /**
     * Método que calcula las ganancias del empleado.
     * @return El double que contiene las ganancias.
     */
    @Override
    public double ganancias() {
        double salario = ventasBrutas * porcentajeComision;
        return salario;
    }
    
    
    
}

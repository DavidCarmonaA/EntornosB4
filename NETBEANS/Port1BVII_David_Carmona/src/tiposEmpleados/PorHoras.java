package tiposEmpleados;

/**
 * Clase encargada de crear el objeto del empleado que sea un empleado que cobra por horas, 
 * heredando características de la super clase abstracta y añadiendo las suyas
 * propias.
 * @author David
 */
public class PorHoras extends Empleado{

    private double costeHora;
    private double horas;

    /**
     * Constructor del empleado que sea pagado por horas, heredando el básico 
     * de empleado.
     * @param nombre Cadena que contiene el nombre del empleado.
     * @param apellido Cadena que contiene el apellido del empleado.
     * @param nif Cadena que contiene el NIF del empleado.
     * @param costeHora Lo que cobra por hora el empleado.
     * @param hora Las horas que trabaja el empleado.
     */
    public PorHoras(String nombre, String apellido, String nif, double costeHora,
            double hora) {
        super(nombre, apellido, nif);
        this.costeHora = costeHora;
        this.horas = hora;
        if (horas < 0.0 || costeHora < 0.0){
            throw new IllegalArgumentException("No puedes tener valores en negativo.");
        }
    }

    /**
     * Setter de costeHora.
     * @param costeHora Double que contiene lo que gana por hora.
     */
    public void setCosteHora(double costeHora) {
        this.costeHora = costeHora;
    }

    /**
     * Getter de costeHora.
     * @return Devuelve el double.
     */
    public double getCosteHora() {
        return costeHora;
    }

    /**
     * Setter de horas.
     * @param horas Double que contiene las horas trabajadas.
     */
    public void setHoras(double horas) {
        this.horas = horas;
    }

    /**
     * Getter de horas.
     * @return Devuelve el double.
     */
    public double getHoras() {
        return horas;
    }

    /**
     * Método que convierte a cadena el objeto, añadiendo los propios parámetros,
     * partiendo de la base del "toString" de la super clase.
     * @return Objeto convertido en cadena.
     */
    @Override
    public String toString() {
        return "Empleado por horas: " + super.toString() + "\n" + "Salario por horas: "
                + costeHora + "€; Horas trabajadas: " +horas + "\n" + "A pagar: " 
                + ganancias() + "€" + "\n";
    }
    
    /**
     * Método que calcula las ganancias del empleado.
     * @return El double que contiene las ganancias.
     */
    @Override
    public double ganancias() {
        double salario = 0;
        if (horas <= 40){
            salario = horas * costeHora;
        }
        else if (horas > 40){
            double salarioNormal = 40 * costeHora;
            double salarioExtra = (horas-40)*(costeHora * 1.5);
            salario = salarioExtra + salarioNormal;
        }
        return salario;
    }
    
}

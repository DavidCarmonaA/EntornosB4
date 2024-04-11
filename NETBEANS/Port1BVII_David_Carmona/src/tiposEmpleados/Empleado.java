package tiposEmpleados;

/**
 * Super clase encargada de ser heredada, conteniendo los parámetros básicos de
 * cada empleado, así como sus métodos principales.
 * Será abstracta, ya que será la plantilla del resto de clases, y nunca usada
 * por sí sola.
 * @author David
 */
public abstract class Empleado {
    
    private String nombre;
    private String apellido;
    private String nif;

    /**
     * Creo el constructor básico del objeto empleado, con los parámetros básicos.
     * @param nombre Cadena que contiene el nombre del empleado.
     * @param apellido Cadena que contiene el apellido del empleado.
     * @param nif Cadena que contiene el NIF del empleado.
     */
    public Empleado(String nombre, String apellido, String nif) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nif = nif;
    }

    /**
     * Getter de la cadena "nombre".
     * @return Devuelve la cadena.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Getter de la cadena "apellido".
     * @return Devuelve la cadena.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Getter de la cadena "nif".
     * @return Devuelve la cadena.
     */
    public String getNif() {
        return nif;
    }
    
    /**
     * Base del método encargado de convertir el objeto en una cadena, será 
     * aplicada a los "toString" del resto de clases para aportar la estructura
     * básica.
     * @return Devuelve el objeto convertido a cadena.
     */
    @Override
    public String toString() {
        return nombre + " " +apellido + "\nN.I.F.: "+ nif;
    }
    
    /**
     * Método encargado de calcular el salario que gana cada empleado.
     * @return Devuelve un double cuya cantidad es el sueldo del empleado.
     */
    public abstract double ganancias();
    
}

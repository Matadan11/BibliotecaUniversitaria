public class Alumnos { 
	
    // Atributos de la clase Alumno
    private String nombre;
    private String apellido;
    private String domicilio;
    private String correo;
    private int cedula;

    // Constructor de la clase Alumno
    public Alumnos(String nombre, String apellido, String domicilio, String correo, int cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.correo = correo;
        this.cedula = cedula;
    }
    
    // Métodos getters y setters para cada atributo
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    // Método para mostrar la información del alumno
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Domicilio: " + domicilio);
        System.out.println("Correo: " + correo);
        System.out.println("Cedula: " + cedula);
        
    }
}

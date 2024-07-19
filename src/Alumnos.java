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
    public void mostrarInformacion(int cedulaId) {
        if (cedulaId != this.cedula){
            System.out.println("El usuario ha sido registrado con éxito");
        } else {
            System.out.println("El usuario ya existe");
        }
    }

    public boolean afirmacionEstudiante(int cedulaId){

        if (cedulaId == this.cedula){
            return false;
        } else {
            return true;
        }
    }

}

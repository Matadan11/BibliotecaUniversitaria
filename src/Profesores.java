public class Profesores {
    
    private String nombre;
    private String apellido;
    private String domicilio;
    private String email;
    private int cedula;

    public Profesores(String nombre, String apellido, String domicilio, String email, int cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.email = email;
        this.cedula = cedula;
    }

    public void mostrarInformacion() {
        System.out.println("El usuario ha sido registrado con éxito");
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void mostrarInformacion(int cedulaId) {
        if (cedulaId != this.cedula){
            System.out.println("El usuario ha sido registrado con éxito");
        } else {
            System.out.println("El usuario ya existe");
        }
    }

    public boolean afirmacionProfesor(int cedulaId){

        if (cedulaId == this.cedula){
            return false;
        } else {
            return true;
        }
    }
}

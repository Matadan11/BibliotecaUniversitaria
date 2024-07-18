
public class Cursos {

    
    private int idCurso;
    private String nombreCuros;
    private String descripcion;
    private int duracion;
    private double costo;
    private Profesores profesores;

    public Cursos(int idCurso, String nombreCuros, String descripcion, int duracion, double costo, Profesores profesores) {
        this.idCurso = idCurso;
        this.nombreCuros = nombreCuros;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.costo = costo;
        this.profesores = Profesores;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }


    public String getNombreCuros() {
        return nombreCuros;
    }

    public void setNombreCuros(String nombreCuros) {
        this.nombreCuros = nombreCuros;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void mostrarInformacion() {
        System.out.println("El curso ha sido registrado con éxito");
    }


}

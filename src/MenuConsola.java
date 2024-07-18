import java.util.Scanner;
 
public class MenuConsola {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {
            System.out.println("1. Registrar un usuario");
            System.out.println("2. Matricular un curso");
            System.out.println("3. Mostrar el pago de un curso");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = sn.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Cuenta para 1.Alumno o 2.Profesor");
                    int cuenta = sn.nextInt();

                    if (cuenta == 1) {

                        System.out.println("Nombre del alumno: ");
                        String nombre = sn.next();

                        System.out.println("Apellido del alumno: ");
                        String apellido = sn.next();

                        System.out.println("Domicilio del alumno: ");
                        String domicilio = sn.next();

                        System.out.println("Correo del alumno: ");
                        String correo = sn.next();

                        System.out.println("Cedula del alumno: ");
                        int cedula = sn.nextInt();

                        Alumnos alumno = new Alumnos(nombre, apellido, domicilio, correo, cedula);
                        alumno.mostrarInformacion();

                    } else if (cuenta == 2) {

                        System.out.println("Nombre del profesor: ");
                        String nombre = sn.next();

                        System.out.println("Apellido del profesor: ");
                        String apellido = sn.next();

                        System.out.println("Domicilio del profesor: ");
                        String domicilio = sn.next();

                        System.out.println("Email del profesor: ");
                        String email = sn.next();

                        System.out.println("Cedula del profesor: ");
                        String cedula = sn.next();

                        Profesores profesor = new Profesores(nombre, apellido, domicilio, email, cedula);

                    } else {
                        System.out.println("Opción no válida. Inténtalo de nuevo.");
                    }
                    break;

                case 2:
                    
                    System.out.println("Ingrese el ID del estudiante:");
                    String estudianteId = sn.nextLine();
                    
                    // Simulación de la verificación del estudiante
                    // Deberías reemplazar esto con tu lógica para verificar si el estudiante existe
                    boolean estudianteExiste = afirmacionesEstudiante(estudianteId);
                    
                    if (!estudianteExiste) {
                        System.out.println("El estudiante no existe.");
                        break;
                    }
                    
                    System.out.println("Ingrese el código del curso a matricular:");
                    String cursoCodigo = sn.nextLine();
                    
                    // Simulación de la verificación del curso
                    // Deberías reemplazar esto con tu lógica para verificar si el curso existe
                    boolean cursoExiste = verificarCurso(cursoCodigo);
                    
                    if (!cursoExiste) {
                        System.out.println("El curso no existe.");
                        break;
                    }
                    
                    // Simulación de la verificación de la matrícula del estudiante en el curso
                    // Deberías reemplazar esto con tu lógica para verificar si el estudiante ya está matriculado en el curso
                    boolean yaMatriculado = verificarMatricula(estudianteId, cursoCodigo);
                    
                    if (yaMatriculado) {
                        System.out.println("El estudiante ya está matriculado en este curso.");
                        break;
                    }
                    
                    // Simulación de la matrícula del estudiante en el curso
                    // Deberías reemplazar esto con tu lógica para matricular al estudiante en el curso
                    matricularEstudiante(estudianteId, cursoCodigo);
                    
                    System.out.println("Estudiante matriculado con éxito en el curso.");
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }
    }
}

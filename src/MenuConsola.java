import java.util.Scanner;
 
public class MenuConsola {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        String nombre = "";
        String apellido = "";
        String domicilio = "";
        String correo = "";
        int cedula = 0;


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
                        nombre = sn.next();

                        System.out.println("Apellido del alumno: ");
                        apellido = sn.next();

                        System.out.println("Domicilio del alumno: ");
                        domicilio = sn.next();

                        System.out.println("Correo del alumno: ");
                        correo = sn.next();

                        System.out.println("Cedula del alumno: ");
                        cedula = sn.nextInt();

                        Alumnos alumno = new Alumnos(nombre, apellido, domicilio, correo, cedula);
                        alumno.mostrarInformacion(cedula);

                    } else if (cuenta == 2) {

                        System.out.println("Nombre del profesor: ");
                        nombre = sn.next();

                        System.out.println("Apellido del profesor: ");
                        apellido = sn.next();

                        System.out.println("Domicilio del profesor: ");
                        domicilio = sn.next();

                        System.out.println("Email del profesor: ");
                        correo = sn.next();

                        System.out.println("Cedula del profesor: ");
                        cedula = sn.nextInt();

                        Profesores profesor = new Profesores(nombre, apellido, domicilio, correo, cedula);
                        profesor.mostrarInformacion(cedula);

                    } else {
                        System.out.println("Opción no válida. Inténtalo de nuevo.");
                    }
                    break;

                case 2:
                    
                    System.out.println("Ingrese el ID del estudiante:");
                    int estudianteId = sn.nextInt();
                    Alumnos alumno = new Alumnos(nombre, apellido, domicilio, correo, estudianteId);
                    boolean estudianteExiste = alumno.afirmacionEstudiante(estudianteId);
                    
                    if (estudianteExiste) {
                        System.out.println("Bienvenido de vuelta " + nombre);
                        System.out.println("¿Desea matricularse en un curso?" + "\n" + "1. Si" + "\n" + "2. No");
                        int matricular = sn.nextInt();
                        
                        if (matricular == 1) {

                            System.out.println("Los cursos disponibles son:");
                            System.out.println("1. Curso de Matemáticas");
                            System.out.println("2. Curso de Física");
                            System.out.println("3. Curso de Química");
                            System.out.println("Ingrese el numero del curso a matricular:");
                            int cursoCodigo = sn.nextInt();
                            System.out.println("El alumno " + nombre + " " + apellido + " se ha matriculado en el curso " + cursoCodigo);

                        } else {
                            System.out.println("Gracias por visitarnos");
                            break;
                        }

                        break;
                    }

                    if (!estudianteExiste) {
                        System.out.println("El estudiante no existe.");
                        break;
                    }
                    System.out.println("Estudiante matriculado con éxito en el curso.");
                    break;
                case 3:
                    System.out.println("Ingrese el ID del Profesor:");
                    int profesorId = sn.nextInt();
                    Profesores profesor = new Profesores(nombre, apellido, domicilio, correo, profesorId);
                    boolean profesorExiste = profesor.afirmacionProfesor(profesorId);

                    if (profesorExiste) {
                        System.out.println("Bienvenido de vuelta " + nombre);
                        System.out.println("¿Desea ver el pago de un curso?" + "\n" + "1. Si" + "\n" + "2. No");
                        int pago = sn.nextInt();
                        
                        if (pago == 1) {
                            System.out.println("Ingrese el ID del curso:");
                            int cursoId = sn.nextInt();
                            System.out.println("El curso " + cursoId + " ha sido pagado.");
                        } else {
                            System.out.println("Gracias por visitarnos");
                            break;
                        }
                        break;
                    }

                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");

                    
            }
        }
    }
}

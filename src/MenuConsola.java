import java.util.Scanner;
 
public class MenuConsola {

    private Alumnos _Alumnos;
    private Profesores _Profesores;

    public MenuConsola(Alumnos alumnos, Profesores profesores) {
        _Alumnos = alumnos;
        _Profesores = profesores;
    }
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

                        System.out.println("Edad del profesor: ");
                        int edad = sn.nextInt();

                        System.out.println("Salario del profesor: ");
                        double salario = sn.nextDouble();
                        
                        Profesores profesor = new Profesores(nombre, edad, salario);
                        profesor.mostrarInformacion();

                    } else {
                        System.out.println("Opción no válida. Inténtalo de nuevo.");
                    }

                    break;
                case 2:
                    System.out.println("Has elegido la opción 2.");
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

import java.util.Scanner;

class obj2{
        private static Object oDatos[][];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de registros a almacenar: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();
        oDatos = new Object[cantidad][6];

        boolean ejecutando = true;
        while (ejecutando) {
            System.out.println("\nCRUD de Personas");
            System.out.println("1. Ingresar");
            System.out.println("2. Modificar");
            System.out.println("3. Eliminar");
            System.out.println("4. Buscar");
            System.out.println("5. Leer");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 1) {
                System.out.println("\nSubmenú: Ingresar Registro");
                for (int i = 0; i < oDatos.length; i++) {
                    if (oDatos[i][0] == null) {
                        System.out.print("ID: ");
                        oDatos[i][0] = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Nombre: ");
                        oDatos[i][1] = scanner.nextLine();
                        System.out.print("Apellido: ");
                        oDatos[i][2] = scanner.nextLine();
                        System.out.print("Edad: ");
                        oDatos[i][3] = scanner.nextInt();
                        System.out.print("Género (M/F): ");
                        oDatos[i][4] = scanner.next().charAt(0);
                        System.out.print("Altura (cm): ");
                        oDatos[i][5] = scanner.nextInt();
                        System.out.println("Registro agregado correctamente.");
                        break;
                    }
                }
            } else if (opcion == 2) {
                System.out.println("\nSubmenú: Modificar Registro");
                System.out.print("Ingrese el ID a modificar: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                for (Object[] persona : oDatos) {
                    if (persona[0] != null && (int) persona[0] == id) {
                        System.out.print("Nuevo Nombre: ");
                        persona[1] = scanner.nextLine();
                        System.out.print("Nuevo Apellido: ");
                        persona[2] = scanner.nextLine();
                        System.out.print("Nueva Edad: ");
                        persona[3] = scanner.nextInt();
                        System.out.print("Nuevo Género (M/F): ");
                        persona[4] = scanner.next().charAt(0);
                        System.out.print("Nueva Altura (cm): ");
                        persona[5] = scanner.nextInt();
                        System.out.println("Registro modificado correctamente.");
                        break;
                    }
                }
            } else if (opcion == 3) {
                System.out.println("\nSubmenú: Eliminar Registro");
                System.out.print("Ingrese el ID a eliminar: ");
                int id = scanner.nextInt();
                for (int i = 0; i < oDatos.length; i++) {
                    if (oDatos[i][0] != null && (int) oDatos[i][0] == id) {
                        oDatos[i] = new Object[6];
                        System.out.println("Registro eliminado.");
                        break;
                    }
                }
            } else if (opcion == 4) {
                System.out.println("\nSubmenú: Buscar Registro");
                System.out.print("Ingrese el ID a buscar: ");
                int id = scanner.nextInt();
                for (Object[] persona : oDatos) {
                    if (persona[0] != null && (int) persona[0] == id) {
                        System.out.println("ID: " + persona[0] + ", Nombre: " + persona[1] + ", Apellido: " + persona[2] + ", Edad: " + persona[3] + ", Género: " + persona[4] + ", Altura: " + persona[5]);
                        break;
                    }
                }
            } else if (opcion == 5) {
                System.out.println("\nSubmenú: Leer Todos los Registros");
                for (Object[] persona : oDatos) {
                    if (persona[0] != null) {
                        System.out.println("ID: " + persona[0] + ", Nombre: " + persona[1] + ", Apellido: " + persona[2] + ", Edad: " + persona[3] + ", Género: " + persona[4] + ", Altura: " + persona[5]);
                    }
                }
            } else if (opcion == 6) {
                ejecutando = false;
                System.out.println("Saliendo...");
            } else {
                System.out.println("Opción no válida.");
            }
        }
        scanner.close();
    }
}

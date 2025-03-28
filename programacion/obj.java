import java.util.Scanner;

class obj{
    private static Object oDatos[][] = {
        {0001, "Ana", "Pendeja", 'F', 22, 50}
    };
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ejecutando = true;

        while (ejecutando) {
            System.out.println("\nCRUD de Personas");
            System.out.println("1. Crear");
            System.out.println("2. Leer");
            System.out.println("3. Actualizar");
            System.out.println("4. Eliminar");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 1) {
                System.out.print("ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Nombre: ");
                String nombre = scanner.nextLine();
                System.out.print("Apellido: ");
                String apellido = scanner.nextLine();
                System.out.print("Género (M/F): ");
                char genero = scanner.next().charAt(0);
                System.out.print("Edad: ");
                int edad = scanner.nextInt();
                System.out.print("Peso: ");
                int peso = scanner.nextInt();

                Object[][] nuevoDatos = new Object[oDatos.length + 1][6];
                System.arraycopy(oDatos, 0, nuevoDatos, 0, oDatos.length);
                nuevoDatos[oDatos.length] = new Object[]{id, nombre, apellido, genero, edad, peso};
                oDatos = nuevoDatos;
                System.out.println("Persona agregada correctamente.");
            } else if (opcion == 2) {
                System.out.println("Lista de Personas:");
                for (Object[] persona : oDatos) {
                    System.out.println("ID: " + persona[0] + ", Nombre: " + persona[1] + ", Apellido: " + persona[2] + ", Género: " + persona[3] + ", Edad: " + persona[4] + ", Peso: " + persona[5]);
                }
            } else if (opcion == 3) {
                System.out.print("Ingrese el ID de la persona a actualizar: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                for (Object[] persona : oDatos) {
                    if ((int) persona[0] == id) {
                        System.out.print("Nuevo nombre: ");
                        persona[1] = scanner.nextLine();
                        System.out.print("Nuevo apellido: ");
                        persona[2] = scanner.nextLine();
                        System.out.print("Nuevo género (M/F): ");
                        persona[3] = scanner.next().charAt(0);
                        System.out.print("Nueva edad: ");
                        persona[4] = scanner.nextInt();
                        System.out.print("Nuevo peso: ");
                        persona[5] = scanner.nextInt();
                        System.out.println("Persona actualizada.");
                        break;
                    }
                }
            } else if (opcion == 4) {
                System.out.print("Ingrese el ID de la persona a eliminar: ");
                int id = scanner.nextInt();
                int index = -1;
                for (int i = 0; i < oDatos.length; i++) {
                    if ((int) oDatos[i][0] == id) {
                        index = i;
                        break;
                    }
                }
                if (index != -1) {
                    Object[][] nuevoDatos = new Object[oDatos.length - 1][6];
                    for (int i = 0, j = 0; i < oDatos.length; i++) {
                        if (i != index) {
                            nuevoDatos[j++] = oDatos[i];
                        }
                    }
                    oDatos = nuevoDatos;
                    System.out.println("Persona eliminada.");
                } else {
                    System.out.println("ID no encontrado.");
                }
            } else if (opcion == 5) {
                ejecutando = false;
                System.out.println("Saliendo...");
            } else {
                System.out.println("Opción no válida.");
            }
        }
        scanner.close();
    }
}
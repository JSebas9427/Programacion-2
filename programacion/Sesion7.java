package programacion;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
/**
*
* @author estudiante104
*/
public class Sesion7 {
    private static String[] sCabecera ={"id", "Nombre", "Apellido", "Genero",
        "Edad", "Peso"};
    private static Object oDatos[][] = {
        {0001, "Ana", "Pendeja", 'F', 22, 50},
        {0002, "Lupita", "ay", 'F', 20, 60},
        {0003, "Nicol", "Villegas", 'M', 19, 55}
    };
 
    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < oDatos.length; i++) {
            for (int j = 0; j < oDatos.length; j++) {
                System.out.print(" | "+oDatos[i][j]);
            }
            System.out.println("|\n");
        }
//        System.out.print("Ingrese la cadena a convertir: ");
//        String cad = leer.readLine();

 
    }
 
    
}
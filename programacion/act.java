package programacion;

import java.util.Scanner;

public class act {
    private static Scanner leer = new Scanner(System.in);
    public static int nRec, nFilas, nCols;
    public static int[][] nNumx = new int[3][4];
    private static int nNums[][];
    public static String[]sCabecera = {"Id", "Nom", "Ape", "Gen", "Edad", "Peso"};
    private static Object oDatos[][]={
        {1023, "Ana", "Abello", "F", 17, 69},
        {1125, "Victor", "Zapata", "M", 11, 59},
        {1294, "Ancho", "Mendoza", "M", 29, 70}
    };

    public static void main(String[] args) {
        System.out.println("-----------------------------");
        System.out.println("Longitud Mat nNumx:");
        System.out.println("-----------------------------");
        System.out.println("\nDigite Filas: ");
        int nFils = leer.nextInt();
        System.out.println("\nDigite cols: ");
        int nCols = leer.nextInt();
        nNums = new int [nFils][nCols];
        System.out.println("Longitud Mat nNums: " + nNums.length);
        System.out.println("-----------------------------");
        
        for(nFilas = 0; nFilas < oDatos.length; nFilas++ ){
            for(nCols = 0; nCols < oDatos[nFilas].length; nCols++){
                System.out.println(oDatos[nFilas][nCols]);
            }
        }
        
        System.out.println("Longitud Mat oDatos[" +nFilas+ " x "+nCols + "]" );

    }
}
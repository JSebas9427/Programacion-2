package parcial2;

import java.util.ArrayList;
import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner cLea = new Scanner(System.in); 
        Scanner mod = new Scanner(System.in);
        
        String[][] oPalabra = {
                { "Hola12@", "Porfin#" },
                { "Prueba$", "MAYUSC%" }
        };
        ArrayList<Character> Consonantes = new ArrayList<>();
        ArrayList<Character> Vocales = new ArrayList<>();
        ArrayList<Character> Numeros = new ArrayList<>();
        ArrayList<Character> Comodines = new ArrayList<>();
        ArrayList<String> Eliminadas = new ArrayList<>();
        
        char OpcionP;
        do{
            System.out.println("---Menu principal---");
            System.out.println("A) Mostrar datos");
            System.out.println("B) Modificar Palabra");
            System.out.println("C) Eliminar");
            System.out.println("E) Mostrar palabras");
            System.out.println("D) Salir");
            OpcionP = cLea.nextLine().charAt(0);

            if (OpcionP =='A' || OpcionP == 'a') {

                char oChar[][][] = new char[2][2][];
                for (int i = 0; i < oPalabra.length; i++) {
                    for (int j = 0; j < oPalabra[i].length; j++){
                        oChar[i][j] = oPalabra[i][j].toCharArray();
                       
                    }
                }

        
                for (int i = 0; i < oChar.length; i++) {
                    for (int j = 0; j < oChar[i].length; j++) {
                    
                    for(char c : oChar[i][j]){
                        int ascii = (int) c;
                        if (c == 'a'||c == 'e' || c == 'i'||c == 'o' ||c == 'u' ||
                                    c == 'A'||c == 'E'||c == 'I'||c == 'O'||c == 'U') {
                            Vocales.add(c);
                        }else if ((ascii > 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122)) {
                            Consonantes.add(c);
                        }else if(ascii >= 48 && ascii <= 57){
                            Numeros.add(c);
                        }else{
                            Comodines.add(c);
                        }
                    }
                  
                    }
                }
                
                char opcionA; 
                do {
                    System.out.println("---Mostrar datos---");
                    System.out.println("A) Mostrar comodines");
                    System.out.println("B) Mostrar numeros");
                    System.out.println("C) Mostrar vocales");
                    System.out.println("D) Mostrar consonantes");
                    System.out.println("Q) Salir");
                    opcionA = cLea.nextLine().charAt(0);
                    if (opcionA == 'A' || opcionA =='a') {
                        System.out.println("---Comodines---");
                        System.out.println(Comodines);
                    }else if(opcionA =='B' || opcionA == 'b'){
                        System.out.println("---Numeros---");
                        System.out.println(Numeros);
                    }else if(opcionA =='C' || opcionA =='c'){
                        System.out.println("---Vocales---");
                        System.out.println(Vocales);
                    }else if(opcionA == 'D' || opcionA=='d'){
                        System.out.println("---Consonantes---");
                        System.out.println(Consonantes);
                    }else{
                        System.out.println("Ingrese una opcion valida!!!");
                    }
                } while (opcionA != 'Q' && opcionA != 'q');
            }
            
            if (OpcionP == 'B' || OpcionP =='b') {
                char opcionB;
                do {
                   
                System.out.println("---Modificar---");
                System.out.println("A) Palabra");
                System.out.println("B) Letra");// FALTA
                System.out.println("D) Salir");
                opcionB = cLea.nextLine().charAt(0);
                int pos1, pos2;
                String oModificar;
                    if (opcionB == 'A' || opcionB == 'a') {
                        
                        System.out.println("Indique la posición de la palabra a"
                                + "modificar");
                        pos1 = cLea.nextInt();
                        pos2 = cLea.nextInt();
                        System.out.println("Indique la palabra modificada:");
                        oModificar = mod.nextLine();
                        cLea.nextLine();
                        oPalabra[pos1][pos2] = oModificar;
                        System.out.println("Modificada: "+oPalabra[pos1][pos2]);
                        
                    } else if (opcionB == 'B' || opcionB == 'b') {
                        System.out.println("Indique la posición de la palabra donde quiere modificar una letra:");
                        pos1 = cLea.nextInt();
                        pos2 = cLea.nextInt();
                        cLea.nextLine(); // Limpiar el buffer

                        System.out.println("Palabra actual: " + oPalabra[pos1][pos2]);
                        System.out.println("Indique la posición del carácter que quiere modificar:");
                        int indexChar = cLea.nextInt();
                        cLea.nextLine(); // Limpiar el buffer

                        System.out.println("Indique el nuevo carácter:");
                        char nuevoChar = cLea.nextLine().charAt(0);

                        char[] caracteres = oPalabra[pos1][pos2].toCharArray();
                        if (indexChar >= 0 && indexChar < caracteres.length) {
                            caracteres[indexChar] = nuevoChar;
                            oPalabra[pos1][pos2] = new String(caracteres);
                            System.out.println("Palabra modificada: " + oPalabra[pos1][pos2]);
                        } else {
                            System.out.println("Índice fuera de rango!");
                        }
                    }
                } while (opcionB != 'D' && opcionB != 'd');        
            }
            if(OpcionP == 'C' || OpcionP == 'c'){
                char opcionC;
                int posF1, posF2;
                do{
                System.out.println("Eliminar");
                System.out.println("A) Palabra");
                System.out.println("B) Letra"); //FALTAAAAAA
                System.out.println("C) Mostrar Eliminadas");
                System.out.println("D) Salir");
                opcionC = cLea.nextLine().charAt(0);
                
                if(opcionC == 'A' || opcionC == 'a'){
                    System.out.println("Indique la posicion de la palabra a eliminar");
                    posF1 = cLea.nextInt();
                    posF2 = cLea.nextInt();
                    Eliminadas.add(oPalabra[posF1][posF2]);
                    oPalabra[posF1][posF2] = "";
                                            cLea.nextLine();

                    } else if (opcionC == 'B' || opcionC == 'b') {
                        System.out.println("Indique la posición de la palabra donde quiere eliminar una letra:");
                        posF1 = cLea.nextInt();
                        posF2 = cLea.nextInt();
                        cLea.nextLine(); // Limpiar el buffer

                        System.out.println("Palabra actual: " + oPalabra[posF1][posF2]);
                        System.out.println("Indique la posición del carácter que quiere eliminar:");
                        int indexEliminar = cLea.nextInt();
                        cLea.nextLine(); // Limpiar el buffer

                        char[] caracteres = oPalabra[posF1][posF2].toCharArray();
                        if (indexEliminar >= 0 && indexEliminar < caracteres.length) {
                            String nuevaPalabra = "";
                            for (int i = 0; i < caracteres.length; i++) {
                                if (i != indexEliminar) {
                                    nuevaPalabra += caracteres[i];
                                }
                            }
                            Eliminadas.add(String.valueOf(caracteres[indexEliminar])); // Guardamos solo el caracter eliminado
                            oPalabra[posF1][posF2] = nuevaPalabra;
                            System.out.println("Palabra después de eliminar: " + oPalabra[posF1][posF2]);
                        } else {
                            System.out.println("Índice fuera de rango!");
                        }
                    }          
                if(opcionC == 'C'|| opcionC == 'c'){
                    System.out.println("Eliminadas: ");
                    System.out.println(Eliminadas);
                }
                
                }while(opcionC != 'D' && opcionC !='d');
            }
            if(OpcionP == 'E' || OpcionP == 'e'){
                System.out.println("Palabras: ");
                for (int i = 0; i < oPalabra.length; i++) {
                    for (int j = 0; j < oPalabra[i].length; j++) {
                        System.out.println(oPalabra[i][j]);
                    }
                }
            }

        }while(OpcionP != 'D' && OpcionP != 'd');
    }
}
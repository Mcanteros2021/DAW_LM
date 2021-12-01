import java.util.Arrays;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] palabras = new String[8];
        String[]palabrasord = new String[9];
        int contador = 0;

        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Mete una palabra");
            palabras[i] = sc.nextLine();
        }
        for (int i = 0; i < palabras.length; i++) {
            if(palabras[i].equals("azul") || palabras[i].equals("verde") || palabras[i].equals("rojo") || palabras[i].equals("amarillo")|| palabras[i].equals("negro")){
                palabrasord[contador] = palabras[i];
                contador++;
            }
        }




        System.out.println(Arrays.toString(palabrasord));

        }
    }


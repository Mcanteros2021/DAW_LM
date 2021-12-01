import java.util.Arrays;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mesa = new int[2][10];
        int personas = 0;

        for (int i = 0; i < mesa.length; i++) {
            if (i == 0){
                for (int j = 0; j < 10; j++) {
                    mesa[i][j] = j + 1;
                }
            }else {
                for (int j = 0; j < mesa[i].length; j++) {
                    mesa[i][j] =  (int)(Math.random()*5);
                }
            }
        }

        System.out.println("¿ Cuantos son ?");

        personas = sc.nextInt();


            for (int j = 0; j < mesa[1].length ; j++) {
                if(personas - mesa[1][j] == 0 ){
                    System.out.println("Hay hueco en la mesa "+mesa[1][j]);
                    break;
                }


        }


    }
}

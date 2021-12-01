import java.util.Arrays;
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] si = new int[100];
        String opcion = "";



        for (int i = 0; i < si.length ; i++) {
            si[i] = (int)(Math.random()*500 + 1);
        }
        System.out.println("Quiere saber el max o el min");
        opcion = sc.nextLine();

        if(opcion.equals("max")){
            Arrays.sort(si);
            for (int i = 0; i < si.length; i++) {
                if(i == 0){
                    System.out.print("**"+si[0]+"** ");
                }
                else {
                    System.out.print(si[i]+" ");
                }
            }


        } else {
            Arrays.sort(si);
            for (int i = 0; i < si.length; i++) {
                if(i == 99){
                    System.out.print(" **"+si[99]+"**");
                } else {
                    System.out.print(si[i]+" ");
                }

            }
        }
    }
}

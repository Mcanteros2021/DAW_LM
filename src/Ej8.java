import java.util.Arrays;

public class Ej8 {
    public static void main(String[] args) {

    }
    public static boolean esta(int[]x,int num){
        boolean a = true;
        for (int i = 0; i < x.length; i++) {
            if(x[i] == num){
                a = false;
            }
        }
     return  a ;
    }

    public static int[]unirSinRepetidos(int v1[],int v2[]){

        int[] v3 = new int[0];

        for (int i = 0; i < v1.length; i++) {
                if(esta(v3,v1[i])){
                    v3 = Arrays.copyOf(v3, v3.length + 1);
                    v3[v3.length - 1] = v1[i] ;
                }
            }
        for (int i = 0; i < v2.length; i++) {
                if(esta(v3,v2[i])){
                    v3 = Arrays.copyOf(v3, v3.length + 1);
                    v3[v3.length - 1] = v2[i];
                }
            }
        return v3;
        }







    }


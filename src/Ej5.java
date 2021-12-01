import java.util.Arrays;

public class Ej5 {
    public static void main(String[] args) {

        int a[]= {5,3,2,1};
        int b[]={3,2,1,2,3};


        System.out.println(Arrays.toString(mezclador(a,b)));
    }
    public static int[] mezclador(int[]a,int[]b){

        int[] resultado = new int[a.length + b.length];
        int cont = 0;
        int cont2 = 0;

        for (int i = 0; i < resultado.length; i++) {
            if(i%2 == 0 && a.length > cont ){
                resultado[i] = a[cont];
                cont++;
            }else if(i%2 != 0 && b.length > cont2) {
                resultado[i] = b[cont2];
                cont2++;
            }

        }
        return resultado;



    }

}

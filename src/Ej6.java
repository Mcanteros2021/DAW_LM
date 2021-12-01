import java.util.Arrays;

public class Ej6 {
    public static void main(String[] args) {
        int cont = 0;
        int[][] jeje = new int[7][5];

        for (int i = 0; i < jeje.length; i++) {
            for (int j = 0; j < jeje[i].length; j++) {
                jeje[i][j] = cont;
                cont++;
            }
        }

        for (int[] x: jeje) {
            System.out.println(Arrays.toString(x));
        }
        
        System.out.println(Arrays.toString(corteza(jeje)));
    }
    public static int[] corteza(int[][]siuuu){

        int[] a = new int[0];

        for (int i = 0; i < siuuu[0].length; i++) {
                a = Arrays.copyOf(a,a.length + 1);
                a[i] = siuuu[0][i];

        }
        for (int i = 1; i < siuuu.length  ; i++) {
            a = Arrays.copyOf(a,a.length + 1);
            a[a.length - 1] = siuuu[i][siuuu[i].length - 1];
        }

        for (int i = siuuu[0].length - 1; i >= 0; i--) {
            a = Arrays.copyOf(a,a.length + 1);
            a[a.length - 1] = siuuu[siuuu.length - 1][i];
        }
        for (int i = siuuu.length - 3; i > 0; i--) {
            a = Arrays.copyOf(a,a.length + 1);
            a[a.length - 1] = siuuu[i][0];
        }

        return a;
    }
}

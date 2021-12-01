import java.util.Arrays;

public class EjercicioMañanaROJO3 {
    public static void main(String[] args) {
        String[] paises = {"España", "Rusia", "Japón","Australia"};
        int [][] alturas = new int[4][10];
        int[][] medMaxMin = new int[4][3];
        int media = 0;
        int max = 0;
        int min = 0;

        for (int i = 0; i < alturas.length; i++) {
            for (int j = 0; j < alturas[i].length; j++) {
                alturas[i][j] = (int)(Math.random()*110+100);
            }
        }


        for (int i = 0; i < alturas.length; i++) {
            media = 0;
            max = 0;
            min = 0;
            for (int j = 0; j < alturas[i].length; j++) {
                media = alturas[i][j] + media;
                if(max < alturas[i][j]){
                    max = alturas[i][j];
                }
                if(min > alturas[i][j]){
                    min = alturas[i][j];
                }
            }
            medMaxMin[i][0] = media/10;
            medMaxMin[i][1] = max;
            medMaxMin[i][2] = min;
        }

        for (int i = 0; i < alturas.length; i++) {
            System.out.println(paises[i]+":"+Arrays.toString(alturas[i])+"|"+Arrays.toString(medMaxMin[i]));
        }





    }
}

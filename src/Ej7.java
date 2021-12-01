import java.util.Arrays;

public class Ej7 {
    public static void main(String[] args) {
        int[][] tabla = new int[5][9];
        int random = 0;
        int mayor = 0;
        int x = 0;
        int y = 0;

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                boolean jaja = true;
                do{

                    random = (int)((Math.random()*901)+100);
                    if(!repetido(tabla,random,i,j)){
                        tabla[i][j] = random;
                        jaja = false;
                    }

                }while(jaja);

            }
        }

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length ; j++) {
                if(tabla[i][j] > tabla[x][y]){
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println("El mayor es "+tabla[x][y]+" en la posicion "+x+","+y);


    }
    public static boolean repetido(int tabla[][],int random,int x, int y){

        boolean repetido = false;

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if(random == tabla[x][y]){
                    repetido = true;
                    break;
                }
            }
        }
        return repetido;
    }
}

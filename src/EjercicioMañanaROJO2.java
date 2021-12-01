public class EjercicioMañanaROJO2 {
    public static void main(String[] args) {
        int[]si = {5,4,7,8,10};



        System.out.println(convierteArrayEnString(si));

    }
    public static String convierteArrayEnString(int[] a){
        String b = "";

        for (int i = 0; i < a.length; i++) {
            if (i != a.length - 1){
                b = b+a[i]+",";
            } else{
                b = b+a[i];
            }

        }

        return b;
    }
}

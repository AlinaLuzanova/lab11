import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Number 1: ");
        short[] e = new short[8];
        for (int i = 0; i < 8; i++) {
            e[i] = (short) (16 - (2 * i + 1));
            System.out.println(e[i]);

        }
        System.out.println("Number 2: ");
        float[] x = new float[13];
        int a = 24;
        int b = -10;
        for (int j = 0; j < 12; j++) {
            x[j] = (float) (Math.random() * a + b);
            System.out.println(x[j]);
        }
        System.out.println("Number 3: ");

        float[][] d = new float[8][13];
        for (int i = 0; i < d.length; i++) {
            if (e[i] == 13) {
                for (int j = 0; j < d[i].length; j++) {
                    d[i][j] = 2 * (float) Math.tan(x[j]) * (float) Math.sin(x[j]);
                }
            } else if (e[i] == 1 || e[i] == 3 || e[i] == 5 || e[i] == 7) {
                for (int j = 0; j < d[i].length; j++) {
                    d[i][j] = (int) Math.exp((float) Math.tan(Math.exp(x[j])));
                }


            } else
                for (int j = 0; j < d[i].length; j++) {
                        d[i][j] = (int) Math.cos((2 / 3 / (int) Math.asin((x[j] + 2) / 24) / 2) ^ ((int) (Math.PI * (Math.cos(x[j]) + 1 / 4)) ^ 2));
                    }


                }
       /*
       for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                System.out.println(d[i][j]);
            }
        }

        */
            for (int u = 0; u < d.length; u++) {
                System.out.println(Arrays.toString(d[u]));
            }
        }
    }

/*switch (e[i]){
        case 1 : e[i] = 13;

            d[i][j] = 2 * (int) Math.tan(x[j]) * (int) Math.sin(x[j]);
        case 2 :
            break;
    }  System.out.println(d[i][j]);


 */

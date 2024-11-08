package october.ex_24102024;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {
     int[][] a = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println(a[0].length);
        System.out.println(a[1].length);
        System.out.println(a[2].length);
        System.out.println(a[0][0]);
        System.out.println(a[0][1]);
        System.out.println(a[0][2]);



        System.out.println(Arrays.toString(a));

        for (int[] PrintValues : a) {

            System.out.println(Arrays.toString(PrintValues));


            int[][] b = {{12,23,34},{1,2,3},{5,6,7},{6,7,8}};

            for (int[] c : b) {

                System.out.println(Arrays.toString(c));
            }


        }

        /*for (int i =0;i<a.length;i++) {

            for(int j=0; j<a[i].length;j++) {

                System.out.println(a[i][j]);
            }
            System.out.println();
        }
*/


    }
}

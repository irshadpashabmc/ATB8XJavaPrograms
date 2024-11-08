package october.ex_24102024;

import java.util.Arrays;

public class ArrayPracticetwo {

    public static void main(String[] args) {

        int[][][] AR = new int[4][4][2];

        AR[0][0] = new int[]{1};
        AR[0][1] = new int[]{2};
        AR[0][2] = new int[]{3};
        AR[0][3] = new int[]{4};
        AR[1][0] = new int[]{5};
        AR[1][1] = new int[]{6};
        AR[1][2] = new int[]{7};
        AR[1][3] = new int[]{8};
        AR[2][0] = new int[]{9};
        AR[2][1] = new int[]{10};


        System.out.println(Arrays.toString(new int[]{AR[1][0][0]}));

        System.out.println(Arrays.toString(AR[0][0]));
        System.out.println(Arrays.toString(AR[0]));

        System.out.println(Arrays.toString(AR[1]));

        System.out.println(Arrays.toString(AR[2]));


    }

}

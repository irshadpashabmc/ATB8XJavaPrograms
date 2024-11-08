package october.ex_24102024;

public class ArrayPracticethree {

    public static void main(String[] args) {

        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println(a[0].length);
        System.out.println(a[1].length);
        System.out.println(a[2].length);
        System.out.println(a[1][0]);

        for(int i = 0; i<a.length; i++) {

            for(int j=0;j<a[i].length;j++) {

                System.out.println(a[i][j]);
            }
            System.out.println();
        }

    }
}

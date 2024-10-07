package october.ex_06102024;

public class Prime_number_example {

    public static void main(String[] args) {


        for (int i = 2;i<=100;i++) {

            int count =0;

            for(int num =i;num>=1;num--) {

                if (i % num == 0) {

                    count++;
                }
            }
                if (count ==2) {

                    System.out.println(i);
                }

        }

    }
}

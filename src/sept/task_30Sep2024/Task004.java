package sept.task_30Sep2024;

public class Task004 {
    public static void main(String[] args) {

        //   Count vowels and consonants in a String. (pramod) - v = 2 , c =. 4

        String Str = "pramod";
        int v=0 ;
        int c=0;

        for (int vc =0;vc<Str.length();vc++) {

            char ch = Str.charAt(vc);

            if(ch =='a' ||ch =='e'||ch =='i'||ch=='o'||ch == 'u') {

                v++;

            }else {

                c++;
            }
        }

        System.out.println("Number of Vowels:"+v);
        System.out.println("Number of Consonants:"+c);

    }
}

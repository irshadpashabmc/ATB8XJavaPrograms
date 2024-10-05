package sept.task_20Sep2024;

public class Task001 {

    public static void main(String[] args) {

     //   By using Ternary Operators max between 3 numbers.
// Input int - a,b,c - a = 10, b = 20, c = 45
// Max → a,b,c → c
        int a =10,b =20, c=45;
     //  int max = (a<c)? a:c;
     //  int max1 = (b<c)? b:c;

        int max = (a>b) ? ((a>c)? a:c):((b>c) ? b:c);

        System.out.println("Max -> "+a+" "+b+" "+c+" ->" +max); // Max -> 10 20 45 -> 45
        System.out.println(+a+ +b+ +c+ +max); // 10+20+45+45 = 120
    }
}

package sept.task_27Sep2024;

public class Task002 {
    public static void main(String[] args) {

        // Create a Java program that prints the first 5 even numbers using a do-while loop.

        int a =1;
        do {
            if(a%2==0) {
                System.out.println(a);
            }
            a++;
        } while(a<=10);
    }
}

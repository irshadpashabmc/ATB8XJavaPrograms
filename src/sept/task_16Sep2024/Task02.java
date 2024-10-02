package sept.task_16Sep2024;

public class Task02 {
    public static void main(String[] args) {

        //byte b = 10; long l = 10l; → How much Byte will be used.
        //1 byte = 10 bits

        byte b = 10; // 1 byte of memory will be used
        long l = 10l; // 8 bytes of memory will be used

     // Another byte b = 10; byte c = 10;
        // What is the answer if the perform b+c, What is the data type it will give in result.
       byte b1 = 10;
       byte c = 10;
       byte result = (byte) (b1+c);

       // explicit type casting is required other wise the result is treated as int and it throws error

       System.out.println(b1+c);// 20 the operation itself treats the result as an int,
        // and the explicit cast converts the result to byte for storage in a byte variable.

    }
}

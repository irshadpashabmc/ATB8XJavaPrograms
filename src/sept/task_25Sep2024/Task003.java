package sept.task_25Sep2024;


public class Task003 {
    public static void main(String[] args) {
        //   Prime Number from 1 to 100. (for loop)

        for(int i=2;i<=100;i++)
        {
            int count=0;

            for(int num=i;num>=1;num--)
            {
                if(i%num==0)
                {
                    count++;
                }
            }
            if(count==2) {

                System.out.println(i);
            }
        }

    }
}

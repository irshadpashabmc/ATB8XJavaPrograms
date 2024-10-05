package sept.task_20Sep2024;

public class Task002 {
    public static void main(String[] args) {

    int Score = 85;

    String Grade = (Score>=90) ? "A": (Score>=80) ? "B": (Score>=70) ? "C":"F";

        System.out.println("Score is "+Score+" "+Grade+" ->" +Grade);
    }
}

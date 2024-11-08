package october.ex_21102024;

public class EnumKeywordthree {

    enum Days { Firstday(1),Secondday(2),Thirdday(3);

int a;
    private  Days(int i) {
      this.a = i;
        }

     int printDay() {

            return this.a ;
        }

    }

    public static void main(String[] args) {
        System.out.println(Days.Firstday.printDay());

      //  EnumKeywordthree EKT = new EnumKeywordthree();
      //  EKT.printDay(); no need object creation okay direclty we ca use enum

    }

}

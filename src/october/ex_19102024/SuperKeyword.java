package october.ex_19102024;

public class SuperKeyword {

    class Car extends Vehicle {
        int maxspeed = 125;

        Car() {
            System.out.println("This is Car Constructor");
         //   System.out.println(super.maxspeed);
         //   super.vehi();

        }

        Car(int maxspeed) {

            this.maxspeed = maxspeed;
       //     super.maxspeed = maxspeed;

        }

    }

    class Vehicle {
        int maxspeed = 120;

   public Vehicle() {

            System.out.println("This is Vehicle Constructor");
        }

     public  Vehicle(int maxspeed) {
            this.maxspeed = maxspeed;

        }

        void vehi() {

            System.out.println("Vehi method");
        }

    }


}

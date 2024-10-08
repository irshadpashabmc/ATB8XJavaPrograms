package october.Task_04102024;

// Create a Person Class with 10 A, 5 Behaviour( All types of Methods)
// and use the DC and PC to set the values, Create 5 Objects.

public class Person {
//Instance variables  (Attributes)
    String Name;
    String Address;
    int Age;
    char Gender;
    String City;
    String Country;
    String State;
    double Height;
    double Weight;
    String Occupation;
    String Id_Proof;

     // Default Constructor (DC)

    Person() {
 // System.out.println("This is Default Constructor\n");

    }

    // Parameter Constructor (PC 1)

    Person(String Name,String City, String Country,String State)   {

        System.out.println("This is Parameter Constructor: 1\n");

        this.Name = Name;
        this.City = City;
        this.Country = Country;
        this.State = State;
    }

    // Parameter Constructor (PC 2)

    Person(char Gender,int Age, double Height, double Weight)   {

        System.out.println("This is Parameter Constructor: 2\n");

        this.Gender = Gender;
        this.Age = Age;
        this.Height = Height;
        this.Weight = Weight;

    }

    // Parameter Constructor (PC 3)

    Person(String Address,String Occupation, String Id_Proof)   {

        System.out.println("This is Parameter Constructor: 3\n");

        this.Address = Address;
        this.Occupation = Occupation;
        this.Id_Proof = Id_Proof;
    }

    // Behavior 1 (Non-Return Type)

    void walk() {

        System.out.println("This is Walk Method");
    }

    // Behavior 2 (Default Return Type)

    String talk() {

        return "Talk";
    }

    // Behavior 3 (Return Type without invoking object)

    public static String eat(String food,String drink) {

        System.out.println("This is eat method:"+("I had "+food+" and drank "+drink));
        return (food+drink);
    }

    // Behavior 4 (Non-Return-Type without invoking object)

    public static void work(String Hardwork,String Earn) {

        System.out.println("This is work Method:" +(Hardwork+" and "+Earn));
    }

    // Behavior 5 (Return-Type)

    public String sleep() {

        return "This is sleep method and Sleep";
    }

    // Behavior 6 (Return-Type)

    public String live() {

        return "This is live method and lets live";
    }


    public static void main(String[] args) {

    // Create Object and call DC

        Person DC = new Person();
        new Person();

        // Create Object and call PC:1

        Person PC1 = new Person("Human","Hyderabad","India","Telangana");

        System.out.println("This is PC:1:Name is:" +PC1.Name);
        System.out.println("This is PC:1:Country is:" +PC1.Country);
        System.out.println("This is PC:1:City is:" +PC1.City);
        System.out.println("This is PC:1:State is:" +PC1.State+"\n");

        // Create Object and call PC:2

        Person PC2 = new Person('M',30,5.8,75);

        System.out.println("This is PC:2 :Gender is:" +PC2.Gender);
        System.out.println("This is PC:2:Age is:" +PC2.Age);
        System.out.println("This is PC:2:Height is:" +PC2.Height);
        System.out.println("This is PC:2:Weight is:" +PC2.Weight+"\n");


        // Create Object and call PC:3

        Person PC3 = new Person("Address","Test Engineer","Aadhaar card");

        System.out.println("This is PC:3:Address is:" +PC3.Address);
        System.out.println("This is PC:3:Occupation is:" +PC3.Occupation);
        System.out.println("This is PC:3:Id_Proof is:" +PC3.Id_Proof+"\n");

        // Behaviour 1
       Person Walk = new Person();
       Walk.walk();

        // Behaviour 2
        Person Talk = new Person();
        String Tlk = Talk.talk();
        System.out.println("This is talk Method:"+Tlk);

        // Behaviour 3
      eat("Meals","Water");

        // Behaviour 4
        work("Hardwork done","Earned salary");

        // Behaviour 5

        Person Sleep = new Person();
        String Slp = Sleep.sleep();
        System.out.println(Slp);

        // Behaviour 6

        Person Live = new Person();
        Live.live();
        String Liv = Live.live();
        System.out.println(Liv);

    }
}
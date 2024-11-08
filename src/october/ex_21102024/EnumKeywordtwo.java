package october.ex_21102024;

public class EnumKeywordtwo {

    enum Colors {
        RED("#1234"), GREEN("#2345"), BLUE("#67890");

        String Hexcode;

        Colors(String Hexcode) {

            this.Hexcode = Hexcode;
        }

        public String getHexcode() {

            return this.Hexcode;
        }
    }
        public static void main(String[] args) {
            System.out.println(Colors.RED.getHexcode());

            System.out.println(EnumKeywordthree.Days.Firstday.printDay());

        }
    }


package october.ex_18102024;

import october.ex_19102024.Police;

public class Thief extends Police {

    Thief() {

       super.gun = "";
       super.ID_Card = "";

    }


    public static void main(String[] args) {

        Police PL = new Police("Other Package Gun","Other Thief card");

    }


}

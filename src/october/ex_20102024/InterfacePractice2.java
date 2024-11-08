package october.ex_20102024;

interface InterfacePractice2 {

  //  String area ; // it will not allowed you to initialize variable without value
  //  int a ;
   default void InterfacePractice22(){

   }

    default void InterfacePractice2(){
// name can be same as a class name
    }

    default void InterfacePractice23(String area, int a){
       System.out.println(area+a);
           }

    void test();

}


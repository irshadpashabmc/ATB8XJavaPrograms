package october.ex_18102024;

public class GoogleAccess {

    public static void main(String[] args) {

        GoogleLogin GL = new GoogleLogin("irshad","Irshad1234");

        System.out.println(GL.getUsername());
        System.out.println(GL.getPassword());

       GL.setUsername("setting username from google access",false);
        System.out.println(GL.getUsername());

        GL.setPassword("setting password from google access",false);
        System.out.println(GL.getPassword());

    }

}

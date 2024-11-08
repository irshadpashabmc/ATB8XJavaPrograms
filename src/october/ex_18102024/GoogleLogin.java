package october.ex_18102024;

public class GoogleLogin {

    private  String Username;
    private  String Password;

    public GoogleLogin(String username, String password) {
        this.Username = username;
        this.Password = password;
    }

    String getUsername() {

        return Username;
    }

    void setUsername(String Username, boolean isuseraccess) {

        if(isuseraccess) {

            this.Username = Username;
        }else {

            System.out.println("Setting username is Not allowed");
        }


    }

    String getPassword() {

        return Password;
    }

    void setPassword(String Password, boolean ispassaccess) {

       if (ispassaccess) {

           this.Password = Password;
       }else {

           System.out.println("Setting password is Not allowed ");
       }


    }



}

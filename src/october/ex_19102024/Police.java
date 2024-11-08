package october.ex_19102024;

public class Police {

  protected  String gun;
  protected String ID_Card;



    public Police() {

    }

    public Police(String gun, String ID_Card) {

        this.gun = gun;
        this.ID_Card = ID_Card;
    }

    public String getGun() {
        return gun;
    }

    public void setGun(String gun) {
        this.gun = gun;
    }

    public String getID_Card() {

        return ID_Card;
    }

    public void setID_Card(String ID_Card) {
        this.ID_Card = ID_Card;
    }
}

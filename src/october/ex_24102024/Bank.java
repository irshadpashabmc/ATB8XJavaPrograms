package october.ex_24102024;

public class Bank {
private Integer Amount;
private String Currency;

public Bank( String Currency, Integer Amount) {

    this.Amount = Amount;
    this.Currency = Currency;
}

    public Integer getAmount() {
        return Amount;
    }

    public String getCurrency() {
        return Currency;
    }

    public void setAmount(Integer amount) {
        this.Amount = amount;
    }

    public void setCurrency(String currency) {
         this.Currency = currency;
    }

    public Integer add(Bank BankName) throws Exception {

        if (!BankName.Currency.equalsIgnoreCase("INR")) {

            throw new Exception("Currency is not Matching");
        } else {

            return BankName.Amount + this.Amount;
        }
    }
    public static void main(String[] args){

    }
}

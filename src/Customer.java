public class Customer {

    public String firstName;
    public String lastName;
    Account account;


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Customer(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

}

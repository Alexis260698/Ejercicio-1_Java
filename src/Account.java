public class Account {

    public double Balance;


    public double getBalance() {
        return Balance;
    }

    public double deposit(double deposit){
        Balance+=deposit;
        return Balance;
    }

    public double withdraw(double whitd){
     if(getBalance()-whitd<0){
         throw new RuntimeException("No tienes el saldo suficiente");
         //return Balance;
     }else{
         Balance-=whitd;
         return Balance;
     }
    }

    public Account() {
        Balance = 0;
    }
}

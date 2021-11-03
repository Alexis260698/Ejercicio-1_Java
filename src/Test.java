public class Test {
    public static void main(String[] args) {
        Account a = new Account();
        a.deposit(1500);
        try {
            a.withdraw(1200);
        }catch (Exception e){

        }

        Customer c1= new Customer("Ramiro", "Fryda");
        c1.setAccount(a);
        System.out.println("Mi Nombre Completo es: "+ c1.getFirstName()+" "+c1.getLastName()
        +"\n"+ "Y mi balance es: " + a.getBalance()+"\n");

        Account a2 = new Account();
        a2.deposit(1500);
        try {
            a2.withdraw(1700);
        }catch (Exception e){

        }
        Customer c2= new Customer("Leandro", "Trillo");
        c1.setAccount(a2);
        System.out.println("Mi Nombre Completo es: "+ c2.getFirstName()+" "+c2.getLastName()
                +"\n"+ "Y mi balance es: " + a2.getBalance());


    }


}

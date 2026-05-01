class BankAccount{
    String accountHolder;
    double balance;
    BankAccount(String accountHolder,double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    void deposit(double amount){
        balance = balance + amount;
        System.out.println(accountHolder+"deposit:"+amount);
    }
    void withdraw(double amount){
        if (amount <= balance){
            balance = balance - amount;
            System.out.println(accountHolder + "withdraw:" + amount);
        }else{
            System.out.println("Insuffient balance for" + accountHolder);
        }
    }
    void checkBalance(){
        System.out.println(accountHolder + "Current Balance:" + balance);
    }
}
public class Bank{
    public static void main(String [] args){
        BankAccount n = new BankAccount("Navadeep",180000);
        n.deposit(1500000);
        n.withdraw(500);
        n.checkBalance();
    } 
}
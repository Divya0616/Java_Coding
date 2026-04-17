/*
Shared Resources:
--data used by multiple threadsvariables, object, file
Race Condition: when multiple thread access shared resources, 
                the result is based on the execution order 
*/
class Bank{
    int bal=1000;
    synchronized void withdraw(int amt){
        if(amt<=bal){
            System.out.println("Amount withdraw successful");
            bal-=amt;
            System.out.println("Remaining Balance:" + bal);
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
}
class BankThread extends Thread{
    Bank b;
    BankThread(Bank b){
        this.b = b;
    }
    public void run(){
        b.withdraw(800);
    }
}
public class ThreadSynchronization{
    public static void main(String[] args){
        Bank bank = new Bank();
        BankThread b1 = new BankThread(bank);
        BankThread b2 = new BankThread(bank);
        b1.start();
        b2.start();
    }
}
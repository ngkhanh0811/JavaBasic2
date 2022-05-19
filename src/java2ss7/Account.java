package src.java2ss7;/*Welcome to my show !

@author: NgKhanh
Date: 5/19/2022
Time: 4:01 PM

ProjectName: JavaBasic2*/

class Account {
    double balance = 200.0;
    public void deposit(double amount){
        balance = balance + amount;
    }
    public void displayBalance(){
        System.out.println("Balance is:"+balance);
    }
}

class Transaction implements Runnable{
    double amount;
    Account account;
    Thread t;
    public Transaction(Account acc, double amt){
        account = acc;
        amount = amt;
        t = new Thread(this);
        t.start();
    }
    public void run(){
        synchronized (account){
            account.deposit(amount);
            account.displayBalance();
        }
    }
}

class DepositAmount{
    public static void main(String[] args) {
        Account accObj = new Account();
        Transaction t1 = new Transaction(accObj, 500.00);
        Transaction t2 = new Transaction(accObj, 200.00);
    }
}
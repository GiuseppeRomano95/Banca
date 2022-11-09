package it.ibm.progettoBanca.domain.data;

public class Account {
        public Account(){};
        public Account(double initialBalance){
            balance = initialBalance;
        }
        private double balance;
        public void printBalance(){
             System.out.println(balance);
        }

        public double getBalance() {
            return balance;
        }

        public double deposit(double amount){
            balance += amount;
            return balance;
        }

        public double withdraw(double amount){
            balance -= amount;
            return balance;
        }

        public double transfer(double amount, Account receiver){
            withdraw(amount);
          receiver.deposit(amount);
          return balance;
        }

}

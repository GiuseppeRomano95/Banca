package it.ibm.progettoBanca.program;
import it.ibm.progettoBanca.domain.data.Account;
import it.ibm.progettoBanca.domain.data.CaymanAccount;
import it.ibm.progettoBanca.domain.data.ForeignAccount;
import it.ibm.progettoBanca.domain.people.Client;

import java.time.DayOfWeek;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        Client c1 = new Client("Mario","Rossi",LocalDate.of(1980, 10, 20),10);
        System.out.println(c1.getlastName());
        c1.setfirstName("Marco");
        ForeignAccount fa;
        //fa.deposit(200);
        fa = new ForeignAccount(1000,"FR");
        Account x = new ForeignAccount(1000,"ITA");
        //if(Math.random()>0.5){
          //  x = new Account(5000);
        //}
        CaymanAccount ca = new CaymanAccount();
        handleAccount((Account)ca);//UpCasting
        Account[] acs = new Account[5];
        acs[0] = new CaymanAccount();
        CaymanAccount y = (CaymanAccount) acs[0];//DownCasting
        y.evadeTax();
    }
    public static double handleAccount(Account x){
        if(x.getBalance()>1000 && LocalDate.now().getDayOfWeek()== DayOfWeek.WEDNESDAY){
            x.deposit(10);
        }
        return x.getBalance();
    }
}
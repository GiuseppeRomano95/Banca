package it.ibm.progettoBanca.domain.people;

import it.ibm.progettoBanca.domain.data.Account;

import java.time.LocalDate;

public class Client {
    public String firstName;
    private String lastName;
    public LocalDate dob;
    public Account[] accounts;

    public Client(String fn,String sn,LocalDate dob1,int maxAccount) {
        firstName = fn;
        lastName = sn;
        dob = dob1;
        accounts = new Account[maxAccount];
    }

    public String getlastName(){
        return lastName;
    }

    public void setfirstName(String fn){
        firstName = fn;
    }
}

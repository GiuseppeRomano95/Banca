package it.ibm.progettoBanca.domain.data;

public class CaymanAccount extends Account{
    public double evadeTax(){
        return getBalance();
    }
}

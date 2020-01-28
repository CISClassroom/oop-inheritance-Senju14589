package com.company;

public class Withdraw {
    Balance balance = new Balance();
    public void fixed_wd(double money){
        balance.money_fixed -= money;
        balance.fixed_b1();
    }
    public  void saving_wd(double money){
        balance.money_seving -= money;
        balance.saving_bl();
    }
}

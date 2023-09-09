package com.TestProject.Model;

public record Employee(String nid, String carRegis, String bankAccount) {

    public Employee(String nid, String carRegis, String bankAccount){


        try {
            if(nid.equals(0)&&carRegis.equals(0)&&bankAccount.equals(0))
        }
        catch (
                throw
        )
        this.nid = nid;
        this.carRegis = carRegis;
        this.bankAccount = bankAccount;

    }
}

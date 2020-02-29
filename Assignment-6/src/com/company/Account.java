package com.company;

public class Account {
    protected String FirstName, LastName;
    protected double CurBalance;

    public Account(){}

    public Account(String fname, String lname, double cb) {
        this.FirstName = fname;
        this.LastName = lname;
        this.CurBalance = cb;
    }
    public String getAcctType() {
        return this.getClass().getName();
    }

    public double DebitTransaction(double debitAmount) {
        CurBalance = CurBalance - debitAmount;
        return CurBalance;
    }

    public double CreditTransaction(double creditAmount) {
        CurBalance = CurBalance + creditAmount;
        return CurBalance;
    }

    public String toString() {
        return "Account name: " + FirstName + " " + LastName + ", Account Type: " + getAcctType() + ", Balance: " +
                String.format("$%.2f", CurBalance);
    }
}

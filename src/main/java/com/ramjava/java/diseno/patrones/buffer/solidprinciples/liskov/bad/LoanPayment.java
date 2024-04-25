package com.ramjava.java.diseno.patrones.buffer.solidprinciples.liskov.bad;

/**
 * This is loan interface responsible for payment related operations on loan account
 * LoanPayment implemented by actual loans like Home Loan, Credit Card Loan etc.
 * For credit card/personal loan which is unsecured foreclosure and repayment is not allowed.
 */
public interface LoanPayment {
    void doPayment(int amount);
    void foreCloseLoan();
    void doRepayment(int amount);
}

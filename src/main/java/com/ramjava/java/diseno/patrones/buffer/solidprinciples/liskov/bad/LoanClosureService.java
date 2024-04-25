package com.ramjava.java.diseno.patrones.buffer.solidprinciples.liskov.bad;

/**
 * This is loan closure service is responsible
 * to close the loan before its actual due date.
 * Now since credit card is not supporting foreclosure
 * it will throw exception which is wrong in design where
 * we are unable to substitute subtype with super type.That is violation of
 * Liksov Substitution rule.
 * Solution to this is segregate the method in different super types
 * and make supertype replaceable at any given time.
 */
public class LoanClosureService {
    private LoanPayment loanPayment;
    public LoanClosureService(LoanPayment loanPayment) {
        this.loanPayment = loanPayment;
    }
    public void foreCloseLoan() {
        loanPayment.foreCloseLoan();
    }

}

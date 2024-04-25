package com.ramjava.java.diseno.patrones.buffer.solidprinciples.liskov.good;

/**
 * This is good as we provide to secure the loan type
 * This will behave perfectly fine even if we substitute between parent
 * and child.
 */
public class LoanClosureService {
    private SecureLoan secureLoan;
    public LoanClosureService(SecureLoan secureLoan) {
        this.secureLoan = secureLoan;
    }
    public void foreCloseLoan() {
        secureLoan.foreCloseLoan();
    }

}

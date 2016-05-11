package entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "LOAN_FILE_TABLE")
public class LoanFile {

    @Id
    @GeneratedValue
    @Column(name = "LOAN_FILE_ID", nullable = false)
    private int loanFileId;

    @Column(name = "CUSTOMER_NUMBER", nullable = false)
    private String customerNumber;

    @ManyToOne(fetch= FetchType.LAZY, cascade = { CascadeType.ALL })
    @JoinColumn(name = "LOAN_ID", nullable = false)
    private LoanType loanType;

    @Column(name = "DURATION", nullable = false)
    private int duration;

    @Column(name = "AMOUNT", nullable = false)
    private BigDecimal amount;

    public LoanFile() {
    }

    public LoanFile(String customerNumber, LoanType loanType, int duration, BigDecimal amount) {
        this.customerNumber = customerNumber;
        this.loanType = loanType;
        this.duration = duration;
        this.amount = amount;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public LoanType getLoanType() {
        return loanType;
    }

    public void setLoanType(LoanType loanType) {
        this.loanType = loanType;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

}

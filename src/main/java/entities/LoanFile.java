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

    @ManyToOne(fetch= FetchType.LAZY, cascade = { CascadeType.ALL })
    @JoinColumn(name = "LOAN_ID", nullable = false)
    private LoanType loanType;

    @Column(name = "DURATION", nullable = false)
    private int duration;

    @Column(name = "AMOUNT", nullable = false)
    private BigDecimal amount;

    @ManyToOne(fetch= FetchType.LAZY, cascade = { CascadeType.ALL })
    @JoinColumn(name = "CUSTOMER_ID", nullable = false)
    private RealCustomer realCustomer;

    public int getLoanFileId() {
        return loanFileId;
    }

    public void setLoanFileId(int loanFileId) {
        this.loanFileId = loanFileId;
    }

    public RealCustomer getRealCustomer() {
        return realCustomer;
    }

    public void setRealCustomer(RealCustomer realCustomer) {
        this.realCustomer = realCustomer;
    }

    public LoanFile() {
    }

    public LoanFile(LoanType loanType, int duration, BigDecimal amount) {
        this.loanType = loanType;
        this.duration = duration;
        this.amount = amount;
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

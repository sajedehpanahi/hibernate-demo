package entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "LOAN_TYPE")
public class LoanType implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "LOAN_ID", nullable = false, unique = true)
    private int loanId;

    @Column(name = "LOAN_NAME", nullable = false)
    private String loanName;

    @Column(name = "INTEREST_RATE", nullable = false)
    private float interestRate;

    @OneToMany(mappedBy = "loanType")
    private Set<GrantCondition> grantConditions = new HashSet<GrantCondition>(0);

    @OneToMany(mappedBy = "loanType")
    private Set<LoanFile> loanFiles = new HashSet<LoanFile>(0);

    public LoanType(String loanName, float interestRate, HashSet<GrantCondition> grantConditions) {
        this.loanName = loanName;
        this.interestRate = interestRate;
        this.grantConditions = grantConditions;
    }

    public String getLoanName() {
        return loanName;
    }

    public void setLoanName(String loanName) {
        this.loanName = loanName;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    public Set<GrantCondition> getGrantConditions() {
        return grantConditions;
    }

    public void setGrantConditions(HashSet<GrantCondition> grantConditions) {
        this.grantConditions = grantConditions;
    }
}

package entities;


import javax.persistence.*;
import java.math.BigDecimal;
@Entity
@Table(name="grant_condition_table")
public class GrantCondition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="GRANT_ID")
    private int grantId;
    @Column(name = "GRANT_NAME")
    private String grantName;
    @Column(name = "MIN_DURATION")
    private int minDuration;
    @Column(name = "MAX_DURATION")
    private int maxDuration;
    @Column(name = "MIN_AMOUNT")
    private BigDecimal minAmount;
    @Column(name = "MAX_AMOUNT")
    private BigDecimal maxAmount;

    public String getGrantName() {
        return grantName;
    }

    public void setGrantName(String grantName) {
        this.grantName = grantName;
    }

    public int getMinDuration() {
        return minDuration;
    }

    public void setMinDuration(int minDuration) {
        this.minDuration = minDuration;
    }

    public int getMaxDuration() {
        return maxDuration;
    }

    public void setMaxDuration(int maxDuration) {
        this.maxDuration = maxDuration;
    }

    public BigDecimal getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(BigDecimal minAmount) {
        this.minAmount = minAmount;
    }

    public BigDecimal getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(BigDecimal maxAmount) {
        this.maxAmount = maxAmount;
    }

    public GrantCondition(int grantId) {
        this.grantId = grantId;
    }
}

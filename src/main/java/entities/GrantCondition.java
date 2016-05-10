package entities;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
@Entity
@Table(name="GRANT_CONDITION_TABLE")
public class GrantCondition implements Serializable {


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


    public int getGrantId() {
        return grantId;
    }

    public void setGrantId(int grantId) {
        this.grantId = grantId;
    }

    //@Column(name = "GRANT_NAME")
    public String getGrantName() {
        return grantName;
    }

    public void setGrantName(String grantName) {
        this.grantName = grantName;
    }

    //@Column(name = "MIN_DURATION")
    public int getMinDuration() {
        return minDuration;
    }

    public void setMinDuration(int minDuration) {
        this.minDuration = minDuration;
    }

    //@Column(name = "MAX_DURATION")
    public int getMaxDuration() {
        return maxDuration;
    }

    public void setMaxDuration(int maxDuration) {
        this.maxDuration = maxDuration;
    }

    //@Column(name = "MIN_AMOUNT")
    public BigDecimal getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(BigDecimal minAmount) {
        this.minAmount = minAmount;
    }

    //@Column(name = "MAX_AMOUNT")
    public BigDecimal getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(BigDecimal maxAmount) {
        this.maxAmount = maxAmount;
    }

}

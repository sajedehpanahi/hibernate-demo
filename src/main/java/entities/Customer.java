package entities;

import javax.persistence.*;

@Entity
@Table(name = "CUSTOMER")
@Inheritance(strategy = InheritanceType.JOINED)
public class Customer {

    @Id
    @GeneratedValue
    @Column(name = "CUSTOMER_ID", nullable = false, insertable = false, updatable = false, unique = true)
    private int customerId;

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

}

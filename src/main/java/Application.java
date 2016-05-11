
import entities.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HibernateUtil;
import util.Log4jTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = HibernateUtil.getSessionFactory(); Session session= sessionFactory.openSession()) {
            Log4jTest.getLogger().info("session opened!");
            Log4jTest.getLogger().error("everything is OK!");
             session.beginTransaction();

            LegalCustomer legalCustomer = new LegalCustomer("dotin","1389-09-17","234785");
            session.save(legalCustomer);

            RealCustomer realCustomer = new RealCustomer("a","s","d","f","g");
            session.save(realCustomer);

            HashSet<GrantCondition> grantConditions = new HashSet<GrantCondition>();
            for(int i=0; i<3; i++){
                GrantCondition grantCondition = new GrantCondition("grant name", 10,20, new BigDecimal(30),new BigDecimal(40));
                grantConditions.add(grantCondition);
            }

            LoanType loanType = new LoanType("laon name",2.4F,grantConditions);
            session.save(loanType);

            for (GrantCondition grantCondition: grantConditions){
                grantCondition.setLoanType(loanType);
                session.save(grantCondition);
            }

            LoanFile loanFile = new LoanFile("customernumber123456",loanType,24,new BigDecimal(52));
            session.save(loanFile);

            session.getTransaction().commit();
        }catch (RuntimeException e){
            System.out.println("Error!");
            e.printStackTrace();
        }
    }
}


import entities.GrantCondition;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.math.BigDecimal;

public class Application {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = HibernateUtil.getSessionFactory(); Session session= sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            BigDecimal tempNumber=new BigDecimal(20);
            GrantCondition grantCondition=new GrantCondition();
            grantCondition.setGrantName("sss");
            grantCondition.setGrantId(1);
            grantCondition.setMaxAmount(tempNumber);
            grantCondition.setMinAmount(tempNumber);
            grantCondition.setMaxDuration(23);
            grantCondition.setMinDuration(21);
            session.save(grantCondition);
            transaction.commit();
        }catch (RuntimeException e){
            System.out.println("Error!");
            e.printStackTrace();
        }
    }
}

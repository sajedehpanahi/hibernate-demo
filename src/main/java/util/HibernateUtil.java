package util;

import entities.*;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            Configuration configuration = new Configuration().configure();
            configuration.addAnnotatedClass(Customer.class);
            configuration.addAnnotatedClass(LegalCustomer.class);
            configuration.addAnnotatedClass(RealCustomer.class);
            configuration.addAnnotatedClass(LoanType.class);
            configuration.addAnnotatedClass(GrantCondition.class);
            configuration.addAnnotatedClass(LoanFile.class);
            StandardServiceRegistryBuilder registryBuilder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
            return configuration.buildSessionFactory(registryBuilder.build());
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("there was an error building factory!" + e.getMessage());
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    @Override
    protected void finalize() {

    }
}

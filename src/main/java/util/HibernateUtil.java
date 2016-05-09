package util;

import entities.GrantCondition;
import org.hibernate.SessionFactory;

import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static final SessionFactory sessionFactory = BuildSessionFactory();

    private static SessionFactory BuildSessionFactory() {
        try{
            Configuration configuration = new Configuration();
            configuration.addAnnotatedClass(GrantCondition.class);
            return configuration.buildSessionFactory(new StandardServiceRegistryBuilder().build());
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("there was an error building factory!");
        }
    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}

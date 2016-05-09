
import org.hibernate.Session;
import util.HibernateUtil;

public class Application {
    public static void main(String[] args) {
        try{
            Session session= HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.close();
        }catch (RuntimeException e){
            System.out.println("Error!");
        }
    }
}

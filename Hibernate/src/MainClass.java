import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		
		Session session = factory.openSession();
		 org.hibernate.Transaction trans = session.beginTransaction();
		  
		SimpleHibernate std = new SimpleHibernate();
		SimpleHibernate std1 = new SimpleHibernate();
		std.setStudentname("Mahesh Sompalli");
		std1.setStudentname("Sanjay Patel");
		std.setStudentAge(20);
		std1.setStudentAge(23);
		
		session.save(std);
		session.save(std1);
		trans.commit();
        session.close();

	}

}

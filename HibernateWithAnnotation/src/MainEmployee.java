import org.hibernate.*;  
import org.hibernate.cfg.*;  

public class MainEmployee {  
	public static void main(String[] args) {  
		AnnotationConfiguration cfg=new AnnotationConfiguration();  
		Session session=cfg.configure("hibernate.cfg.xml").buildSessionFactory().openSession();  

		Transaction t=session.beginTransaction();  

		Employee e1=new Employee();  
		e1.setName("emp1");

		Employee1 e2=new Employee1();  
		e2.setEmpcmpny("capg");
		//e2.setId(1);
		e2.setName("mahesh");
		Employee2 e3=new Employee2();  
		e3.setEmpcity("bangalore");
		e3.setEmpcmpny("wipro");
		session.persist(e1);  
		session.persist(e2);  
		session.persist(e3);  

		t.commit();  
		session.close();  
		System.out.println("success");  
	}  
}  
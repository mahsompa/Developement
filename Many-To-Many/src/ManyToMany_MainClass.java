import java.util.HashMap;  

import org.hibernate.*;  
import org.hibernate.cfg.*;  
import org.hibernate.classic.Session;
public class ManyToMany_MainClass {  
	public static void main(String[] args) {  
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		SessionFactory factory = cfg.configure().buildSessionFactory();

		Session session = factory.openSession(); 
		org.hibernate.Transaction trans = session.beginTransaction();  

		HashMap<String,Subjects> map1=new HashMap<String,Subjects>();  
		map1.put("java", new Subjects("java",5));
		map1.put("C", new Subjects("C languag", 10));
		
		
		HashMap<String,Subjects> map2=new HashMap<String,Subjects>();  
		map2.put("maths",  

				new Subjects("general",25));  
		map2.put("social",  
				new Subjects("type of geometry",1));  

		Student student1=new Student("mahesh",map1);  
		Student student2=new Student("suresh",map2);  

		session.persist(student1);  
		session.persist(student2);  

		trans.commit();  
		session.close();  
		System.out.println("successfully stored");  
	}  
}  
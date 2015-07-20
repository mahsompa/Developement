import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;
/* main class is used to run the Hibernate application*/
public class Table_per_Class {  
	public static void main(String[] args) {  
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		SessionFactory factory = cfg.configure().buildSessionFactory();

		Session session = factory.openSession(); 
		org.hibernate.Transaction trans = session.beginTransaction();
		Vehicle e1=new Vehicle(); // create an object reference for main class 
		//e1.setId(1);  
        e1.setVehicleName("car");
        
		TwoWheeler e2=new TwoWheeler();  // create an object reference for regular class 
		//e2.setId(1);  
		e2.setMax_capacity(2);  
		e2.setVehicleName("bike");  

		FourWheeler e3=new FourWheeler();  // create an object reference for contract class
		//e3.setId(1);;  
		e3.setVehicleName("car");;  
		e3.setCapacity(4);  

		session.persist(e1);  // persist the session
		session.persist(e2);  
		session.persist(e3);  

		trans.commit(); // save the total transactions 
		session.close();  // close the session
		System.out.println("success");  
	}  
}  
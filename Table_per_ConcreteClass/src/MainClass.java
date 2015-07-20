import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;
/* main class is used to run the Hibernate application*/
public class MainClass {  
	public static void main(String[] args) {  
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		SessionFactory factory = cfg.configure().buildSessionFactory();

		Session session = factory.openSession(); 
		org.hibernate.Transaction trans = session.beginTransaction();
		Vehicle vehical=new Vehicle(); // create an object reference for main class 

		vehical.setVehicleName("car");

		TwoWheeler twowheeler=new TwoWheeler();  // create an object reference for regular class 

		twowheeler.setMax_capacity(2);  
		twowheeler.setVehicleName("bike");  

		FourWheeler  fourwheeler=new FourWheeler();  // create an object reference for contract class

		fourwheeler.setVehicleName("car");;  
		fourwheeler.setCapacity(4);  

		session.persist(vehical);  // persist the session
		session.persist( twowheeler);  
		session.persist( fourwheeler);  

		trans.commit(); // save the total transactions 
		session.close();  // close the session
		System.out.println("success");  
	}  
}  
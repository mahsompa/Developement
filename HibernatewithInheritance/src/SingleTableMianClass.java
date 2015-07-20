import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;
/* main class is used to run the Hibernate application*/
public class SingleTableMianClass {  
	public static void main(String[] args) {  
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		SessionFactory factory = cfg.configure().buildSessionFactory();

		Session session = factory.openSession(); 
		org.hibernate.Transaction trans = session.beginTransaction();
		Employee e1=new Employee(); // create an object reference for main class 
		e1.setEmpName("sonoo");  

		RegularEmployee e2=new RegularEmployee();  // create an object reference for regular class 
		e2.setEmpName("mahesh sompalli");  
		e2.setEmpsal(17000);  
		e2.setEmpbonus(6);  

		ContractEmployee e3=new ContractEmployee();  // create an object reference for contract class
		e3.setEmpName("sanjay patel");  
		e3.setSalary_per_hour(2000);  
		e3.setContract_duration("19 hours");  

		session.persist(e1);  // persist the session
		session.persist(e2);  
		session.persist(e3);  

		trans.commit(); // save the total transactions 
		session.close();  // close the session
		System.out.println("success");  
	}  
}  
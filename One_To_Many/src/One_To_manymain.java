import java.util.ArrayList;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;


public class One_To_manymain {

	public static void main(String[] args) {
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		SessionFactory factory = cfg.configure().buildSessionFactory();

		Session session = factory.openSession(); 
		org.hibernate.Transaction trans = session.beginTransaction();
		Projects prj1=new Projects();
		//prj1.setProject_Id(111);
		prj1.setProjectName("dcps");
		prj1.setPrjct_Strength(12);
		Projects prj2=new Projects();
		//prj2.setProject_Id(112);
		prj2.setProjectName("itas");
		prj2.setPrjct_Strength(13);

		ArrayList<Projects> list1=new ArrayList<Projects>();
		list1.add(prj1);

		list1.add(prj2);
		Company cmp=new Company();
		
		cmp.setCompanyName("cpg");
		cmp.setProjects(list1);
		session.persist(cmp);
		trans.commit();
		session.close();



	}

}

package simplespring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class SpringTest 
{
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		Traiangle tr=(Traiangle)factory.getBean("triangle");
		tr.draw();
		Traiangle tr1=(Traiangle)factory.getBean("triangle1");
		tr1.draw();
		Traiangle tr2=(Traiangle)factory.getBean("triangle2");
		tr2.draw();
		Student std=(Student)factory.getBean("stud");
		System.out.println(std);
	}

}

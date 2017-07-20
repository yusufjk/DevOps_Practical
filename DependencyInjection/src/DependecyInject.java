
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class DependecyInject {
	public static void main(String[] args)
	{
		
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("config.xml"));
		EmpService emp=(EmpService)factory.getBean("emp");
		emp.createEmp();
	}

}

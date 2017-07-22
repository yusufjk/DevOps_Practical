import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;

public class TestAutowire {
public static void main(String[] args){
	
	BeanFactory factory=new XmlBeanFactory(new ClassPathResource("config.xml"));
	EmpService bean=factory.getBean(EmpService.class);
	bean.test();
	
}
}

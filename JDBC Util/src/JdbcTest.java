import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class JdbcTest {
	
	public static void main(String[] args)
	{
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("config.xml"));
		JdbcUtil jdbcUtil=(JdbcUtil)factory.getBean("checkCon");
		jdbcUtil.checkConnection();
		
	}

}

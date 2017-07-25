import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionInjectionTest {
public static void main(String[] args){
	
	ApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");

CollectionBean bean= ctx.getBean(CollectionBean.class);
System.out.println(bean.getList());
System.out.println(bean.getSet());
System.out.println(bean.getMap());

}
}

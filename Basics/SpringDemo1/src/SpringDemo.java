import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class SpringDemo {
	@SuppressWarnings("deprecation")
	public static void main(String []args) {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Student student = (Student) factory.getBean("springBean");
		
		student.displayInformation();
		((AbstractApplicationContext) factory).close();
	}
}

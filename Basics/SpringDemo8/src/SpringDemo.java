import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Cake cake = (Cake) context.getBean("cakeBean");
		
		cake.displayDetails();
		((ClassPathXmlApplicationContext) context).close();
	}
}

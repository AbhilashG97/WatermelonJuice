import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Car car = (Car) context.getBean("carBean");
		
		car.displayDetails();
		((ClassPathXmlApplicationContext) context).close();
	}
}

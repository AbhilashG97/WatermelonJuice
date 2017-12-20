import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		IceCream iceCream = (IceCream) context.getBean("iceCreamBean");
		
		iceCream.displayDetails();
		((ClassPathXmlApplicationContext) context).close();
	}
}

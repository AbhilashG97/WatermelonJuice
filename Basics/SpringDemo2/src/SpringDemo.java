import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {

	public static void main(String[] args) {
		
	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	Fruit fruit = (Fruit) context.getBean("fruitBean");
	
	fruit.displayDetails();
	((ClassPathXmlApplicationContext) context).close();
	}

}

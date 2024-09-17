package spring.core.ioc;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.HashMap;

import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //Retrieve the grocStore bean from Spring context
        HashMap<Integer, Collection<?>> grocStore = context.getBean("grocStore", HashMap.class);

        // Use grocStore as needed
        System.out.println(grocStore);
    }
}

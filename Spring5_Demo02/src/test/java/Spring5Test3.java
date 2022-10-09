import com.spring.autowire.emp;
import com.spring.bean.Orders;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring5Test3 {
    @Test
    public void test01(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println(orders);

    }
    @Test
    public void test02(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
        emp emp = context.getBean("emp", emp.class);
        System.out.println(emp);

    }
}

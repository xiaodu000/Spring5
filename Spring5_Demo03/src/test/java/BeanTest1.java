import com.spring.SpringConfig;
import com.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest1 {
    @Test
    public void test1(){
        ClassPathXmlApplicationContext cont = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = cont.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.methods();
    }
    @Test
    public void test2(){
        AnnotationConfigApplicationContext cont = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = cont.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.methods();
    }
}

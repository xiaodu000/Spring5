import com.spring.config.xconfig;
import com.spring.dao.User;
import com.spring.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class UserTest {
    @Test
    public void test1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }
    @Test
    public void test2(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(xconfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }
    @Test
    public void testGenericApplicationContext(){
        GenericApplicationContext context = new GenericApplicationContext();
        context.refresh();
        context.registerBean("user1",User.class,()->new User());

        User user=(User)context.getBean("user1");
        System.out.println(user);
    }
}

import com.spring.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

//@ExtendWith(SpringExtension.class)
//@ContextConfiguration("classpath:bean2.xml")
//以上两个注解合并成为一个
@SpringJUnitConfig(locations = "classpath:bean2.xml")
public class J5Test {
    @Autowired
    private UserService userService;
    @Test
    public void test1(){
        userService.accountMoney();
    }
}

import com.spring.collectiontype.Book;
import com.spring.collectiontype.Course;
import com.spring.collectiontype.Stu;
import com.spring.factorybean.MyBean;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring5Test2 {
    @Test
    public void test1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Book book1 = context.getBean("book",Book.class);
        Book book2 = context.getBean("book",Book.class);
        System.out.println(book1);
        System.out.println(book2);
    }
    @Test
    public void test2(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Course course = context.getBean("mybean", Course.class);
        System.out.println(course);
    }
}

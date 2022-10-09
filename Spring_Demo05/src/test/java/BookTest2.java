import com.spring5.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class BookTest2 {
    @Test
    public void test1(){
        ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("beanBook.xml");
        BookService bookService = con.getBean("bookService", BookService.class);
//        批量添加
        List<Object[]> list=new ArrayList<Object[]>();
        Object[] o1={88,"aa",89};
        Object[] o2={89,"aa",89};
        Object[] o3={90,"aa",89};
        list.add(o1);
        list.add(o2);
        list.add(o3);
        bookService.batchAdd(list);
    }
}

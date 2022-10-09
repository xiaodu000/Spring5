import com.spring5.entity.Book;
import com.spring5.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class BookTest1 {
    @Test
    public void test1(){
        ClassPathXmlApplicationContext bean1 = new ClassPathXmlApplicationContext("beanBook.xml");
        BookService bookservice = bean1.getBean("bookService", BookService.class);
        Book book = new Book();
        //添加
//        book.setDeptno(222);
//        book.setDname("123");
//        book.setLocid(123);
//        bookservice.addBook(book);
        //修改
//        book.setDeptno(222);
//        book.setDname("222");
//        book.setLocid(222);
//        bookservice.updateBook(book);
//        删除
//        bookservice.deleteBook(222);

//        查询记录数，返回某个值
//        int count = bookservice.findCount();
//        System.out.println(count);
//        查询某条记录
//        Book book1 = bookservice.seleOne(10);
//        System.out.println(book1);
//        查询全部记录
        List<Book> books = bookservice.seleAll();
        System.out.println(books);
    }
}

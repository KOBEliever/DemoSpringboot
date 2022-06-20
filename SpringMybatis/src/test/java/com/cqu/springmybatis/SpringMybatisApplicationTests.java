package com.cqu.springmybatis;

import com.cqu.dao.BookDao;
import com.cqu.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringMybatisApplicationTests {
    @Autowired
    private BookDao bookDao;
    @Test
    void getById() {
        Book book = bookDao.getById(1);
        System.out.println(book);
    }

}

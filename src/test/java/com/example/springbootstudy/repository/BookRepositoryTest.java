package com.example.springbootstudy.repository;

import com.example.springbootstudy.entity.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BookRepositoryTest {

    @Autowired
    private BookRepository bookRepository;

    @Test
    public void findAll(){
        System.out.println(bookRepository.findAll());
    }

    @Test
    void save(){
        Book book = new Book();
        book.setName("张三的书");
        book.setAuthor("僵局");
        Book book1 = bookRepository.save(book);
        System.out.println(book1);
    }

    @Test
    public void findById(){
        Book book = bookRepository.findById(1).get();
        System.out.println(book);
    }

    @Test
    public void update(){
        Book book = new Book();
        book.setId(119);
        book.setName("测试");
        Book book1 = bookRepository.save(book);
        System.out.println(book1);
    }

    @Test
    public void delete(){
        bookRepository.deleteById(119);
        System.out.println();
    }

}

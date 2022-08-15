package com.example.springbootstudy.repository;

import com.example.springbootstudy.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}

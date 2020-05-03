package com.cpadillao.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cpadillao.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}

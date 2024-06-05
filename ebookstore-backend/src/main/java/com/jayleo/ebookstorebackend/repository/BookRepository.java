package com.jayleo.ebookstorebackend.repository;

import com.jayleo.ebookstorebackend.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

// 定义了一个接口，继承了JpaRepository接口，JpaRepository接口是Spring Data JPA提供的简化数据访问层的接口
// 指定了实体类型为book，主键类型为Integer
// Jpa提供了一系列的方法，如save、delete、findAll、findById等，可以直接调用
public interface BookRepository extends JpaRepository<Book, Integer> {

}
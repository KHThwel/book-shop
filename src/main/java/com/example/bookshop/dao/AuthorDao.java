package com.example.bookshop.dao;

import com.example.bookshop.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface AuthorDao extends JpaRepository<Author,Integer> {
}

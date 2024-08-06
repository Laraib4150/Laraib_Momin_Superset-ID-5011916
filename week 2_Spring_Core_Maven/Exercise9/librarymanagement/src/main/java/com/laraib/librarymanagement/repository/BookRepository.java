package com.laraib.librarymanagement.repository;

import com.laraib.librarymanagement.entity.Book;
import com.mansoor.librarymanagement.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
    
}

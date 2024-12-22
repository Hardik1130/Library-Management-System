package com.hardikfunny.library.repo;

import com.hardikfunny.library.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book,Integer> {



}

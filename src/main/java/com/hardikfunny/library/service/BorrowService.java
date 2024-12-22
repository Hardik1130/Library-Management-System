package com.hardikfunny.library.service;

import com.hardikfunny.library.dto.BorrowSaveDTO;
import com.hardikfunny.library.dto.BorrowUpdateDTO;
import com.hardikfunny.library.entity.Borrow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;


public interface BorrowService  {

    Borrow addBorrow(BorrowSaveDTO bookSaveDTO);

    List<Borrow> getAllBorrows();

    Borrow updateBorrow(BorrowUpdateDTO borrowUpdateDTO);

    String deleteBorrow(int id);
}

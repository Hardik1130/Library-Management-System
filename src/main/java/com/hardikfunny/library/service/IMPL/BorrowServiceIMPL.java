package com.hardikfunny.library.service.IMPL;

import com.hardikfunny.library.dto.BorrowSaveDTO;
import com.hardikfunny.library.dto.BorrowUpdateDTO;
import com.hardikfunny.library.entity.Book;
import com.hardikfunny.library.entity.Borrow;
import com.hardikfunny.library.entity.User;
import com.hardikfunny.library.repo.AuthorRepo;
import com.hardikfunny.library.repo.BookRepo;
import com.hardikfunny.library.repo.BorrowRepo;
import com.hardikfunny.library.repo.UserRepo;
import com.hardikfunny.library.service.BorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BorrowServiceIMPL implements BorrowService {

    @Autowired
    private BorrowRepo borrowRepo;

    @Autowired
    private BookRepo bookRepo;

    @Autowired
    private UserRepo userRepo;

    @Override
    public Borrow addBorrow(BorrowSaveDTO borrowSaveDTO) {

        //Extracting Book and User Object
        Book book = borrowSaveDTO.getBook();
        User user = borrowSaveDTO.getUser();


        //Extracting IDs to check it is present in table or not
        int bookId = book.getBookId();
        int userId = user.getUserId();

        Borrow borrow = new Borrow(
                borrowSaveDTO.getBorrowDate(),
                borrowSaveDTO.getReturnDate(),
                bookRepo.getById(bookId),
                userRepo.getById(userId)
        );

        borrowRepo.save(borrow);
        return borrow;
    }

    @Override
    public List<Borrow> getAllBorrows() {
        return borrowRepo.findAll();
    }

    @Override
    public Borrow updateBorrow(BorrowUpdateDTO borrowUpdateDTO) {

        if (borrowRepo.existsById(borrowUpdateDTO.getBorrowId())) {
            Borrow borrow = borrowRepo.getById(borrowUpdateDTO.getBorrowId());
            borrow.setBorrowDate(borrowUpdateDTO.getBorrowDate());
            borrow.setReturnDate(borrowUpdateDTO.getReturnDate());
            borrow.setBook(bookRepo.getById(borrowUpdateDTO.getBookId()));
            borrow.setUser(userRepo.getById(borrowUpdateDTO.getUserId()));
            borrowRepo.save(borrow);
            return borrow;
        }
        else {
            System.out.println("BoorowId Not Exist!!!");
        }
        return null;
    }

    @Override
    public String deleteBorrow(int id) {
        if (borrowRepo.existsById(id)) {
            Borrow borrow = borrowRepo.findById(id).get();
            borrowRepo.delete(borrow);
            return "Borrow";
        }
        else {
            System.out.println("Borrow Not Found!!!");
        }
        return null;
    }


}

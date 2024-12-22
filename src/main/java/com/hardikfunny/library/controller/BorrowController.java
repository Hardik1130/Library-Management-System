package com.hardikfunny.library.controller;

import com.hardikfunny.library.dto.*;
import com.hardikfunny.library.entity.Author;
import com.hardikfunny.library.entity.Book;
import com.hardikfunny.library.entity.User;
import com.hardikfunny.library.entity.Borrow;
import com.hardikfunny.library.entity.Publisher;
import com.hardikfunny.library.service.BorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/borrow")
public class BorrowController {

    @Autowired
    private BorrowService borrowService;

    //For Saving The Borrows
    @PostMapping(value = "/saveBorrow")
    public String addBorrow(@RequestBody BorrowSaveDTO bookSaveDTO)
    {
        Borrow borrow = borrowService.addBorrow(bookSaveDTO);
        Book book = borrow.getBook();
        User user = borrow.getUser();
        return  "Borrow Added SuccessFully"+ " with BookName: "+book.getBookTitle()+ " and with User: "+user.getUserName();
    }

    //Retrieve Method - Retrieve All the Borrows
    @GetMapping(value = "/getAllBorrows")
    public List<Borrow> getAllBorrows()
    {
        return borrowService.getAllBorrows();
    }


    //UpDate The Borrow - Save The Updated Data
    @PutMapping(value = "/updateBorrow")
    public String updateBorrow(@RequestBody BorrowUpdateDTO borrowUpdateDTO)
    {
        Borrow borrow = borrowService.updateBorrow(borrowUpdateDTO);
        Book book = borrow.getBook();
        User user = borrow.getUser();
        return "Borrow Updated SuccessFully"+ " with BookName: "+book.getBookTitle()+ " and with UserName: "+user.getUserName();
    }

    //Delete The Borrow - Delete The Borrow
    @DeleteMapping(value = "/deleteBorrow/{id}")
    public String deleteAuthor(@PathVariable(value = "id") int id)
    {
        String borrow = borrowService.deleteBorrow(id);
        return borrow+" Deleted SucessFully";
//        String authorName = authorService.deleteAuthor(id);
//        return authorName+" Deleted SuccessFully";
    }




}

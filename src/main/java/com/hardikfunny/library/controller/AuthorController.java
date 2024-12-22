package com.hardikfunny.library.controller;

import com.hardikfunny.library.dto.AuthorDTO;
import com.hardikfunny.library.dto.AuthorSaveDTO;
import com.hardikfunny.library.dto.AuthorUpdateDTO;
import com.hardikfunny.library.entity.Author;
import com.hardikfunny.library.repo.AuthorRepo;
import com.hardikfunny.library.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/author")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    //Save Method- Saving The Author
    @PostMapping(value = "/saveAuthor")
    public String saveAuthor(@RequestBody AuthorSaveDTO authorSaveDTO)
    {
        Author author = authorService.addAuthor(authorSaveDTO);
        return  author.getAuthorName()+" Added SuccessFully";
    }

    //Retrieve Method - Retrieve All the Authors
    @GetMapping(value = "/getAllAuthors")
    public List<AuthorDTO> getAllAuthors()
    {
        return authorService.getAllAuthors();
    }

    //UpDate The Author - Save The Updated Data
    @PutMapping(value = "/updateAuthor")
    public String updateAuthor(@RequestBody AuthorUpdateDTO authorUpdateDTO)
    {
        return authorService.updateAuthor(authorUpdateDTO)+ " Updated SuccessFully";
    }

    //Delete The Author - Delete The Author and The book
    @DeleteMapping(value = "/deleteAuthor/{id}")
    public String deleteAuthor(@PathVariable(value = "id") int id)
    {
        String authorName = authorService.deleteAuthor(id);
        return authorName+" Deleted SuccessFully";
    }

}

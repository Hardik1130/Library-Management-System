package com.hardikfunny.library.service;

import com.hardikfunny.library.dto.AuthorDTO;
import com.hardikfunny.library.dto.AuthorSaveDTO;
import com.hardikfunny.library.dto.AuthorUpdateDTO;
import com.hardikfunny.library.entity.Author;

import java.util.List;


public interface AuthorService {

    public Author addAuthor(AuthorSaveDTO authorSaveDTO);

    List<AuthorDTO> getAllAuthors();

    String updateAuthor(AuthorUpdateDTO authorUpdateDTO);

    String deleteAuthor(int id);
}

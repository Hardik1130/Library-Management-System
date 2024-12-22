package com.hardikfunny.library.service.IMPL;

import com.hardikfunny.library.dto.AuthorDTO;
import com.hardikfunny.library.dto.AuthorSaveDTO;
import com.hardikfunny.library.dto.AuthorUpdateDTO;
import com.hardikfunny.library.entity.Author;
import com.hardikfunny.library.repo.AuthorRepo;
import com.hardikfunny.library.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AuthorServiceIMPL implements AuthorService {

    @Autowired
    private AuthorRepo authorRepo;

    @Override
    public Author addAuthor(AuthorSaveDTO authorSaveDTO)
    {
        Author author = new Author(authorSaveDTO.getAuthorName());
        authorRepo.save(author);
        return author;
    }

    @Override
    public List<AuthorDTO> getAllAuthors() {
        List<Author> authors = authorRepo.findAll();
        List<AuthorDTO> authorDTOList = new ArrayList<>();
        for (Author author : authors)
        {
            AuthorDTO authorDTO = new AuthorDTO(author.getAuthorId(),author.getAuthorName());
            authorDTOList.add(authorDTO);
        }
        return authorDTOList;
    }

    public String updateAuthor(AuthorUpdateDTO authorUpdateDTO)
    {
//        Author author = authorRepo.findById(authorUpdateDTO.getAuthorId()).get();

        if (authorRepo.existsById(authorUpdateDTO.getAuthorId())) {
            Author author = authorRepo.getById(authorUpdateDTO.getAuthorId());
            author.setAuthorName(authorUpdateDTO.getAuthorName());
            authorRepo.save(author);
            return author.getAuthorName();
        }
        else {
            System.out.println("AuthorId Not Exist!!!");
        }

        return null;
    }

    @Override
    public String deleteAuthor(int id) {
        if (authorRepo.existsById(id)) {
            Author author = authorRepo.findById(id).get();
            authorRepo.deleteById(id);
            return author.getAuthorName();
        }
        else {
            System.out.println("Author Not Found!!!");
        }
        return null;
    }

}

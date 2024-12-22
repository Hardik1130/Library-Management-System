package com.hardikfunny.library.controller;

import com.hardikfunny.library.dto.*;
import com.hardikfunny.library.entity.Publisher;
import com.hardikfunny.library.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/publisher")
public class PublisherController {

    @Autowired
    private PublisherService publisherService;

    //Save Method- Saving The Author
    @PostMapping(value = "/savePublisher")
    public String savePublisher(@RequestBody PublisherSaveDTO publisherSaveDTO)
    {
        Publisher publisher = publisherService.addPublisher(publisherSaveDTO);
        return publisher.getPublisherName()+" Added SuccessFully";
    }

    //Retrieve Method - Retrieve All the Authors
    @GetMapping(value = "/getAllPublishers")
    public List<PublisherDTO> getAllPublisher()
    {
        return publisherService.getAllPublishers();
    }

    //UpDate The Author - Merge The Updated Data
    @PutMapping(value = "/updatePublisher")
    public String updatePublisher(@RequestBody PublisherUpdateDTO publisherUpdateDTO)
    {
        return publisherService.updatePublisher(publisherUpdateDTO)+ " Updated SuccessFully";
    }

    //Delete The Publisher - Delete The Publisher and The book
    @DeleteMapping(value = "/deletePublisher/{id}")
    public String deleteAuthor(@PathVariable(value = "id") int id)
    {
        String publisherName = publisherService.deletePublisher(id);
        return publisherName+" Deleted SuccessFully";
    }

}

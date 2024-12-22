package com.hardikfunny.library.service;

import com.hardikfunny.library.dto.PublisherDTO;
import com.hardikfunny.library.dto.PublisherSaveDTO;
import com.hardikfunny.library.dto.PublisherUpdateDTO;
import com.hardikfunny.library.entity.Publisher;

import java.util.List;

public interface PublisherService {


    Publisher addPublisher(PublisherSaveDTO publisherSaveDTO);

    List<PublisherDTO> getAllPublishers();

    String updatePublisher(PublisherUpdateDTO publisherUpdateDTO);

    String deletePublisher(int id);
}

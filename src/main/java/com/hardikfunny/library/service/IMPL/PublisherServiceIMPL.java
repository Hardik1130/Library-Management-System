package com.hardikfunny.library.service.IMPL;

import com.hardikfunny.library.dto.PublisherDTO;
import com.hardikfunny.library.dto.PublisherSaveDTO;
import com.hardikfunny.library.dto.PublisherUpdateDTO;
import com.hardikfunny.library.entity.Publisher;
import com.hardikfunny.library.repo.PublisherRepo;
import com.hardikfunny.library.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PublisherServiceIMPL implements PublisherService {

    @Autowired
    private PublisherRepo publisherRepo;

    public Publisher addPublisher(PublisherSaveDTO publisherSaveDTO)
    {
        Publisher publisher = new Publisher(publisherSaveDTO.getPublisherName());
        publisherRepo.save(publisher);
        return publisher;
    }

    @Override
    public List<PublisherDTO> getAllPublishers() {
        List<Publisher> publishers =  publisherRepo.findAll();
        List<PublisherDTO> publisherDTOList = new ArrayList<>();
        for (Publisher publisher : publishers)
        {
            PublisherDTO publisherDTO = new PublisherDTO(publisher.getPublisherId(),publisher.getPublisherName());
            publisherDTOList.add(publisherDTO);
        }
        return publisherDTOList;
    }

    @Override
    public String updatePublisher(PublisherUpdateDTO publisherUpdateDTO) {
            if (publisherRepo.existsById(publisherUpdateDTO.getPublisherId()))
            {
                Publisher  publisher = publisherRepo.getById(publisherUpdateDTO.getPublisherId());
                publisher.setPublisherName(publisherUpdateDTO.getPublisherName());
                publisherRepo.save(publisher);
                return publisher.getPublisherName();
            }
            else {
                System.out.println("PublisherId Not Exist!!!");
            }
            return null;
    }

    @Override
    public String deletePublisher(int id) {

        if (publisherRepo.existsById(id)) {
            Publisher publisher = publisherRepo.findById(id).get();
            publisherRepo.delete(publisher);
            return publisher.getPublisherName();
        }
        else {
            System.out.println("Publisher Not Found!!!");
        }
        return null;

    }


}

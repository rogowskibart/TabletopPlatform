package com.example.tabletopplatform.services;

import com.example.tabletopplatform.api.v1.mapper.PublisherMapper;
import com.example.tabletopplatform.api.v1.model.PublisherDTO;
import com.example.tabletopplatform.repositories.PublisherRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PublisherServiceImpl implements PublisherService {

    private final PublisherMapper publisherMapper;
    private final PublisherRepository publisherRepository;

    public PublisherServiceImpl(PublisherMapper publisherMapper, PublisherRepository publisherRepository) {
        this.publisherMapper = publisherMapper;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public List<PublisherDTO> getAllPublishers() {
        return publisherRepository.findAll()
                .stream()
                .map(publisherMapper::publisherToPublisherDTO)
                .collect(Collectors.toList());
    }

    @Override
    public PublisherDTO getPublisherByName(String name) {
        return publisherMapper.publisherToPublisherDTO(publisherRepository.findByName(name));
    }
}

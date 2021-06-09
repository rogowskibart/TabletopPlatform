package com.example.tabletopplatform.services;

import com.example.tabletopplatform.api.v1.model.PublisherDTO;

import java.util.List;

public interface PublisherService {

    List<PublisherDTO> getAllPublishers();

    PublisherDTO getPublisherByName(String name);
}

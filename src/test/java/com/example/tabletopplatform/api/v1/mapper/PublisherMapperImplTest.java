package com.example.tabletopplatform.api.v1.mapper;

import com.example.tabletopplatform.api.v1.model.PublisherDTO;
import com.example.tabletopplatform.domain.Publisher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PublisherMapperImplTest {

    public static final String NAME = "Days of wonder";
    public static final long ID = 1L;
    PublisherMapper publisherMapper = PublisherMapper.INSTANCE;

    @Test
    public void publisherToPublisherDTO() throws Exception {

        //given
        Publisher publisher = new Publisher();
        publisher.setName(NAME);
        publisher.setId(ID);

        //when
        PublisherDTO publisherDTO = publisherMapper.publisherToPublisherDTO(publisher);

        //then
        assertEquals(Long.valueOf(ID), publisherDTO.getId());
        assertEquals(NAME, publisherDTO.getName());
    }
}

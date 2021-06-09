package com.example.tabletopplatform.services;

import com.example.tabletopplatform.api.v1.mapper.PublisherMapper;
import com.example.tabletopplatform.api.v1.model.PublisherDTO;
import com.example.tabletopplatform.domain.Publisher;
import com.example.tabletopplatform.repositories.PublisherRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class PublisherServiceTest {

    public static final String NAME = "Days of wonder";
    public static final long ID = 1L;
    PublisherService publisherService;

    @Mock
    PublisherRepository publisherRepository;

    @BeforeEach
    public void setUp() {
        publisherService = new PublisherServiceImpl(PublisherMapper.INSTANCE, publisherRepository);
    }

    @Test
    void getAllPublishers() {

        //given
        List<Publisher> publishers = Arrays.asList(new Publisher(), new Publisher(), new Publisher());

        when(publisherRepository.findAll()).thenReturn(publishers);

        //when
        List<PublisherDTO> publisherDTOS = publisherService.getAllPublishers();

        //then
        assertEquals(3, publisherDTOS.size());
    }

    @Test
    void getPublisherByName() {

        //given
        Publisher publisher = new Publisher();
        publisher.setName(NAME);
        publisher.setId(ID);

        when(publisherRepository.findByName(anyString())).thenReturn(publisher);

        //when
        PublisherDTO publisherDTO = publisherService.getPublisherByName(NAME);

        //then
        assertEquals(ID, publisherDTO.getId());
        assertEquals(NAME, publisherDTO.getName());
    }
}
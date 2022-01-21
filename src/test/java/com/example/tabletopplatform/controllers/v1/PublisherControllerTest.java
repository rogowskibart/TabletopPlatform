package com.example.tabletopplatform.controllers.v1;

import com.example.tabletopplatform.api.v1.model.PublisherDTO;
import com.example.tabletopplatform.controllers.RestResponseEntityExceptionHandler;
import com.example.tabletopplatform.services.PublisherService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(MockitoExtension.class)
class PublisherControllerTest {

    public static final String NAME_1 = "Days of wonder";
    public static final long ID_1 = 1L;
    public static final String NAME_2 = "Alea";
    public static final long ID_2 = 2L;
    @Mock
    PublisherService publisherService;

    @InjectMocks
    PublisherController publisherController;

    MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(publisherController)
                .setControllerAdvice(new RestResponseEntityExceptionHandler())
                .build();
    }

    @Test
    public void testListPublishers() throws Exception {
        PublisherDTO publisher1 = new PublisherDTO();
        publisher1.setId(ID_1);
        publisher1.setName(NAME_1);

        PublisherDTO publisher2 = new PublisherDTO();
        publisher2.setId(ID_2);
        publisher2.setName(NAME_2);

        List<PublisherDTO> publishers = Arrays.asList(publisher1, publisher2);

        when(publisherService.getAllPublishers()).thenReturn(publishers);

        mockMvc.perform(get("/api/v1/publishers/")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.publishers", hasSize(2)));

    }

    @Test
    public void testGetPublisherByName() throws Exception {
        PublisherDTO publisher = new PublisherDTO();
        publisher.setId(ID_1);
        publisher.setName(NAME_1);

        when(publisherService.getPublisherByName(anyString())).thenReturn(publisher);

        mockMvc.perform(get("/api/v1/publishers/" + NAME_1)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", equalTo(NAME_1)));
    }
}
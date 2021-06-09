package com.example.tabletopplatform.controllers.v1;

import com.example.tabletopplatform.api.v1.model.PublisherDTO;
import com.example.tabletopplatform.api.v1.model.PublisherListDTO;
import com.example.tabletopplatform.services.PublisherService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/publishers/")
public class PublisherController {

    private final PublisherService publisherService;

    public PublisherController(PublisherService publisherService) {
        this.publisherService = publisherService;
    }

    @GetMapping
    public ResponseEntity<PublisherListDTO> getAllPublishers() {
        return new ResponseEntity<PublisherListDTO>(new PublisherListDTO(publisherService.getAllPublishers()), HttpStatus.OK);
    }

    @GetMapping("{name}")
    public ResponseEntity<PublisherDTO> getPublisherByName(@PathVariable String name) {
        return new ResponseEntity<PublisherDTO>(
                publisherService.getPublisherByName(name), HttpStatus.OK
        );
    }
}

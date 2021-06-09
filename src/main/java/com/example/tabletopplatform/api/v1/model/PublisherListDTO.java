package com.example.tabletopplatform.api.v1.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class PublisherListDTO {
    private List<PublisherDTO> publishers;
}

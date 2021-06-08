package com.example.tabletopplatform.api.v1.mapper;

import com.example.tabletopplatform.api.v1.model.PublisherDTO;
import com.example.tabletopplatform.domain.Publisher;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PublisherMapper {

    PublisherMapper INSTANCE = Mappers.getMapper(PublisherMapper.class);

    PublisherDTO publisherToPublisherDTO(Publisher publisher);
}

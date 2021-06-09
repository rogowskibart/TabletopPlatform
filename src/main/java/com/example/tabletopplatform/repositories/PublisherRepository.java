package com.example.tabletopplatform.repositories;

import com.example.tabletopplatform.domain.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {

    Publisher findByName(String name);

}

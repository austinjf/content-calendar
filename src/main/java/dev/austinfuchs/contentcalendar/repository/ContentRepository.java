package dev.austinfuchs.contentcalendar.repository;

import dev.austinfuchs.contentcalendar.model.Content;
import org.springframework.data.repository.ListCrudRepository;

public interface ContentRepository extends ListCrudRepository<Content, Integer> {
}

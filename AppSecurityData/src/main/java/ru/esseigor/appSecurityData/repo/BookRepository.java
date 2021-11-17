package ru.esseigor.appSecurityData.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ru.esseigor.appSecurityData.model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
	List<Book> findByTitle(String title);
}
package mk.finki.ukim.wp.lab.service;

import mk.finki.ukim.wp.lab.model.Author;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

public interface AuthorService {

    List<Author> listAuthors();
    Author findById(Long id);

    void save(String name, String surname, String biography, LocalDate dateOfBirth);
}

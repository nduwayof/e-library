package edu.mum.cs.cs425.demos.elibrarydemocrudweb.service;

import edu.mum.cs.cs425.demos.elibrarydemocrudweb.model.Book;
import org.springframework.data.domain.Page;

import java.util.List;

public interface BookService {

    Page<Book> getAllBooksPaged(int pageNo);
    void saveBook(Book book);
    Book getBookById(Integer bookId);
    void deleteBookById(Integer bookId);
    Page<Book> findBooksByTitle(int page, String title);
}

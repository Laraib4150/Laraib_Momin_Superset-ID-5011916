package com.mansoor.bookstoreapi.service;

import com.mansoor.bookstoreapi.dto.BookDTO;
import com.mansoor.bookstoreapi.exception.ResourceNotFoundException;
import com.mansoor.bookstoreapi.mapper.BookMapper;
import com.mansoor.bookstoreapi.model.Book;
import com.mansoor.bookstoreapi.repository.BookRepository;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BookServiceImpl implements BookService {


    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book findById(Long id) {
        return bookRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Book not found with id " + id));
    }

    private final List<Book> books = new ArrayList<>();

    @Override
    public List<BookDTO> getAllBooks() {
        return books.stream()
                    .map(BookMapper.INSTANCE::toDTO)
                    .collect(Collectors.toList());
    }

    @Override
    public Optional<BookDTO> getBookById(Long id) {
        return books.stream()
                    .filter(book -> book.getId().equals(id))
                    .map(BookMapper.INSTANCE::toDTO)
                    .findFirst();
    }

    @Override
    public BookDTO createBook(BookDTO bookDTO) {
        Book book = BookMapper.INSTANCE.toEntity(bookDTO);
        books.add(book);
        return BookMapper.INSTANCE.toDTO(book);
    }

    @Override
    public BookDTO updateBook(Long id, BookDTO updatedBookDTO) {
        Book updatedBook = BookMapper.INSTANCE.toEntity(updatedBookDTO);
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getId().equals(id)) {
                books.set(i, updatedBook);
                return BookMapper.INSTANCE.toDTO(updatedBook);
            }
        }
        return null;
    }

    @Override
    public boolean deleteBook(Long id) {
        return books.removeIf(book -> book.getId().equals(id));
    }

}

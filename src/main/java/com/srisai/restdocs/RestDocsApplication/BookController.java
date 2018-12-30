package com.srisai.restdocs.RestDocsApplication;

import com.srisai.restdocs.RestDocsApplication.domain.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @GetMapping("/book/{id}")
    public Book getBook(@PathVariable Long id) {

        Book book = new Book();
        book.setId( 1 );
        book.setBookName( "Srisai Charitra" );
        book.setAuthor( "Jayakar" );

        return book;
    }
}

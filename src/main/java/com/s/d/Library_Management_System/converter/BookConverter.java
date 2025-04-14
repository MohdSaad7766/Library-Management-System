package com.s.d.Library_Management_System.converter;

import com.s.d.Library_Management_System.enums.Category;
import com.s.d.Library_Management_System.enums.Edition;
import com.s.d.Library_Management_System.model.Book;
import com.s.d.Library_Management_System.requestdto.BookDto;

import java.time.LocalDate;
import java.util.UUID;

public class BookConverter {
    public static Book bookConverter(BookDto bookDto){
        Book book = new Book();

        book.setTitle(bookDto.getTitle());
        book.setPages(bookDto.getPages());
        book.setPublisherName(bookDto.getPublisherName());
        book.setPublishedDate(bookDto.getPublishedDate());
        book.setEdition(bookDto.getEdition());
        book.setCategory(bookDto.getCategory());
        book.setCategory(bookDto.getCategory());
        book.setPrice(bookDto.getPrice());
        book.setRackNo(bookDto.getRackNo());
        book.setTotalQuantity(bookDto.getTotalQuantity());
        book.setAvailableQuantity(bookDto.getTotalQuantity());

        return book;
    }
}

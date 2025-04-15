package com.s.d.Library_Management_System.controller;

import com.s.d.Library_Management_System.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookContoller {
    @Autowired
    BookService bookService;
}

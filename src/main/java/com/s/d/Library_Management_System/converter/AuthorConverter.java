package com.s.d.Library_Management_System.converter;

import com.s.d.Library_Management_System.model.Author;
import com.s.d.Library_Management_System.requestdto.AuthorDto;

public class AuthorConverter {
    public static Author authorConverter(AuthorDto authorDto){
        Author author = new Author();

        author.setName(authorDto.getName());
        author.setEmail(authorDto.getEmail());
        author.setGender(authorDto.getGender());
        author.setCountry(authorDto.getCountry());
        author.setRating(authorDto.getRating());

        return author;
    }
}

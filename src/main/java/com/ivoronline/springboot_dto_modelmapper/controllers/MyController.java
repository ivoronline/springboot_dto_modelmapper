package com.ivoronline.springboot_dto_modelmapper.controllers;

import com.ivoronline.springboot_dto_modelmapper.DTOs.AuthorBookDTO;
import com.ivoronline.springboot_dto_modelmapper.entities.Author;
import com.ivoronline.springboot_dto_modelmapper.entities.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

  @ResponseBody
  @RequestMapping("addAuthorBook")
  public String addAuthorBook(@RequestBody AuthorBookDTO authorBookDTO) {

    //CONVERT DTO TO AUTHOR ENTITY
    Author  author      = new Author();
            author.name = authorBookDTO.name;
            author.age  = authorBookDTO.age;

    //CONVERT DTO TO BOOK ENTITY
    Book    book        = new Book();
            book.title  = authorBookDTO.title;

    //RETURN SOMETHING
    return author.name + " has written " + book.title;

  }

}











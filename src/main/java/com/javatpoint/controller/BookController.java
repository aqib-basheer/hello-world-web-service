package com.javatpoint.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.javatpoint.Books;
import org.springframework.web.bind.annotation.*;

import java.io.FileReader;
import java.util.List;

@RestController
@RequestMapping(path = "/books")
public class BookController {

    @GetMapping
    public List<Books> getBooks()
    {
        List<Books> books = null;
        //read from books.jl n return
//        JSONParser jsonP = new JSONParser();
//        try {
//            JSONObject jsonO = (JSONObject) jsonP.parse(new FileReader("/book.jl"));
//
//            String name = (String) jsonO.get("title");
//            String age = (String) jsonO.get("author");
//            String publisher = (String) jsonO.get("publisher");
//            String ISBN = (String) jsonO.get("ISBN");
//            String publishDate = (String) jsonO.get("publishDate");
//            System.out.println("Title:" + title);
//            System.out.println("Author: " + author);
//            System.out.println("publisher: " + publisher);
//            System.out.println("ISBN: " + ISBN);
//            System.out.println("publishDate: " + publishDate);
//        }
//            catch (FileNotFoundException e) {
//                e.printStackTrace();
//            } catch (IOException e) {
//                e.printStackTrace();
//            } catch (ParseException e) {
//                e.printStackTrace();
//            }
            return books;
    }

    @PostMapping
    public String addBook(@RequestBody Books books){
        // add books object in the books.jl
        return "added book successfully";
    }
}

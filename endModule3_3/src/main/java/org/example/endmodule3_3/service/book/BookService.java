package org.example.endmodule3_3.service;

import org.example.endmodule3_3.model.Book;
import org.example.endmodule3_3.repository.BookRepo;

import java.util.List;

public class BookService implements IBookService{
    BookRepo bookRepo = new BookRepo();
    @Override
    public List<Book> sellectAll() {
      return bookRepo.sellectAll();
    }

    @Override
    public Book findByID(int id) {
        return bookRepo.findByID(id);
    }
}

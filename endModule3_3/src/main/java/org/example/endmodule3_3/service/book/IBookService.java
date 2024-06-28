package org.example.endmodule3_3.service;

import org.example.endmodule3_3.model.Book;

import java.util.List;

public interface IBookService {
    List<Book> sellectAll();
    Book findByID(int id);
}

package org.example.endmodule3_3.repository;

import org.example.endmodule3_3.model.Book;

import java.util.List;

public interface IBookRepo {
    List<Book> sellectAll();

    Book findByID(int id);
}

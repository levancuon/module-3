package org.example.endmodule3_3.repository;

import org.example.endmodule3_3.database.DbConnect;
import org.example.endmodule3_3.model.Book;

import java.lang.reflect.Parameter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookRepo implements IBookRepo {
    Connection connection = new DbConnect().getConnection();
    @Override
    public List<Book> sellectAll() {
        List<Book> bookList = new ArrayList<>();
        try {
            String sql = "select * from book;";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Book book = new Book();
                book.setBook_id(rs.getInt("book_id"));
                book.setBook_name(rs.getString("book_name"));
                book.setBook_author(rs.getString("book_author"));
                book.setBook_description(rs.getString("book_description"));
                book.setBook_quantity(rs.getInt("book_quantity"));
                bookList.add(book);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return bookList;
    }

    @Override
    public Book findByID(int id) {
        try {
            String sql = "select * from book where id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            ResultSet rs = preparedStatement.executeQuery();
            Book book = new Book();
            while(rs.next()){
                book.setBook_id(rs.getInt("book_id"));
                book.setBook_name(rs.getString("book_name"));
                book.setBook_author(rs.getString("book_author"));
                book.setBook_description(rs.getString("book_description"));
                book.setBook_quantity(rs.getInt("book_quantity"));
                return book;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}

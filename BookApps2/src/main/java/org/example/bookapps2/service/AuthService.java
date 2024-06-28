package org.example.bookapps2.model;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AuthService {
    public void renderPageLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher out = request.getRequestDispatcher("/views/auth/login.jsp");
        out.forward(request, response);
    }
    public void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher out = request.getRequestDispatcher("/views/auth/login.jsp");
        out.forward(request, response);
    }

}

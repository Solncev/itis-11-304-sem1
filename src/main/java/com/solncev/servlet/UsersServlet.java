package com.solncev.servlet;

import com.solncev.dao.UserDao;
import com.solncev.dao.impl.UserDaoImpl;
import com.solncev.dto.UserDto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "usersServlet", urlPatterns = "/users")
public class UsersServlet extends HttpServlet {

    private final UserDao userDao = new UserDaoImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("users", userDao.getAll());
        req.getRequestDispatcher("users.ftl").forward(req, resp);
    }
}

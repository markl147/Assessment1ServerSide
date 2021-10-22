package com.example.assessment.controller;

import com.example.assessment.model.House;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "HouseServlet", value = "/HouseServlet")
public class HouseServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");

        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String numRooms = request.getParameter("numRooms");

        if(name.equals(""))
            name = null;

        if(address.equals(""))
            address = null;

        if(numRooms.equals(""))
            numRooms = null;

        House h1 = new House(name, address, numRooms);

        request.setAttribute("myHouse", h1);
        request.getRequestDispatcher("ShowHouse.jsp").forward(request, response);
    }

    public void destroy() {
    }
}
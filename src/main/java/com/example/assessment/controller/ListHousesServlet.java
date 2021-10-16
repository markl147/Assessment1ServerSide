package com.example.assessment.controller;

import com.example.assessment.House;
import com.example.assessment.dao.HouseDAO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ListHousesServlet", value = "/ListHousesServlet")
public class ListHousesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");

        HouseDAO hdao = new HouseDAO();

        request.setAttribute("myHouseList", hdao.houses());
        request.getRequestDispatcher("listHouses.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");

        HouseDAO hdao = new HouseDAO();
        String owner = request.getParameter("owner");
        String address = request.getParameter("address");
        String numRooms = request.getParameter("numRooms");

        if(owner == "")
            owner = null;

        if(address == "")
            address = null;

        if(numRooms == "")
            numRooms = null;

        House newEntry = new House(owner, address, numRooms);
        hdao.addNewHouse(newEntry);

        request.setAttribute("myHouseList", hdao.houses());
        request.getRequestDispatcher("listHouses.jsp").forward(request, response);
    }
}

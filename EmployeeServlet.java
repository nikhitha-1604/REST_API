package com.cseb.sevlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import ebook.EmployeeDAO;
import ebook.Employee;
import java.util.*;

@WebServlet("/employee")
public class EmployeeServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h1>Employee Servlet Working </h1>");
        EmployeeDAO dao = new EmployeeDAO();
        List<Employee> list = dao.getEmployees();

        out.println("<h1>Employee List</h1>");
        out.println("<h1> Total:" +list.size()+"</h1>");

       
        for(Employee e : list){
            out.println("<p>" + e.getId() + " - " + e.getName() + "</p>");
        }
    }
}


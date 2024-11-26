package gr.perisnik.cjweb.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentController
 * 
 * Handles HTTP GET requests for retrieving student information.
 * 
 * @author Peris Nik
 */
@WebServlet(name = "StudentController", value = "/get-student")
public class StudentController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * Handles the HTTP GET request.
     *
     * @param request  the HttpServletRequest object that contains the request the client has made of the servlet
     * @param response the HttpServletResponse object that contains the response the servlet sends to the client
     * @throws ServletException if the request for the GET could not be handled
     * @throws IOException      if an input or output error is detected when the servlet handles the GET request
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set the content type of the response to HTML and specify UTF-8 character encoding
        response.setContentType("text/html; charset=UTF-8");
        
        // Define the student's first name and last name
        String firstname = "Alice";
        String lastname = "White";
        
        // Set the first name and last name as request attributes
        request.setAttribute("firstname", firstname);
        request.setAttribute("lastname", lastname);
        
        // Forward the request to the student.jsp page
        RequestDispatcher rd = request.getRequestDispatcher("/student.jsp");
        rd.forward(request, response);
    }
}
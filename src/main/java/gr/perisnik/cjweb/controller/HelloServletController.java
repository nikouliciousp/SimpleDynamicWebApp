package gr.perisnik.cjweb.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServletController
 * 
 * @author Peris Nik
 */
@WebServlet("/hello-servlet")
public class HelloServletController extends HttpServlet {
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
        
        // Define the message to be displayed
        String message = "Hello from Servlet!";
        
        // Get the PrintWriter object to send the response to the client
        PrintWriter out = response.getWriter();
        // Write the HTML content to the response
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }
}
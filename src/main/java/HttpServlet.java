

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HttpServlet")
public class HttpServlet extends javax.servlet.http.HttpServlet {
 private static final long serialVersionUID = 1L;
       
    
 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  PrintWriter out = response.getWriter();
  response.setContentType("text/html");
  out.println("Hello World");
  out.println("<font face=\"arial\" size=\"5\" color=\"red\">Good Morning</font>");
  
 }
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  // TODO Auto-generated method stub
  doGet(request, response);
 }

}
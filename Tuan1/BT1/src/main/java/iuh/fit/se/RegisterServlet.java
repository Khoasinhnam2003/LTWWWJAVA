package iuh.fit.se;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "registerServlet", urlPatterns = {"/register"})
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/plain");
        PrintWriter writer = resp.getWriter();

        writer.println("Resgister Data Form");
        writer.println("Name: " + req.getParameter("name"));
        writer.println("Email: " + req.getParameter("email"));
        writer.println("Password: " + req.getParameter("password"));
        writer.println("Facebook: " + req.getParameter("facebook"));
        writer.println("Short Bio: " + req.getParameter("short bio"));

        writer.close();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/plain");
        PrintWriter writer = resp.getWriter();

        writer.println("Resgister Data Form - GET");
        writer.println("Name: " + req.getParameter("name"));
        writer.println("Email: " + req.getParameter("email"));
        writer.println("Password: " + req.getParameter("password"));
        writer.println("Facebook: " + req.getParameter("facebook"));
        writer.println("Short Bio: " + req.getParameter("short bio"));

        writer.close();
    }
}

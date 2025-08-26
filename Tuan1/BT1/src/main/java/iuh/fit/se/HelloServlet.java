package iuh.fit.se;

import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        response.setContentType("text/html");
        response.setContentType("application/json");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<h1>  init-Param-username: " + this.getServletConfig().getInitParameter("username") + "</h1>");
        out.println("<h1>  init-Param-email: " + this.getServletConfig().getInitParameter("email") + "</h1>");
        out.println("<h1>  context-Param: " + this.getServletContext().getInitParameter("appName") + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}
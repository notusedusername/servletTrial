package main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "simpleServlet")
public class SimpleServlet extends HttpServlet {
    private static final long serialVersionUID = -4751096228274971485L;

    @Override
    protected void doGet(HttpServletRequest reqest, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().println("<h1>Autistic Screeching (up there)</h1>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String username = request.getParameter("uname");
        String password = request.getParameter("password");
        if (username.equals("aa") && password.equals("d")) {
            response.getWriter().println("<h1>Login Success!</h1>");
            response.getWriter().println("<p>Welcome " + username + "!</p");
            response.getWriter().println("<p>Your password is: " + password + ".</p>");
        } else {
            response.getWriter().println("<h1>Gotcha n00b</h1>");
        }
    }

    @Override
    public void init() throws ServletException {
        System.out.println("Servlet " + this.getServletName() + " has started");
    }

    @Override
    public void destroy() {
        System.out.println("Servlet " + this.getServletName() + " has stopped");
    }
}
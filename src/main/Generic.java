package main;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

public class Generic extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.setContentType("text/html");
        servletResponse.getWriter().println("<html>");
        servletResponse.getWriter().println("<body>");
        servletResponse.getWriter().println("<p>Welcome to generic servlet example!</p>");
        servletResponse.getWriter().println("</body>");
        servletResponse.getWriter().println("</html>");

    }
}

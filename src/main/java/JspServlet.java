import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "jspServlet", value = "/jsp_servlet")
public class JspServlet extends HttpServlet {
    public void init(){

    }

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        // Rediriger vers la JSP
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}

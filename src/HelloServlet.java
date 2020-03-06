import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        try {
            writer.println(
                    " <head>\n" +
                    "  <meta charset=\"utf-8\">\n" +
                    "  <title>Тег INPUT</title>\n" +
                    " </head>\n" +
                    " <body>\n" +
                    "\n" +
                    " <form name=\"Message\" method=\"post\" action=\"input1.php\">\n" +
                    "  <p><b>Your message:</b><br>\n" +
                    "   <input type=\"text\" size=\"40\">\n</p>\n" +
                    "  <p><input type=\"submit\" value=\"Submit\"></p>\n" +
                    " </form>\n" +
                    "\n" +
                    " </body>\n");
        } finally {
            writer.close();
        }
    }
}
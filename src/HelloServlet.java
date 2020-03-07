import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        String message = request.getParameter("message");

        try {
            if (message.trim().isEmpty()){
                response.sendRedirect("http://127.0.0.1:8080/index.jsp");
            }

            try{
                Double d = Double.parseDouble(message);
                writer.println("<p>Message is number: " + (d+1) + "</p>");
            }
            catch (NumberFormatException e){
                String[] words = message.split("\\s+");
                writer.println("<p>Message: "+ message + "</p>");
                writer.println("<p>Number of words: "+ words.length + "</p>");
            }

        } finally {
            writer.close();
        }
    }
}
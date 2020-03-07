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

        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        String message = request.getParameter("message");

        try {
            if (message.trim().isEmpty()){
                request.setAttribute("msg", "Try again (Попробуйте еще раз)");
                request.getRequestDispatcher("index.jsp").forward(request,response);
            }

            try{
                int i= Integer.parseInt(message);
                writer.println("<p>Message is number: " + (i+1) + "</p>");

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
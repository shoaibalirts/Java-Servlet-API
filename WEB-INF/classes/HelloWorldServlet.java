import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;


public class HelloWorldServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        pw.println("<html><body>");
        pw.println("<h1>Hello World</h1>");
        pw.println("</body></html>");
        pw.close();
        // PrintWriter out = res.getWriter();
        // out.println("Hello World");
    }

    public void doPost(){}
}
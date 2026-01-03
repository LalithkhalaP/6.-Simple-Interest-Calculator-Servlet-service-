package interest;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/simpleinterest")
public class SimpleInterestServlet extends HttpServlet {
    
    public void service(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        double P = Double.parseDouble(req.getParameter("principal"));
        double R = Double.parseDouble( req.getParameter("rate"));
        double T = Double.parseDouble(req.getParameter("time"));
   
        double SI = (P * R * T) / 100;
        PrintWriter out = res.getWriter();
        out.println("Simple Interest = " + SI);
    }
}

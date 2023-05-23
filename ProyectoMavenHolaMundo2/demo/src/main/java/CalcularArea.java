
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "CalcularArea", urlPatterns = { "/calculararea" })
public class CalcularArea extends HttpServlet {
    private static final String CONTENT_TYPE = "text/html; charset=UTF-8";

    

    public void init(ServletConfig config) throws ServletException {

        super.init(config);

    }

     

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String var0 = "";
        String var1 = "";
        String var2 = "";
        try {
            var0 = request.getParameter("base");
            var1 = request.getParameter("altura");
            var2 = request.getParameter("enviar");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Float b = Float.parseFloat(var0);
        Float a = Float.parseFloat(var1);

        response.setContentType(CONTENT_TYPE);
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>Servlet2</title></head>");
        out.println("<body>");

        out.println("Área = " + calcularArea(b, a, var2));

        out.println("<p>The servlet has received a GET. This is the reply.</p>");
        out.println("</body></html>");
        out.close();
    }
    private Float calcularArea(Float b, Float a, String q) {
       Float resultado = 0.0f; 
    
       if(q.equals("CalcularRec")) {
            resultado = b * a;
       }else{
            resultado = (b * a) / 2;
       }
       return resultado;
    }

   

}

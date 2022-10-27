import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Hello")
public class Calculate extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();

        String name = "";
        if(request.getParameter("name") != null && !request.getParameter("name").equals("")){
            name = request.getParameter("name");
        }
        String content= "";
        if(request.getParameter("content") != null && !request.getParameter("content").equals("")){
            content = request.getParameter("content");
        }

        out.println(name + "</br>");

        out.println(content);

    }
}

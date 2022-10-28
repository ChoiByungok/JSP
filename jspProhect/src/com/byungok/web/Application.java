package com.byungok.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Application", value = "/Application")
public class Application extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext application = request.getServletContext();
        response.setContentType("text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();

        String v_ = request.getParameter("v");
        String op = request.getParameter("operator");
        int v = 0;
        if(v_ != null && !v_.equals("")){
            v = Integer.parseInt(v_);
        }
        if(op.equals("=")){

            int x = (Integer)application.getAttribute("value");
            int y = v;
            int result = 0;
            String operator = (String)application.getAttribute("op");
            if(operator.equals("+")){
                result = x+y;
            }else{
                result = x-y;
            }
            out.println("결과는: " + result + " 입니다.");
        }else {
            application.setAttribute("value",v);
            application.setAttribute("op",op);
            response.sendRedirect("/application.jsp");
        }

    }
}

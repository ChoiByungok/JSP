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
        HttpSession session = request.getSession();
         Cookie[] cookies = request.getCookies();

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
            int x = 0;
//          int x = (Integer)session.getAttribute("value");
            for(Cookie c : cookies){
                if(c.getName().equals("value")){
                    x = Integer.parseInt(c.getValue());
                    break;
                }
            }
            int y = v;
            int result = 0;
//            String operator = (String)session.getAttribute("op");
            String operator = "";
            for(Cookie c : cookies) {
                if (c.getName().equals("op")) {
                    operator = c.getValue();
                    break;
                }
            }
            if(operator.equals("+")){
                result = x+y;
            }else{
                result = x-y;
            }
            out.println("결과는: " + result + " 입니다.");

        }else {
//            session.setAttribute("value",v);
//            session.setAttribute("op",op);

            Cookie valueCookie = new Cookie("value",String.valueOf(v));
            Cookie opCookie = new Cookie("op",op);
            valueCookie.setPath("/Application");
            opCookie.setPath("/Application");
            response.addCookie(valueCookie);
            response.addCookie(opCookie);
            response.sendRedirect("/application.jsp");
        }

    }
}

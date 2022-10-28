package com.byungok.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Add", value = "/Add")
public class Add extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        int x = 0;
        int y = 0;
        try{
            if(request.getParameter("x") != null && !request.getParameter("x").equals("")){
                x = Integer.parseInt(request.getParameter("x"));
            }
        }catch (NumberFormatException e){
            response.sendRedirect("/calculator.jsp");
        }
        try{
            if(request.getParameter("y") != null && !request.getParameter("y").equals("")){
                y = Integer.parseInt(request.getParameter("y"));
            }
        }catch (NumberFormatException e){
            response.sendRedirect("/calculator.jsp");
        }

        out.println("두 정수의 합은: " + (x+y) + " 입니다.");
    }
}

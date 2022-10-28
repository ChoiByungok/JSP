package com.byungok.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Repeat", value = "/Repeat")
public class Repeat extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();

        int input = 0;
        try{
            if(request.getParameter("input") != null && !request.getParameter("input").equals("")){
                input = Integer.parseInt(request.getParameter("input"));
            }
        }catch (NumberFormatException e){
            response.sendRedirect("/hello.jsp");
        }

        for(int i = 0; i < input; i++){
            out.println((i+1) + " : 안녕하세요</br>");
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

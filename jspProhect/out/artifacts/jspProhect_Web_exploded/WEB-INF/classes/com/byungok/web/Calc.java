package com.byungok.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Calc", value = "/Calc")
public class Calc extends HttpServlet {
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
        int result;
        String x_ = request.getParameter("x");
        String y_ = request.getParameter("y");
        String op = request.getParameter("operator");
        try {
            if ((x_) != null && !x_.equals("")) {
                x = Integer.parseInt(x_);
            }
            if ((y_) != null && !y_.equals("")) {
                y = Integer.parseInt(y_);
            }
        }catch (NumberFormatException e){
            response.sendRedirect("/calculator.jsp");
        }

        if(op.equals("덧셈")){
            result = x+y;
            out.println("두 정수의 합은: " + result + " 입니다.");
        }else {
            result = x-y;
            out.println("두 정수의 차는: " + result + " 입니다.");
        }

    }
}

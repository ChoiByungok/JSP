package com.byungok.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "AddArray", value = "/AddArray")
public class AddArray extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();

        int result = 0;
        String[] nums = request.getParameterValues("num");
        try {
            for (int i = 0; i < nums.length; i++) {
                int num = Integer.parseInt(nums[i]);
                result += num;
            }
        }catch (NumberFormatException e){
            response.sendRedirect("/addarray.jsp");
        }
        out.println("결과는 : " + result + " 입니다.");
    }
}

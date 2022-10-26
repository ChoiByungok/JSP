import database.MemberDatabase;
import member.Member;
import util.Status;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


/*
 * implicitObject project 문제점
 * localhost:8080/session.jsp 경로를 직접 들어가면 로그인하지 않아도 서베이 가능.
 * 불가능하게 만들 수 있을까? 🫠
 * */

@WebServlet(name = "DoSignupServlet", value = "/DoSignupServlet")
public class DoSignupServlet extends HttpServlet {

    static final MemberDatabase database = MemberDatabase.getInstance();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        HttpSession session = request.getSession();

        String uEmail = "";
        if(request.getParameter("uEmail") != null){
            uEmail = request.getParameter("uEmail");
        }
        String uId = "";
        if(request.getParameter("uId") != null){
            uId = request.getParameter("uId");
        }
        String uPw = "";
        if(request.getParameter("uPw") != null){
            uPw = request.getParameter("uPw");
        }
        Member member = database.select(uId);
        if(member == null){ //성공시 database에 동일 uId가 없어서 회원가입 성공
            database.put(uId,new Member(uPw,uEmail));
            session.setAttribute("signup", Status.SUCCESS);
            response.sendRedirect("./login.jsp");
        }else{//실패시 database에 동일한 uId가 있어서 회원가입 실패
            session.setAttribute("signup",Status.FAIL);
            response.sendRedirect("./signup.jsp");
        }

    }
}

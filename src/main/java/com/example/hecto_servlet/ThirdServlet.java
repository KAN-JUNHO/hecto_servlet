package com.example.hecto_servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "third",urlPatterns = {"/third"})
public class ThirdServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("doGet 호출");
//        resp.setContentType("text/html;charset=UTF-8");
//        PrintWriter out = resp.getWriter();
//        out.println("<form action='paramEx' method='post'>n" +
//                "  아이디 : <input type='text' name='userId' /><br>\n" +
//                "    비밀번호 : <input type='text' name='userPwd'><br>\n" +
//                "    <input type='submit' value='전송'>\n" +
//                "</form>");
//        out.close();
        System.out.println("doGet 호출");
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.print("<h1>로그인 폼</h1>");
        out.print("<form action='third' method='POST'> "
                + "아이디 :  <input type='text' name='userId'><br/>"
                + "비밀번호 :   <input type='text' name='userPwd'><br/>"
                + "  <input type='submit' name='로그인'>"
                + " </form>");
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("doPost 호출");
//        String userId = req.getParameter("userId");
//        String userPwd = req.getParameter("userPwd");
//        resp.setContentType("text/html;charset=UTF-8");
//
//        PrintWriter out = resp.getWriter();
//        out.println("userId : "+userId+"<br/>");
//        out.println("userPwd : "+userPwd+"<br/>");
//        out.close();
        System.out.println("doPost 호출");
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.print("<h1>전달 받은 값 출력</h1>");
        String userId = req.getParameter("userId");
        String userPwd = req.getParameter("userPwd");
        out.print("userId : "+userId+"<br/>");
        out.print("userPwd : "+userPwd);
        out.close();
    }
}

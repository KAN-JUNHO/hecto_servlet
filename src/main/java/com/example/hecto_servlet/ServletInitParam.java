package com.example.hecto_servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/initP"},initParams = {@WebInitParam(name = "userId",value ="aaaa")})
public class ServletInitParam extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doget");
        String userId = getInitParameter("userId");
        String userPwd = getInitParameter("userPwd");
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();

        out.println("<html><head></head></html>");
        out.println("아이디 : "+userId+"<br/>");
        out.println("비밀번호 : "+userPwd+"<br/>");
        out.close();
    }
}

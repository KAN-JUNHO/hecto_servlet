package com.example.hecto_servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "second",urlPatterns = {"/second"})
public class SecondServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet 호출");
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.println("<h1>좋은하루!</h1>");
//        out.println("<form action='/second' method='POST'>");
//        out.println("<input type='submit' value='dopost 실행'/>");
//        out.println("</form>");
        out.print("<form action='second' method='POST'> "
                + "  <input type='submit' name='POST!'>"
                + " </form>");
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost 호출");
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.println("<h1>POST 방식으로 호출 됨</h1>");
        out.println("<h3>좋은하루<h3>");
        out.close();
    }
}


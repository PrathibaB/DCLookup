package com.supervalu.home;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/newSearch.do")
public class NewSearchServlet extends HttpServlet
{
   public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
   {
	   req.getSession().invalidate();
       res.sendRedirect("/search.do");
   }
}

package com.supervalu.home;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/search.do")
public class DcLookUpServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/search.jsp").forward(req, res);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String id = req.getParameter("id");
		String dcName=req.getParameter("name");
		
		if (id != "") 
		{
			
			req.getSession().setAttribute("id",id);
			res.sendRedirect("/ret-data.do");
		} 
		else if(dcName!="")
		{
			
			req.getSession().setAttribute("name",dcName);
			res.sendRedirect("/ret-data.do");
		}
		else {
			req.setAttribute("errorMessage", "Locid /Locname cannot be empty!");
			req.getRequestDispatcher("/WEB-INF/views/search.jsp").include(req, res);
			
		}
	}
	
}
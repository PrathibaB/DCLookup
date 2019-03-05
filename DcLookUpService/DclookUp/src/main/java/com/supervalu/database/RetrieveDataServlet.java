package com.supervalu.database;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

@WebServlet(urlPatterns = "/ret-data.do")
public class RetrieveDataServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        DatabaseConnection obj=new DatabaseConnection();
		ResultSet rs = null;
		String id = (String) req.getSession().getAttribute("id");
		String dcName = (String) req.getSession().getAttribute("name");
		
		if (id != null) {
			rs = obj.retrieveUsingId(id);
		} 
		else if (dcName != null) {
			
			rs = obj.retrieveUsingName(dcName);
		}
		try {
			while (rs.next()) {
				
				req.setAttribute("LocId", rs.getString("locid"));
				req.setAttribute("LocName", rs.getString("locname"));
				req.setAttribute("Lcon1", rs.getString("lcon1"));
				req.setAttribute("Phone1", rs.getString("phone1"));
				req.setAttribute("Lcon2", rs.getString("lcon2"));
				req.setAttribute("Phone2", rs.getString("phone2"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		req.getRequestDispatcher("/WEB-INF/views/result.jsp").forward(req, res);
		
	}

	
}


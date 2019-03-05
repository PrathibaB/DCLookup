package com.supervalu.database;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ret-address.do")
public class RetrieveAddressServlet extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		DatabaseConnection obj = new DatabaseConnection();
		ResultSet rs = null;
		// Connection conn=obj.connectToDatabase();
		String id = req.getParameter("id");
		System.out.println(id);
		if (id!="") {
			rs = obj.retrieveAddress(id);

			try {
				while (rs.next()) {
					req.setAttribute("Locid", rs.getString(1));
					req.setAttribute("Street", rs.getString(2));
					req.setAttribute("City", rs.getString(3));
					req.setAttribute("State", rs.getString(4));
					req.setAttribute("Zipcode", rs.getString(5));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			req.getRequestDispatcher("/WEB-INF/views/address.jsp").forward(req, res);

			
		} else {
			req.setAttribute("errorMessage", "Locid cannot be empty!");
			req.getRequestDispatcher("/WEB-INF/views/search.jsp").include(req, res);

			
		}
	}

}

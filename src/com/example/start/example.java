package com.example.start;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class example
 */
@WebServlet("/example")
public class example extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public example() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doGet(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		final PrintWriter out = resp.getWriter();
		out.println("Hello World");
		out.println("bezdim uje");
		super.doGet(req, resp);
	}
}

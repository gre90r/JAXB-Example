package de.gre90r.jaxbdemo.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBException;

import de.gre90r.jaxbdemo.service.BookService;
import de.gre90r.jaxbdemo.service.impl.BookServiceImpl;

public class BookServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private final BookService bookService;
	
	public BookServlet() throws JAXBException {
		
		this.bookService = new BookServiceImpl();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String title = req.getParameter("title");
		String author = req.getParameter("author");
		
		try {
			resp.getWriter().println(bookService.marshalToXmlString(title, author));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

package de.gre90r.jaxbdemo.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import javax.xml.bind.JAXBException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import de.gre90r.jaxbdemo.model.Book;
import de.gre90r.jaxbdemo.service.impl.BookServiceImpl;

class BookServiceTest {

	private static BookService bookService;
	
	@BeforeAll
	static void setup() throws JAXBException {
		bookService = new BookServiceImpl();
	}

	/*******************/
	/* marshalToString */
	/*******************/
	@Test
	void marshalToString() {
		Book book = new Book(1, "Herr der Ringe", "J. R. R. Tolkien", new Date());
		
		String res = bookService.marshalToString(book);
		
		assertTrue(res.contains("<book id="));
		assertTrue(res.contains("<title>"));
		assertTrue(res.contains("<author>"));
		assertFalse(res.contains("<date>")); // transient field
		
		System.out.println(res);
	}


}

package de.gre90r.jaxbdemo.service.impl;

import java.io.StringWriter;
import java.util.Date;
import java.util.Random;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import de.gre90r.jaxbdemo.model.Book;
import de.gre90r.jaxbdemo.service.BookService;

public class BookServiceImpl implements BookService {

	private final JAXBContext jaxbCtx;
	private final Marshaller marshaller;
	private final Random random = new Random();
	
	public BookServiceImpl() throws JAXBException {
		this.jaxbCtx = JAXBContext.newInstance(Book.class);	
		this.marshaller = jaxbCtx.createMarshaller();
		this.marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	}
	
//	@Override
//	public void marshalToXmlFile(Book book) {
//		try {
//			marshaller.marshal(book, new File("./output/book.xml"));
//		} catch (JAXBException e) {
//			e.printStackTrace();
//		}
//	}

	@Override
	public String marshalToString(Book book) {
		StringWriter strWriter = new StringWriter();
		try {
			marshaller.marshal(book, strWriter);
		} catch (JAXBException e) {
			e.printStackTrace();
			return "";
		}
		return strWriter.toString();
	}

	@Override
	public String marshalToXmlString(String title, String author) {
		Book book = new Book();
		book.setId( (long) random.nextInt(100));
		book.setName(title);
		book.setAuthor(author);
		book.setDate(new Date());
		
		return marshalToString(book);
	}

}

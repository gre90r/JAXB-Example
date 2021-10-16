package de.gre90r.jaxbdemo.service;

import de.gre90r.jaxbdemo.model.Book;

public interface BookService {

//	/**
//	 * writes xml from book object into file
//	 * @param book will be written as xml
//	 */
//	void marshalToXmlFile(Book book);
	
	/**
	 * writes xml from book object
	 * @param book will be written as xml
	 * @return xml as string of book
	 */
	String marshalToString(Book book);

	/**
	 * create book xml from title and author
	 * @param title book title
	 * @param author book author
	 * @return book as xml string
	 */
	String marshalToXmlString(String title, String author);
}

package de.gre90r.jaxbdemo.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "book")
@XmlType(propOrder = { "id", "name", "author" }) // define order in which it will be written into XML
public class Book {

	private long id;
	private String name;
	private String author;
	private Date date;
	
	@XmlAttribute
	public void setId(long id) {
		this.id = id;
	}
	
	@XmlElement(name = "title")
	public void setName(String name) {
		this.name = name;
	}
	
	@XmlElement
	public void setAuthor(String author) {
		this.author = author;
	}
	
	@XmlTransient // will not be included in XML
	public void setDate(Date date) {
		this.date = date;
	}

	public Book() {
		super();
	}

	public Book(long id, String name, String author, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.date = date;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public Date getDate() {
		return date;
	}
	
}

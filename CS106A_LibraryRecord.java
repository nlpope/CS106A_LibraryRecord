/**
 * File: CS106A_LibraryRecord.java
 * -------------------------------
 * The CS106A_LibraryRecord class keeps track of
 * the following information for a library book:
 * 1. The title
 * 2. The author
 * 3. The Library of Congress catalog number
 * 4. The publisher
 * 5. The year of publication
 * 6. Whether the book is circulating or noncirculating
 */

import acm.program.*;

public class CS106A_LibraryRecord extends ConsoleProgram
{
	/** Private named constants */
	private String title;
	private String author;
	private String publisher;
	private int yearPublished;
	private static String catalogNumber;
	private boolean circulating;
	
	public CS106A_LibraryRecord(String title,
			String author, String publisher,
			int yearPublished, String catalogNumber,
			boolean circulating
	)
	{
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.yearPublished = yearPublished;
		this.catalogNumber = catalogNumber;
		this.circulating = circulating;
	}
	
	
	public CS106A_LibraryRecord(String title,
			String author, String publisher,
			int yearPublished, int catalogNumber)
	{
		this.circulating = true;
	}
	
	
	public String getTitle()
	{
		return this.title;
	}
	
	
	public String getAuthor()
	{
		return this.author;
	}
	
	
	public String getPublisher()
	{
		return this.publisher;
	}
	
	
	public int getPublicationYear()
	{
		return this.yearPublished;
	}
	
	
	public String getCatalogNumber()
	{
		return this.catalogNumber;
	}
	
	
	public void setCirculationStatus(boolean status)
	{
		this.circulating = status;
	}
	
	
	public String toString()
	{
		String stats = "";
		stats += "Title: " + this.title + "\n";
		stats += "Author: " + this.author + "\n";
		stats += "Catalog Number: " + this.catalogNumber + "\n";
		stats += "Publisher: " + this.publisher + "\n";
		stats += "Year of publication: " + this.yearPublished + "\n";
		stats += "Circulating: " + (this.circulating ? "Yes" : "No");
		
		return stats;
	}
}
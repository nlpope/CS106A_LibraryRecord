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
 * 
 * Note: this class extends nothing so by default it's just
 * an object.
 */

public class CS106A_LibraryRecord
{
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
	
	/** Private named constants */
	private String title; /** The book's title */
	private String author; /** The book's author */
	private String publisher; /** The book's publisher */
	private int yearPublished; /** The year the book was published */
	private static String catalogNumber; /** The book's Library of Congress catalog number */
	private boolean circulating; /** The book's circulation status */
}
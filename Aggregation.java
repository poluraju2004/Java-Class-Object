/*10.Implement a Java program that models a Library. Create classes for
Library, Book, and Author. Ensure that the Library class aggregates a
collection of Book objects, and each Book object has an aggregation
relationship with an Author object.*/


class Author{
	private int authorId;
	private String authorName;

	void Author(int a,String an){
		authorId = a;
		authorName = an;
	}

	public void getAuthor(){
		System.out.println("authorid " + authorId+" name " + authorName);
	}
}
class Book{
	private int bid;
	private String bname;
	Author author;

	void Book(int bid,String bname,Author author){
		this.bid = bid;
		this.bname = name;
		this.author = author;

	}
	void getBook(){
		System.out.print("Bookid " + bid + " Name = "+bname);
	}
}

public class Aggregation{
	
}
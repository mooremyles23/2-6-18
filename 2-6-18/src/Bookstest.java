
public class Bookstest {
	public static void main(String[] args) {
		
		Books Books1 = new Books ("Basketball", 1996, 48215, 15);
		System.out.println(Books1.BookAuthor);
		System.out.println(Books1.BookYearPublish);	
		System.out.println(Books1.BookISBNNumber);			
		System.out.println(Books1.BookPrice);			
			
		Books Books2 = new Books ("Football", 1999, 48137, 22);
		System.out.println(Books2.BookAuthor);
		System.out.println(Books2.BookYearPublish);	
		System.out.println(Books2.BookISBNNumber);			
		System.out.println(Books2.BookPrice);	
		}
}

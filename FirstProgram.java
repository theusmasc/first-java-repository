package dio.com;

import dio.com.model.Cat;

public class FirstProgram {
	
	public static void main(String[] args) {
		
		Cat cat = new Cat();
		Book book = new Book();
		
		System.out.println(cat);
		System.out.println(book);
	}
}

class Book{
	public String Book;
	public Integer numPaginas;
}
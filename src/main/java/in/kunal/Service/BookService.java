package in.kunal.Service;

import java.util.List;

import in.kunal.Entity.Book;

public interface BookService {
	
	
	public boolean savebook(Book book);
	
	public List<Book> getallbooks();

}

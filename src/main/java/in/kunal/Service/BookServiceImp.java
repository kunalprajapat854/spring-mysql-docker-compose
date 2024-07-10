package in.kunal.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.kunal.Entity.Book;
import in.kunal.Repository.BookRepo;

@Service
public class BookServiceImp implements BookService {

	@Autowired
	private BookRepo bookrepo;

	public boolean savebook(Book book) {
		Book save = bookrepo.save(book);
//		  if(save!=null) {
//			  return true;
//		  } else {
//			  return false;
		return save != null;
	}

	public List<Book> getallbooks() {
		return bookrepo.findAll();
	}

}

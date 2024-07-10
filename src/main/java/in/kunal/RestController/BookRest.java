package in.kunal.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.kunal.Entity.Book;
import in.kunal.Service.BookService;

@RestController
public class BookRest {

	@Autowired
	private BookService service;

	@PostMapping("/savebook")
	public String savebook(@RequestBody Book book) {
		String msg = "";
		boolean savebook = service.savebook(book);
		if (savebook) {
			return msg = "Book Saved";
		} else {
			return msg = "Save Failed";
		}
	}

	@GetMapping("/books")
	public List<Book> getbooks() {
		List<Book> getallbooks = service.getallbooks();
		return getallbooks;
	}

}

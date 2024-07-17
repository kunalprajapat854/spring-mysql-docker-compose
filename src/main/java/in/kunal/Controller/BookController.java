package in.kunal.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.kunal.Entity.Book;
import in.kunal.Service.BookService;

@Controller
public class BookController {

	@Autowired
	private BookService bookService;

	@GetMapping("/")
	public String displayform(Model model) {
		Book bookobj = new Book();
		model.addAttribute("book", bookobj);

		List<Book> getallbooks = bookService.getallbooks();
		model.addAttribute("books", getallbooks);
		return "index";

	}

	@PostMapping("/")
	public String savebook(Model model, Book book) {
		bookService.savebook(book);

		List<Book> allbooks = bookService.getallbooks();
		model.addAttribute("books", allbooks);

		Book bookobj = new Book();
		model.addAttribute("book", bookobj);

		model.addAttribute("msg", "Book Saved Successfully");

		return "index";

	}

}

package pachetprincipal;

import java.util.List;
import java.util.Optional;

import javax.management.AttributeNotFoundException;

import org.hibernate.ObjectNotFoundException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pachetcarte.Book;
import pachetcarte.Library;
import pachetcarte.LibraryRepository;

@RestController
public class BookController {

	private final LibraryRepository repository;
	BookController(LibraryRepository repository){
		this.repository = repository;
	}
	
	@GetMapping("/library")
	List<Book> all(){
		return repository.findAll();
	}
	
	@PostMapping ("/library")
	Book newBook(@RequestBody Book newBook) {
		return repository.save(newBook);
	}
	
	@GetMapping ("/books/{id}")
	Book one (@PathVariable Long id) {
		return repository.findById(id)
				.orElseThrow(() -> new BookNotFoundException(id));
	}
	
	@PutMapping("/books/{id}")
	  Book replaceBook(@RequestBody Book newBook, @PathVariable Long id) {
	    
	    return repository.findById(id)
	      .map(book -> {
	        book.setAuthor(newBook.getAuthor());
	        return repository.save(book);
	      })
	      .orElseGet(() -> {
	        newBook.setId(id);
	        return repository.save(newBook);
	      });
	  }
	
	@DeleteMapping("/employees/{id}")
	  void deleteEmployee(@PathVariable Long id) {
	    repository.deleteById(id);
	  }
	
}
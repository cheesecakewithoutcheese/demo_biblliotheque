package pachetprincipal;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pachetadnotare.Quote;
import pachetcarte.Book;
import pachetcarte.Library;
import pachetcarte.Work;

@org.springframework.stereotype.Controller
public class Controller {

	private final AtomicLong counter = new AtomicLong();
	//static Library library = new Library();

	 @GetMapping("/library")
		public String library(@RequestParam(name="name", required=false, defaultValue="anonim") String name, Model model) {
			model.addAttribute("nume", name);
			String s = new String();
			s = new Library().toString();
			model.addAttribute("library", s);
			return "bibliotheque";
		}
	
	
	 	
}
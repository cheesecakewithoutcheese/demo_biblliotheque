package pachetprincipal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pachetcarte.Book;
import pachetcarte.LibraryRepository;

@Configuration
class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  CommandLineRunner initDatabase(LibraryRepository repository) {

    return args -> {
      log.info("Preloading " + repository.save(new Book("New Author")));
      log.info("Preloading " + repository.save(new Book("Another Author")));
    };
  }
}
package pachetcarte;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component("LibraryRepository")
public interface LibraryRepository extends JpaRepository<Book, Long> {
}

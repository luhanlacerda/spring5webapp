package lacerda.luhan.spring5webapp.repositories;

import lacerda.luhan.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}

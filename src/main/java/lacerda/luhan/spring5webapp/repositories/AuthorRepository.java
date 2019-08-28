package lacerda.luhan.spring5webapp.repositories;

import lacerda.luhan.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}

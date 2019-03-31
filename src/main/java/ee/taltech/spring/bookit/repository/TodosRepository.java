package ee.taltech.spring.bookit.repository;

import ee.taltech.spring.bookit.domain.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodosRepository extends JpaRepository<Todo, Long> {
}

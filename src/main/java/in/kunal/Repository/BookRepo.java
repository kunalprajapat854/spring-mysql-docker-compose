package in.kunal.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.kunal.Entity.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer> {

}

package ifsp.web3.todoapp.repository;

import ifsp.web3.todoapp.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
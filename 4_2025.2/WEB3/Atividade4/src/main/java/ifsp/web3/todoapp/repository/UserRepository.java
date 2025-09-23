package ifsp.web3.todoapp.repository;

import ifsp.web3.todoapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
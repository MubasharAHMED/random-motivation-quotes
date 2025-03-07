package motivation.chat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import motivation.chat.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	User findByUsername(String username); 
}

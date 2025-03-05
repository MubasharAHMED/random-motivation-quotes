package motivation.chat.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import motivation.chat.models.Message;
import motivation.chat.models.User;

@Repository
public interface MessageRepository  extends JpaRepository<Message, Integer>{
	List<Message> findByUserId(Integer userId);
}

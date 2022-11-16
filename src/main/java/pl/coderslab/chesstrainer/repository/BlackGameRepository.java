package pl.coderslab.chesstrainer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.chesstrainer.model.BlackGame;
import pl.coderslab.chesstrainer.model.User;

import java.util.List;

@Repository
public interface BlackGameRepository extends JpaRepository<BlackGame, Long> {
    BlackGame findByUser(User user);
    List<BlackGame> findAllByUser(User user);
    BlackGame findByEco(String eco);
}


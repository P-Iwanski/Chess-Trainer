package pl.coderslab.chesstrainer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.chesstrainer.model.User;
import pl.coderslab.chesstrainer.model.WhiteGame;

import java.util.List;

@Repository
public interface WhiteGameRepository extends JpaRepository<WhiteGame, Long> {
    WhiteGame findByUser(User user);
    List<WhiteGame> findAllByUser(User user);
    WhiteGame findByEco(String eco);
}

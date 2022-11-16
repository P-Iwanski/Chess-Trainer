package pl.coderslab.chesstrainer.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.coderslab.chesstrainer.model.WhiteGame;

@Repository
@Transactional
public interface WhiteGameDao extends CrudRepository<WhiteGame, Integer> {
}

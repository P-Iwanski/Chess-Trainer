package pl.coderslab.chesstrainer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.chesstrainer.model.User;
import pl.coderslab.chesstrainer.model.WhiteGame;
import pl.coderslab.chesstrainer.repository.UserRepository;
import pl.coderslab.chesstrainer.repository.WhiteGameRepository;

import java.util.List;

@Service
public class WhiteGameService {

    private WhiteGameRepository wGR;
    private UserRepository uR;
    @Autowired
    public WhiteGameService(WhiteGameRepository wGR, UserRepository uR){
        this.wGR = wGR;
        this.uR = uR;
    }
    public WhiteGame findWhiteGameByUsername(User user) {
        return wGR.findByUser(user);
    }
    public WhiteGame findWhiteGameByEco(String ECO) {
        return wGR.findByEco(ECO);
    }
    public List<WhiteGame> findAllByUser(User user) {

        return wGR.findAllByUser(user);
    }
}

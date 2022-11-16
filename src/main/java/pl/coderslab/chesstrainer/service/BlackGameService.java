package pl.coderslab.chesstrainer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.chesstrainer.model.BlackGame;
import pl.coderslab.chesstrainer.model.User;
import pl.coderslab.chesstrainer.repository.BlackGameRepository;
import pl.coderslab.chesstrainer.repository.UserRepository;

import java.util.List;

@Service
public class BlackGameService {
    private BlackGameRepository bGR;
    private UserRepository uR;

    @Autowired
    public BlackGameService(BlackGameRepository bGR, UserRepository uR){
        this.bGR = bGR;
        this.uR = uR;
    }
    public BlackGame findBlackGameByUsername(User user) {
        return bGR.findByUser(user);
    }
    public BlackGame findBlackGameByEco(String ECO) {
        return bGR.findByEco(ECO);
    }
    public List<BlackGame> findAllByUser(User user) {

        return bGR.findAllByUser(user);
    }
}


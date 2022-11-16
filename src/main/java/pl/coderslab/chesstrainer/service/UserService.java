package pl.coderslab.chesstrainer.service;

import pl.coderslab.chesstrainer.model.User;
import pl.coderslab.chesstrainer.model.dto.RegisterDto;

import java.util.List;

public interface UserService {

    User save(User u);
    User saveAdmin(User u);
    List<User> findAll();
    User findByUsername(String username);
    User registerUser(RegisterDto dto);
}
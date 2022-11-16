package pl.coderslab.chesstrainer.service;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

public class CurrentUser extends User {
    private pl.coderslab.chesstrainer.model.User user;
    public CurrentUser(String username, String password, String lichessNick, Collection<? extends GrantedAuthority> authorities, pl.coderslab.chesstrainer.model.User user) {
        super(username, password,  authorities);
        this.user = user;
    }
    public pl.coderslab.chesstrainer.model.User getUser() {return user;}
}

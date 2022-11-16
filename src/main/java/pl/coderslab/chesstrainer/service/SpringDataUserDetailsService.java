package pl.coderslab.chesstrainer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import pl.coderslab.chesstrainer.model.Role;
import pl.coderslab.chesstrainer.model.User;
import pl.coderslab.chesstrainer.repository.UserRepository;

import java.util.HashSet;
import java.util.Set;


public class SpringDataUserDetailsService implements UserDetailsService {

    @Autowired private UserRepository repository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = repository.findByUsername(username);
        if (user == null) {throw new UsernameNotFoundException(username); }
        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        for (Role role : user.getRoles()) {
            grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
        }

        return new CurrentUser(user.getUsername(),user.getPassword(), user.getLichessNick(),
                grantedAuthorities, user);
    }
}
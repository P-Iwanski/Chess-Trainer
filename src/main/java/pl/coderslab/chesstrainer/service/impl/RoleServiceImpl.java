package pl.coderslab.chesstrainer.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.coderslab.chesstrainer.model.Role;
import pl.coderslab.chesstrainer.repository.RoleRepository;
import pl.coderslab.chesstrainer.service.RoleService;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {//implementujemy kontrakt dla serwisu roli
    // główne zalety to łatwiejsza możliwość testowania serwisów
    // późniejsze możliwości rozwoju dzięki przesłanianiu przez interfejs
    // (możemy stworzyć nowy serwis który działa inaczej - np laczy sie z innym kontenerem danych - a dla
    // reszty aplikacji jest to przezroczyste)
    // dodatkowo mamy zapewniona separacje miedzy warstwami aplikacji (clean architecture)

    private final RoleRepository repository;
    @Override
    public Role findByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public Role save(Role role) {
        return repository.save(role);
    }
}
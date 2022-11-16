package pl.coderslab.chesstrainer.service;

import pl.coderslab.chesstrainer.model.Role;

public interface RoleService {
    Role findByName(String name);
    Role save(Role role);
}
package ru.haazad.webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.haazad.webapp.models.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
}

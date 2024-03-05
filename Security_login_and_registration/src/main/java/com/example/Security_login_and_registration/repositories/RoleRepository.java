package com.example.Security_login_and_registration.repositories;

import com.example.Security_login_and_registration.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}

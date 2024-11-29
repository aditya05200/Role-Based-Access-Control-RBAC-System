package com.RBAC.Role_Based.Access.Control.repository;

import com.RBAC.Role_Based.Access.Control.entity.OurUsers;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepo extends JpaRepository<OurUsers, Integer> {

    Optional<OurUsers> findByEmail(String email);
}

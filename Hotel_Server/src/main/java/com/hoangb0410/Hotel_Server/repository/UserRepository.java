package com.hoangb0410.Hotel_Server.repository;

import com.hoangb0410.Hotel_Server.entity.User;
import com.hoangb0410.Hotel_Server.enums.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findFirstByEmail(String email);

    Optional<User> findByUserRole(UserRole userRole);

}

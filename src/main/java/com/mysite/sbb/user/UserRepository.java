package com.mysite.sbb.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Site_User, Long> {
    Optional<Site_User> findByusername(String username);
}

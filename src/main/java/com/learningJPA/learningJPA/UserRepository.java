package com.learningJPA.learningJPA;

import com.learningJPA.learningJPA.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

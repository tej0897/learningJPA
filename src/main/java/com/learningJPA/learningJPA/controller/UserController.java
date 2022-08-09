package com.learningJPA.learningJPA.controller;

import com.learningJPA.learningJPA.Entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;


@Transactional
@Repository
public class UserController {
    @PersistenceContext
    private EntityManager entityManager;

    public long insertUser(User user) {
        entityManager.persist(user);
        return user.getId();
    }
}

package com.learningJPA.learningJPA;

import com.learningJPA.learningJPA.Entity.User;
import com.learningJPA.learningJPA.controller.UserController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserRepoCommandLineRunner implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    private static final Logger log = LoggerFactory.getLogger(UserRepoCommandLineRunner.class);

    @Override
    public void run(String... args) throws Exception {

        User user = new User("Vyk", "Admin");
        userRepository.save(user);
        log.info("New User Created: "+user);

        List<User> allUsers = userRepository.findAll();
        log.info("List of all Users is: "+allUsers);

        Optional<User> userWithIdOne = userRepository.findById(1L);
        log.info("User with the ID 1 : " + userWithIdOne);

    }
}
